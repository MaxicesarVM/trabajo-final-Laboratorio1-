
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    
    private static Conexion conexion = null;
    
    public Conexion(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
        
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Class Conexion: Error en la carga de driver");
        }
            
        
    }
    
    
    
    public static Connection getConexion(){
        Connection con = null;
        if(conexion == null){
            conexion = new Conexion();
        }
        try{
            con = DriverManager.getConnection("jdbc:mariadb://localhost/tfi- spa entre dedos", "root", "");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        return con;
    }
    
    
    
    
    
    
    
    
}
