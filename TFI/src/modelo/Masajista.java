
package modelo;
import java.util.Objects;

public class Masajista {
   
    private int matricula;
    private String nombre_completo;
    private Long telefono;
    private String especialidad;
    private boolean estado;

    public Masajista(int matricula, String nombre_completo, Long telefono, String especialidad, boolean estado) {
        this.matricula = matricula;
        this.nombre_completo = nombre_completo;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    
    public Masajista() {
        
    }

    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }


    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre_completo + " - " + especialidad;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Masajista masajista = (Masajista) o;
        
        return getMatricula() == masajista.getMatricula(); 
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(getMatricula());
    }
    
    
    

}
