/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *
 * @author Josty25
 */
public class Solicitud {
    private String nombre;
    private String apellido;
    private String tipoVehiculo;
    private String horaLavado;
    private String tipo;

    // Constructor sin argumentos
    public Solicitud() {
    }
    
    public Solicitud(String nombre, String apellido, String tipoVehiculo, String horaLavado, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoVehiculo = tipoVehiculo;
        this.horaLavado = horaLavado;
        this.tipo = tipo;
    }
    


    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getHoraLavado() {
        return horaLavado;
    }

    public void setHoraLavado(String horaLavado) {
        this.horaLavado = horaLavado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método toString para representar la solicitud como cadena
    @Override
    public String toString() {
        return "Solicitud" +
                "Nombre: " + nombre + "\n" +
                "Numero:" + apellido + "\n" +
                "Tipo de Vehiculo: " + tipoVehiculo + "\n" +
                "HoraLavado" + horaLavado + "\n" +
                "Tipo:" + tipo + "\n";
    }
}