/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emira
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Servidor {
    public static void main(String[] args) {
        final int PORT = 12345;

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor iniciado. Esperando conexiones...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                        InputStream inputStream = clientSocket.getInputStream();
                        OutputStream outputStream = clientSocket.getOutputStream()) {

                    byte[] buffer = new byte[1024];
                    int bytesRead = inputStream.read(buffer);

                    if (bytesRead != -1) {
                        String receivedMessage = new String(buffer, 0, bytesRead);
                        System.out.println("Mensaje recibido del cliente: " + receivedMessage);

                        // Convertir el mensaje a JSON
                        ObjectMapper mapper = new ObjectMapper();
                        String jsonMessage = mapper.writeValueAsString(receivedMessage);

                        // Guardar el mensaje JSON en un archivo
                        guardarMensajeEnArchivo(jsonMessage, "mensaje.json");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void guardarMensajeEnArchivo(String mensaje, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(mensaje);
            System.out.println("Mensaje guardado en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
