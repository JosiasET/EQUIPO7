/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;
/**
 *
 * @author Usuario
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;
import com.google.gson.Gson;

public class Cliente {
    private Socket socket; // Variable de instancia para el socket

    // Constructor que recibe la IP y el puerto del servidor
    public Cliente(String ip, int puerto) {
        try {
            this.socket = new Socket(ip, puerto); // Conectar al servidor
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Resto de métodos de la clase...

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

    public void enviarSolicitud(Solicitud solicitud) {
        try {
            // Obtener el OutputStream para enviar datos al servidor
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter escritor = new PrintWriter(outputStream, true);

            // Convertir la solicitud a JSON
            Gson gson = new Gson();
            String json = gson.toJson(solicitud);

            // Enviar la solicitud al servidor
            escritor.println(json);

            
            escritor.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     public void recibirRespuesta() {
        try {
            // Obtener el InputStream para recibir datos del servidor
            InputStream inputStream = socket.getInputStream();
            BufferedReader lector = new BufferedReader(new InputStreamReader(inputStream));

            // Leer la respuesta del servidor
            String respuesta = lector.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);

            // Cerrar el lector y el inputStream (no cerramos el socket en este método)
            lector.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
