
package persistencia;

import java.sql.Connection;
import modelo.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClienteData {
    
     private Connection con = null;
    
    public ClienteData (Conexion conexion){
        
        this.con = (Connection) conexion.getConexion();
              
        
    }
    
        public void agregarCliente(Cliente c){
        
        String sql = "INSERT into cliente (dni, nombre_completo, telefono, edad, afecciones, estado) VALUES(?,?,?,?,?,?)";
        
        try{
                
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, c.getDni());
            ps.setString(2, c.getNombreCompleto());
            ps.setLong(3, c.getTelefono());
            ps.setInt(4, c.getEdad());
            ps.setString(5, c.getAfecciones());
            ps.setBoolean(6, c.isEstado());
            
            int registros = ps.executeUpdate();
            System.out.println(registros);
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                
                c.setCodCli(rs.getInt(1));
                System.out.println("Cliente agregado exitosamente");
                
            } else{
                
                System.out.println("Error al agregar el cliente");
                
            }
                  
        } catch(SQLException ex){
            System.out.println("Error de conexion: " + ex);
        }
              
    }
        
        
        public void actualizarCliente(Cliente c){
        
        String sql = "UPDATE cliente SET dni = ?, nombre_completo = ?, telefono = ?, edad = ?, afecciones = ?, estado = ? WHERE codCliente = ?";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getDni());
            ps.setString(2, c.getNombreCompleto());
            ps.setLong(3, c.getTelefono());
            ps.setInt(4, c.getEdad());
            ps.setString(5, c.getAfecciones());
            ps.setBoolean(6, c.isEstado());
            ps.setInt(7, c.getCodCli());
            
            
            ps.executeUpdate();
            ps.close();
            System.out.println("cliente actualizado correctamente");
            
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar cliente: " + ex);
        }  
    }
        
         public void eliminarCliente(int codCli){
        
        String sql = "DELETE from cliente WHERE codCliente = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codCli);
            ps.executeUpdate();
            ps.close();
            System.out.println("Cliente eliminado correctamente");
            
            
            
            
        } catch(SQLException ex){
            
            System.out.println("Error al eliminar el cliente: " + ex);
            
        }
                       
    }
         
         
         public Cliente buscarCliente(int codCli){
        Cliente c = null;
        String sql = "SELECT * FROM cliente WHERE codCliente = ?";
        PreparedStatement ps;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, codCli);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                c = new Cliente();
                c.setCodCli(rs.getInt("codCliente"));
                c.setDni(rs.getInt("dni"));
                c.setNombreCompleto(rs.getString("nombre_completo"));
                c.setTelefono(rs.getLong("telefono"));
                c.setEdad(rs.getInt("edad"));
                c.setAfecciones(rs.getString("afecciones"));
                c.setEstado(rs.getBoolean("estado"));
                
            }
            System.out.println(c.toString());
            
            
        } catch (SQLException ex) {
            System.out.println("No existe ese cliente" + ex);
        }
        
        return c;
    }
    
         
         
          public List<Cliente> listarClientes(){
        
        Cliente c = null;
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * from cliente";
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                 c = new Cliente();
                c.setCodCli(rs.getInt("codCliente"));
                c.setDni(rs.getInt("dni"));
                c.setNombreCompleto(rs.getString("nombre_completo"));
                c.setTelefono(rs.getLong("telefono"));
                c.setEdad(rs.getInt("edad"));
                c.setAfecciones(rs.getString("afecciones"));
                c.setEstado(rs.getBoolean("estado"));
                
                clientes.add(c);
                 
            }
            
            for(Cliente cliente: clientes){
                
                System.out.println(clientes);
                 
            }
            
            ps.close();
             
        } catch(SQLException ex){
            
            System.out.println("Error al listar clientes: " + ex);
            
        }
        
        return clientes; 
    }
          
     public void altaLogica(Cliente c){
        
        String sql = "UPDATE cliente SET estado = 1 WHERE codCliente=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCodCli());
            ps.executeUpdate();
            ps.close();
            System.out.println("Cliente dado de alta correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
        
        
    }
    
    public void bajaLogica(Cliente c){
        
        String sql = "UPDATE cliente SET estado = 0 WHERE codCliente=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCodCli());
            ps.executeUpdate();
            ps.close();
            System.out.println("Cliente dado de baja correctamente");
            
            
            
        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }
        
             
          
          
}
}
