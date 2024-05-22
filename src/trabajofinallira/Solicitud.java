/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;


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

    public Solicitud(String nombre, String apellido, String tipoVehiculo, String horaLavado, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoVehiculo = tipoVehiculo;
        this.horaLavado = horaLavado;
        this.tipo = tipo;
    }
    
    
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
    
    public String toString() {
        return "\nSolicitud" +
                "\nnombre: " + nombre +
                "\nNumero: " + apellido +
                "\ntipoVehiculo :" + tipoVehiculo +
                "\nhoraLavado :" + horaLavado +
                "\nServicio: " + tipo;
    }
    
}