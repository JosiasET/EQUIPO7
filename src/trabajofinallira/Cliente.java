/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;
/**
 *
 * @author Usuario
 */

public class Cliente {
    private String nombre;
    private String apellido;
    private String tipoVehiculo;
    private String horaLavado;

    // Constructor
    public Cliente(String nombre, String apellido, String tipoVehiculo, String horaLavado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoVehiculo = tipoVehiculo;
        this.horaLavado = horaLavado;
    }

    // Getters y Setters para todos los atributos

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

    @Override
    public String toString() {
        return "\nCliente: " +
                "\nnombre: " + nombre +
                "\napellido: " + apellido+
                "\ntipoVehiculo: " + tipoVehiculo +
                "\nhoraLavado: " + horaLavado ;
    }
}
