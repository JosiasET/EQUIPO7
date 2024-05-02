package trabajofinallira;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.net.*;
import java.util.*;


public class Servidor {
    
    private static final int PUERTO = 12345;
    private static HashSet<PrintWriter> clientesConectados = new HashSet<>();
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(PUERTO);
        System.out.println("Servidor en línea en el puerto " + PUERTO);

        while (true) {
            Socket cliente = servidor.accept();
            System.out.println("Nuevo cliente conectado: " + cliente);

            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true);
            clientesConectados.add(escritor);

            new Thread(new ManejadorCliente(cliente, escritor)).start();
        }
    }

    private static class ManejadorCliente implements Runnable {
        private Socket cliente;
        private PrintWriter escritor;
        private BufferedReader lector;

        public ManejadorCliente(Socket socket, PrintWriter escritor) {
            this.cliente = socket;
            this.escritor = escritor;
            try {
                this.lector = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

                String mensaje;
                while ((mensaje = lector.readLine()) != null) {
                    System.out.println("Mensaje recibido de cliente: " + mensaje);

                    // Convertir mensaje a formato JSON
                    String mensajeJSON = convertirAMensajeJSON(mensaje);
                    System.out.println("Mensaje en formato JSON: " + mensajeJSON);

                    // Guardar mensaje en un archivo
                    guardarMensajeEnArchivo(mensajeJSON, "mensajes.txt");

                    enviarMensajeAClientes(mensaje);
                }
            } catch (IOException e) {
                System.out.println("Cliente desconectado: " + cliente);
            } finally {
                if (escritor != null) {
                    clientesConectados.remove(escritor);
                }
                try {
                    cliente.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private String convertirAMensajeJSON(String mensaje) {
            try {
                return objectMapper.writeValueAsString(mensaje);
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        private void guardarMensajeEnArchivo(String mensaje, String nombreArchivo) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
                writer.write(mensaje);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void enviarMensajeAClientes(String mensaje) {
            for (PrintWriter escritor : clientesConectados) {
                escritor.println(mensaje);
            }
        }
    }
}