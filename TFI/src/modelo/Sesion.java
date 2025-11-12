
package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


public class Sesion {
    private int codSesion;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Tratamiento tratamiento;
    private Masajista masajista;
    private Instalacion instalaciones;
    private DiaDeSpa diaDeSpa;
    private boolean estado;

    public Sesion(int codSesion, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Tratamiento tratamiento, Instalacion instalaciones, DiaDeSpa diaDeSpa, boolean estado) {
        this.codSesion = codSesion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tratamiento = tratamiento;
        this.instalaciones = instalaciones;
        this.diaDeSpa = diaDeSpa;
        this.estado = estado;
    }

    
    
    
    public Sesion(int codSesion, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Tratamiento tratamiento, Masajista masajista, Instalacion instalaciones, DiaDeSpa diaDeSpa, boolean estado) {
        this.codSesion = codSesion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tratamiento = tratamiento;
        this.masajista = masajista;
        this.instalaciones = instalaciones;
        this.diaDeSpa = diaDeSpa;
        this.estado = estado;
    }


    public Sesion(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Tratamiento tratamiento, Masajista masajista, Instalacion instalaciones, DiaDeSpa diaDeSpa, boolean estado) {
        this.codSesion = -1;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tratamiento = tratamiento;
        this.masajista = masajista;
        this.instalaciones = instalaciones;
        this.diaDeSpa = diaDeSpa;
        this.estado = estado;
    }

    public Sesion(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Tratamiento tratamiento, Instalacion instalaciones, DiaDeSpa diaDeSpa, boolean estado) {
        this.codSesion = -1;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tratamiento = tratamiento;
        this.instalaciones = instalaciones;
        this.diaDeSpa = diaDeSpa;
        this.estado = estado;
    }

    
    
    

    public Sesion() {
        this.codSesion = -1;
    }

    public int getCodSesion() {
        return codSesion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public void setCodSesion(int codSesion) {
        this.codSesion = codSesion;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Masajista getMasajista() {
        return masajista;
    }

    public void setMasajista(Masajista masajista) {
        this.masajista = masajista;
    }

    public Instalacion getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(Instalacion instalaciones) {
        this.instalaciones = instalaciones;
    }

    public DiaDeSpa getDiaDeSpa() {
        return diaDeSpa;
    }

    public void setDiaDeSpa(DiaDeSpa diaDeSpa) {
        this.diaDeSpa = diaDeSpa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return "Sesion{" + "codSesion=" + codSesion + ", fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", tratamiento=" + tratamiento + ", masajista=" + masajista + ", instalaciones=" + instalaciones + ", diaDeSpa=" + diaDeSpa + ", estado=" + estado + '}';
    }
    
    
    
    
    
}


