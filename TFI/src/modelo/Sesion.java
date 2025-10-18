
package modelo;

import java.time.LocalDate;
import java.util.List;


public class Sesion {
    private int codSesion;
    private LocalDate fechaHoraInicio;
    private LocalDate fechaHoraFin;
    private Tratamiento tratamiento;
    private Masajista masajista;
    private List <Instalacion> instalaciones;
    private DiaDeSpa diaDeSpa;
    private boolean estado;
}


