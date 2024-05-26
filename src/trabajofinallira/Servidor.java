/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.google.gson.Gson;

public class Servidor {
    
    private static final int PUERTO = 1020;
    private static ExecutorService pool; // Pool de hilos para manejar las conexiones de los clientes
    String ruta;

    private static void procesarCliente(Socket cliente, PrintWriter escritor) {
        try {
            BufferedReader lector = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

            String mensaje;
            while ((mensaje = lector.readLine()) != null) {
                guardarMensajeJson(mensaje);
                escritor.println("Mensaje recibido correctamente.");
            }
        } catch (IOException e) {
            System.out.println("Cliente desconectado: " + cliente);
        } finally {
            try {
                cliente.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void guardarMensajeJson(String mensaje) {
        try {
            Gson gson = new Gson();
            String mensajeJson = gson.toJson(mensaje);
            
            FileWriter escritor = new FileWriter("mensajes.txt", true);
            escritor.write(mensajeJson + "\n");
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(PUERTO);
        System.out.println("Servidor en línea en el puerto " + PUERTO);

        // Creamos un pool de hilos con un tamaño dinámico
        pool = Executors.newCachedThreadPool();

        while (true) {
            Socket cliente = servidor.accept();
            System.out.println("Nuevo cliente conectado: " + cliente);

            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true);

            // Pasamos la conexión del cliente al pool de hilos para manejarlo
            pool.execute(() -> {
                procesarCliente(cliente, escritor);
            });
        }
    }
}