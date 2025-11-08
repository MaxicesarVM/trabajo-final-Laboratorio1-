
package modelo;

import java.util.List;


public class Tratamiento {
    
    private int codTratam;
    private String nombre;
    private String tipo;
    private String detalle;
    private String productos;
    private int duracion; 
    private double costo;
    private boolean activo;

    public Tratamiento(int codTratam, String nombre, String tipo, String detalle, String productos, int duracion, double costo, boolean activo) {
        this.codTratam = codTratam;
        this.nombre = nombre;
        this.tipo = tipo;
        this.detalle = detalle;
        this.productos = productos;
        this.duracion = duracion;
        this.costo = costo;
        this.activo = activo;
    }
    
    public Tratamiento(String nombre, String tipo, String detalle, String productos, int duracion, double costo, boolean activo) {
        this.codTratam = -1;
        this.nombre = nombre;
        this.tipo = tipo;
        this.detalle = detalle;
        this.productos = productos;
        this.duracion = duracion;
        this.costo = costo;
        this.activo = activo;
    }
    

    public Tratamiento() {
        this.codTratam = -1;
    }

    
    
    
    public int getCodTratam() {
        return codTratam;
    }

    public void setCodTratam(int codTratam) {
        this.codTratam = codTratam;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
}
