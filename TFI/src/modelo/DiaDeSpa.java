
package modelo;

import java.time.LocalDate;
import java.util.List;


public class DiaDeSpa {
    private int codPack;
    private LocalDate fechaHora;
    private String preferencias;
    private Cliente cliente;
    private boolean estado;
    private List <Sesion> sesiones;
    private double monto;

    public DiaDeSpa(int codPack, LocalDate fechaHora, String preferencias, Cliente cliente, boolean estado, List<Sesion> sesiones, double monto) {
        this.codPack = codPack;
        this.fechaHora = fechaHora;
        this.preferencias = preferencias;
        this.cliente = cliente;
        this.estado = estado;
        this.sesiones = sesiones;
        this.monto = monto;
    }

    public DiaDeSpa(LocalDate fechaHora, String preferencias, Cliente cliente, boolean estado, List<Sesion> sesiones, double monto) {
        this.codPack = -1;
        this.fechaHora = fechaHora;
        this.preferencias = preferencias;
        this.cliente = cliente;
        this.estado = estado;
        this.sesiones = sesiones;
        this.monto = monto;
    }

    public DiaDeSpa() {
        this.codPack = -1;
    }

    public int getCodPack() {
        return codPack;
    }

    public void setCodPack(int codPack) {
        this.codPack = codPack;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "DiaDeSpa{" + "codPack=" + codPack + ", fechaHora=" + fechaHora + ", preferencias=" + preferencias + ", cliente=" + cliente + ", estado=" + estado + ", sesiones=" + sesiones + ", monto=" + monto + '}';
    }
    
    
    
}
