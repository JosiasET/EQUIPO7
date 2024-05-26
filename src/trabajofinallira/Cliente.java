/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import com.google.gson.Gson;

public class Cliente {
    private Socket socket;
    private String ip;
    private int puerto;

    public Cliente(String ip, int puerto) {
        this.ip = ip;
        this.puerto = puerto;
    }

    public void conectar() {
        try {
            this.socket = new Socket(ip, puerto); // Conectar al servidor
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void desconectar() {
        // Cerrar conexiones
        if (socket != null && !socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void enviar(String mensaje, String tipo) {
        try {
            // Crear una instancia de Mensaje
            Mensaje msg = new Mensaje(tipo, mensaje);

            // Convertir el mensaje a JSON
            Gson gson = new Gson();
            String json = gson.toJson(msg);

            // Obtener el OutputStream para enviar datos al servidor
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter escritor = new PrintWriter(outputStream, true);

            // Enviar el mensaje al servidor
            escritor.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String recibir() {
        String respuesta = null;
        try {
            // Obtener el InputStream para recibir datos del servidor
            InputStream inputStream = socket.getInputStream();
            BufferedReader lector = new BufferedReader(new InputStreamReader(inputStream));

            // Leer la respuesta del servidor
            respuesta = lector.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    public void enviarSolicitud(Solicitud solicitud) {
        conectar();
        Gson gson = new Gson();
        String json = gson.toJson(solicitud);
        enviar(json, "enviar_S");
        String respuesta = recibir();
        System.out.println("Respuesta del servidor: " + respuesta);
        desconectar();
    }
    
    
    public String RecibirSolicitude(){
      conectar();
      enviar("hola", "Mis_Solicitudes");
      String recibir = recibir();
      desconectar();
      return recibir;
    }

    
}

class Mensaje {
    private String tipo;
    private String mensaje;

    public Mensaje(String tipo, String mensaje) {
        this.tipo = tipo;
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMensaje() {
        return mensaje;
    }
}