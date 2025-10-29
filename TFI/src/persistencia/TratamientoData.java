
package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Tratamiento;


public class TratamientoData {
    
    
    private Connection con = null;
    
    public TratamientoData (Conexion conexion){
        
        this.con = (Connection) conexion.getConexion();
              
        
    }
    
    public void agregarTratamiento(Tratamiento t){
        
        String sql = "INSERT into tratamiento(nombre, tipo, detalle,producto, duracion, costo, estado) VALUES(?,?,?,?,?,?,?)";
        
        try{
                
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getTipo());
            ps.setString(3, t.getDetalle());
            ps.setString(4, t.getProductos());
            ps.setInt(5, t.getDuracion());
            ps.setDouble(6, t.getCosto());
            ps.setBoolean(7, t.getActivo());
            
            int registros = ps.executeUpdate();
            System.out.println(registros);
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                
                t.setCodTratam(rs.getInt(1));
                System.out.println("Tratamiento agregado exitosamente");
                
            } else{
                
                System.out.println("Error al agregar el tratamiento");
                
            }
                  
        } catch(SQLException ex){
            System.out.println("Error de conexion: " + ex);
        }
              
    }
    

    
    public List<Tratamiento> listarTratamientoTipo(String tp){
        Tratamiento t = null;
        List<Tratamiento> tratamientos = new ArrayList<>();
        String sql = "SELECT * from tratamiento WHERE tipo = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setString(1, tp);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                t = new Tratamiento();
                t.setCodTratam(rs.getInt("codTratamiento"));
                t.setNombre(rs.getString("nombre"));
                t.setTipo(rs.getString("tipo"));
                t.setDetalle(rs.getString("detalle"));
                t.setProductos(rs.getString("producto"));
                t.setDuracion(rs.getInt("duracion"));
                t.setCosto(rs.getDouble("costo"));
                t.setActivo(rs.getBoolean("estado"));
                
                
                tratamientos.add(t);
                 
            }
            
            for(Tratamiento tratamiento: tratamientos){
                
                System.out.println(tratamiento);
                 
            }
            
            ps.close();
             
        } catch(SQLException ex){
            
            System.out.println("Error al listar tratamientos: " + ex);
            
        }
        
        return tratamientos; 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Tratamiento buscarTratamiento(int codTratam){
        Tratamiento t = null;
        String sql = "SELECT * FROM tratamiento WHERE codTratamiento = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, codTratam);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                t = new Tratamiento();
                t.setCodTratam(rs.getInt("codTratamiento"));
                t.setNombre(rs.getString("nombre"));
                t.setTipo(rs.getString("tipo"));
                t.setDetalle(rs.getString("detalle"));
                t.setProductos(rs.getString("producto"));
                t.setDuracion(rs.getInt("duracion"));
                t.setCosto(rs.getDouble("costo"));
                t.setActivo(rs.getBoolean("estado"));
                
            }
            System.out.println(t.toString());
            
            
        } catch (SQLException ex) {
            System.out.println("No existe ese tratamiento" + ex);
        }
        
        return t;
    }
    
    public List<Tratamiento> listarTratamientos(){
        
        Tratamiento t = null;
        List<Tratamiento> tratamientos = new ArrayList<>();
        String sql = "SELECT * from tratamiento";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                t = new Tratamiento();
                t.setCodTratam(rs.getInt("codTratamiento"));
                t.setNombre(rs.getString("nombre"));
                t.setTipo(rs.getString("tipo"));
                t.setDetalle(rs.getString("detalle"));
                t.setProductos(rs.getString("producto"));
                t.setDuracion(rs.getInt("duracion"));
                t.setCosto(rs.getDouble("costo"));
                t.setActivo(rs.getBoolean("estado"));
                
                tratamientos.add(t);
                 
            }
            
            for(Tratamiento tratamiento: tratamientos){
                
                System.out.println(tratamiento);
                 
            }
            
            ps.close();
             
        } catch(SQLException ex){
            
            System.out.println("Error al listar tratamientos: " + ex);
            
        }
        
        return tratamientos; 
    }
    
    public void actualizarTratamiento(Tratamiento t){
        
        String sql = "UPDATE tratamiento SET nombre = ?, tipo = ?, detalle = ?, producto = ?, duracion = ?, costo = ?, estado = ? WHERE cod_tratamiento = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getTipo());
            ps.setString(3, t.getDetalle());
            ps.setString(4,t.getProductos());
            ps.setInt(5, t.getDuracion());
            ps.setDouble(6, t.getCosto());
            ps.setBoolean(7, t.getActivo());
            
            
            ps.executeUpdate();
            ps.close();
            System.out.println("Tratamiento actualizado correctamente");
            
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar tratamiento: " + ex);
        }  
    }
    
    public void eliminarTratamiento(String nombre){
        
        String sql = "DELETE from tratamiento WHERE nombre = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.executeUpdate();
            ps.close();
            System.out.println("Tratamiento eliminado correctamente");
            
            
            
            
        } catch(SQLException ex){
            
            System.out.println("Error al eliminar el tratamiento: " + ex);
            
        }
                       
    }
    
    public void altaLogica(Tratamiento t){
        
        String sql = "UPDATE tratamiento SET estado=1 WHERE nombre=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.executeUpdate();
            ps.close();
            System.out.println("Tratamiento dado de alta correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
        
        
    }
    
    public void bajaLogica(Tratamiento t){
        
        String sql = "UPDATE tratamiento SET estado=0 WHERE nombre=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getNombre());
            ps.executeUpdate();
            ps.close();
            System.out.println("Tratamiento dado de  correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
        
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
