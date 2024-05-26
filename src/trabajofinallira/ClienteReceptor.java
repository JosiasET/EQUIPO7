/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;

/**
 *
 * @author Josty25
 */
import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteReceptor {

    private Socket socket;
    private BufferedReader entrada;

    public void recibirMensajes(String direccionServidor, int puerto, JTextArea textArea) {
        try {
            socket = new Socket(direccionServidor, puerto);
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Conectado al servidor en " + direccionServidor + ":" + puerto);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    String mensaje;
                    try {
                        while ((mensaje = entrada.readLine()) != null) {
                            mostrarMensaje(textArea, mensaje);
                        }
                    } catch (IOException e) {
                        System.err.println("Error al recibir mensajes: " + e.getMessage());
                    } finally {
                        cerrarConexion();
                    }
                }
            }).start();

        } catch (IOException e) {
            System.err.println("Error al conectar con el servidor: " + e.getMessage());
        }
    }

    private void mostrarMensaje(JTextArea textArea, String mensaje) {
        // Actualizar el JTextArea con el mensaje recibido
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                textArea.append(mensaje + "\n");
            }
        });
    }

    private void cerrarConexion() {
        try {
            if (entrada != null) entrada.close();
            if (socket != null) socket.close();
            System.out.println("Conexión cerrada.");
        } catch (IOException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}