
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;


public class Conectar {
    
    public static void main (String[] args){
        Connection con = null;
        PreparedStatement ps = null;
        Cliente cliente = null;
        ResultSet rs = null;
        
        con = Conexion.getConexion();
        String sql = "INSERT INTO cliente(dni, nombre_completo, telefono, edad, afecciones, estado) VALUES(?,?,?,?,?,?)";
            
        try{
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            sql = "SELECT * FROM cliente";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cliente = new Cliente();
                cliente.setCodCli(rs.getInt("codCli"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setNombreCompleto(rs.getString("nombre_completo"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEdad(rs.getInt("edad"));
                cliente.setAfecciones(rs.getString("afecciones"));
                cliente.setEstado(rs.getBoolean("estado"));
                
                
                
                System.out.println(cliente);
                
        }     
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
}
