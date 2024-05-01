/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;
/**
 *
 * @author Usuario
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String nombre;
    private String apellido;
    private String tipoVehiculo;
    private Date fecha;

    // Constructor
    public Cliente() {
    }

    // Métodos getter y setter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el atributo "apellido"
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos getter y setter para el atributo "tipoVehiculo"
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    // Métodos getter y setter para el atributo "fecha"
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Método toString para representar el objeto Cliente como una cadena
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaStr = (fecha != null) ? dateFormat.format(fecha) : "Fecha no especificada";
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", fecha='" + fechaStr + '\'' +
                '}';
    }
}


   
