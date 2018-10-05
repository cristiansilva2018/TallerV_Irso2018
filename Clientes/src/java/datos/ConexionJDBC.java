package datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;



public class ConexionJDBC {

    Connection conexion = null;
    String db = "Pueba";
    String host= "localhost";
    String port = "5432";
    String user = "postgres";
    String pass ="1234";
    
    String driverDb = "org.postgres.Driver";
    String url = "jdbc:postgresql://" + host + ":" + port + "/" + db;
    
    public Connection conectar(){
        try {
        
            Class.forName(driverDb);
            conexion = DriverManager.getConnection(url, user, pass);
            if(!conexion.isClosed()){
                System.out.println("Conexion exitosa la la Base de Datos"+ db);
                    
            }return (conexion);
            
                    
        }catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(ConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        
        }
        
    }
    
    public Connection getConexion(){
    
    return conexion;
    
    }

}