
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Masajista;
    

public class MasajistaData {
    
    private Connection con = null;
    
    public MasajistaData (Conexion conexion){
        
        this.con = (Connection) conexion.getConexion();
              
        
    }
    
    public void agregarTratamiento(Masajista m){
        
        String sql = "INSERT into masajista(matricula, nombre_completo, telefono, especialidad, estado) VALUES(?,?,?,?,?)";
        
        try{
                
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, m.getMatricula());
            ps.setString(2, m.getNombre_completo());
            ps.setLong(3, m.getTelefono());
            ps.setString(4, m.getEspecialidad());
            ps.setBoolean(5, m.isEstado());
            
            
            int registros = ps.executeUpdate();
            System.out.println(registros);
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                
                System.out.println("Masajista agregado exitosamente");
                
            } else{
                
                System.out.println("Error al agregar el Masajista");
                
            }
                  
        } catch(SQLException ex){
            System.out.println("Error de conexion: " + ex);
        }
              
    }
    public List<Masajista> listaMasajistaEspecialidad(String a){
            Masajista m = null;
        List<Masajista> masajistas = new ArrayList<>();
        String sql = "SELECT * from masajista WHERE especialidad= ? ";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getEspecialidad());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                m = new Masajista();
                m.setMatricula(rs.getInt("matricula"));
                m.setNombre_completo(rs.getString("nombre_completo"));
                m.setTelefono(rs.getLong("telefono"));
                m.setEspecialidad(rs.getString("especialidad"));
                m.setEstado(rs.getBoolean("estado"));
                
                
                masajistas.add(m);
                 
            }
            
            for(Masajista masajista: masajistas){
                
                System.out.println(masajista);
                 
            }
            
            ps.close();
             
        } catch(SQLException ex){
            
            System.out.println("Error al listar masajistas: " + ex);
            
        }
        
        return masajistas; 
    }
    public List<Masajista> listarMasajistas(){
        
        Masajista m = null;
        List<Masajista> masajistas = new ArrayList<>();
        String sql = "SELECT * from masajista";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                m = new Masajista();
                m.setMatricula(rs.getInt("matricula"));
                m.setNombre_completo(rs.getString("nombre_completo"));
                m.setTelefono(rs.getLong("telefono"));
                m.setEspecialidad(rs.getString("especialidad"));
                m.setEstado(rs.getBoolean("estado"));
                
                
                masajistas.add(m);
                 
            }
            
            for(Masajista masajista: masajistas){
                
                System.out.println(masajista);
                 
            }
            
            ps.close();
             
        } catch(SQLException ex){
            
            System.out.println("Error al listar masajistas: " + ex);
            
        }
        
        return masajistas; 
    }
    
    public void actualizarMasajista(Masajista m){
        
        String sql = "UPDATE masajista SET nombre_completo = ?, telefono = ?, especialidad = ?, estado = ? WHERE matricula = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, m.getNombre_completo());
            ps.setLong(2, m.getTelefono());
            ps.setString(3, m.getEspecialidad());
            ps.setBoolean(4, m.isEstado());
            ps.setInt(5, m.getMatricula());
            
            
            ps.executeUpdate();
            ps.close();
            System.out.println("Masajista actualizado correctamente");
            
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar masajista: " + ex);
        }  
    }
    
    public Masajista buscarMasajista(int matricula){
        Masajista m = null;
        String sql = "SELECT * FROM masajista WHERE matricula = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, matricula);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                m = new Masajista();
                m.setMatricula(rs.getInt("matricula"));
                m.setNombre_completo(rs.getString("nombre_completo"));
                m.setTelefono(rs.getLong("telefono"));
                m.setEspecialidad(rs.getString("especialidad"));
                m.setEstado(rs.getBoolean("estado"));
                
            }
            System.out.println(m.toString());
            
            
        } catch (SQLException ex) {
            System.out.println("No existe esa matricula" + ex);
        }
        
        return m;
    }
    
    public void eliminarMasajista(int matricula){
        
        String sql = "DELETE from masajista WHERE matricula = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, matricula);
            ps.executeUpdate();
            ps.close();
            System.out.println("Masajista eliminado correctamente");
            
            
            
            
        } catch(SQLException ex){
            
            System.out.println("Error al eliminar el masajista: " + ex);
            
        }
                       
    }
    
    public void altaLogica(Masajista m){
        
        String sql = "UPDATE masajista SET estado=1 WHERE matricula=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getMatricula());
            ps.executeUpdate();
            ps.close();
            System.out.println("Masajista dado de alta correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
        
        
    }
    
    public void bajaLogica(Masajista m){
        
        String sql = "UPDATE masajista SET estado=0 WHERE matricula=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getMatricula());
            ps.executeUpdate();
            ps.close();
            System.out.println("Masajista dado de baja correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
