
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class DiaDeSpa {
    private int codPack;
    private LocalDate fecha;
    private String preferencias;
    private Cliente cliente;
    private boolean estado;
    private double monto;
    private List<Sesion> sesiones;

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
    
    public DiaDeSpa(int codPack, LocalDate fecha, String preferencias, Cliente cliente, boolean estado, double monto, List<Sesion>sesiones) {
        this.codPack = codPack;
        this.fecha = fecha;
        this.preferencias = preferencias;
        this.cliente = cliente;
        this.estado = estado;
        this.monto = monto;
        this.sesiones = sesiones;
    }
    

    public DiaDeSpa(int codPack, LocalDate fecha, String preferencias, Cliente cliente, boolean estado, double monto) {
        this.codPack = codPack;
        this.fecha = fecha;
        this.preferencias = preferencias;
        this.cliente = cliente;
        this.estado = estado;
        this.monto = monto;
        this.sesiones = new ArrayList<>();
    }
    
    

    public DiaDeSpa(LocalDate fecha, String preferencias, Cliente cliente, boolean estado, double monto) {
        this.codPack = -1;
        this.fecha = fecha;
        this.preferencias = preferencias;
        this.cliente = cliente;
        this.estado = estado;
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
   
    public DiaDeSpa() {
        this.codPack = -1;
        this.sesiones = new ArrayList<>();
    }

    public int getCodPack() {
        return codPack;
    }

    public void setCodPack(int codPack) {
        this.codPack = codPack;
    }


    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "DiaDeSpa{" + "codPack=" + codPack + ", fecha=" + fecha + ", preferencias=" + preferencias + ", cliente=" + cliente + ", estado=" + estado + ", monto=" + monto + '}';
    }

    
    
    
    
}
