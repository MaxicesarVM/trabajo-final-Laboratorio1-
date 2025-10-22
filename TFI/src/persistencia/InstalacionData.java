
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Instalacion;
import modelo.Masajista;


public class InstalacionData {
    
    
    
    private Connection con = null;
    
    public InstalacionData (Conexion conexion){
        
        this.con = (Connection) conexion.getConexion();
              
        
    }
    
    
    /*
    buscar 
    actualizar
    alta y baja
    listar
    */
    
    public Instalacion buscarInstalacion(int codInstal){
        Instalacion i = null;
        String sql = "SELECT * FROM instalacion WHERE codInstalacion = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, codInstal);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                i = new Instalacion();
                i.setCodInstal(rs.getInt("codInstalacion"));
                i.setNombre(rs.getString("nombre"));
                i.setDetalleUso(rs.getString("detalle"));
                i.setPrecio30m(rs.getDouble("precio"));
                i.setEstado(rs.getBoolean("estado"));
                
            }
            System.out.println(i.toString());
            
            
        } catch (SQLException ex) {
            System.out.println("No existe esa matricula" + ex);
        }
        
        return i;
    }
    
    
    public void actualizarInstalacion(Instalacion i){
        
        String sql = "UPDATE instalacion SET codInstalacion = ?, nombre = ?, detalle = ?, precio = ?, estado = ? WHERE codInstalacion = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getCodInstal());
            ps.setString(2, i.getNombre());
            ps.setString(3, i.getDetalleUso());
            ps.setDouble(4, i.getPrecio30m());
            ps.setBoolean(5, i.isEstado());
            
            
            ps.executeUpdate();
            ps.close();
            System.out.println("Instalacion actualizada correctamente");
            
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar instalacion: " + ex);
        }  
    }
    
    
    public List<Instalacion> listarInstalacion(){
        
        Instalacion i = null;
        List<Instalacion> instalaciones = new ArrayList<>();
        String sql = "SELECT * from instalacion";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                i = new Instalacion();
                i.setCodInstal(rs.getInt("codInstalacion"));
                i.setNombre(rs.getString("nombre"));
                i.setDetalleUso(rs.getString("detalle"));
                i.setPrecio30m(rs.getDouble("precio"));
                i.setEstado(rs.getBoolean("estado"));
                
                
                instalaciones.add(i);
                 
            }
            
            for(Instalacion instalacion: instalaciones){
                
                System.out.println(instalacion);
                 
            }
            
            ps.close();
             
        } catch(SQLException ex){
            
            System.out.println("Error al listar instalaciones: " + ex);
            
        }
        
        return instalaciones; 
    }
    
    public void altaLogica(Instalacion i){
        
        String sql = "UPDATE instalacion SET estado=1 WHERE codInstalacion = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getCodInstal());
            ps.executeUpdate();
            ps.close();
            System.out.println("Instalacion dada de alta correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
        
        
    }
    
    public void bajaLogica(Instalacion i){
        
        String sql = "UPDATE instalacion SET estado=0 WHERE codInstalacion = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i.getCodInstal());
            ps.executeUpdate();
            ps.close();
            System.out.println("Instalacion dada de alta correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
