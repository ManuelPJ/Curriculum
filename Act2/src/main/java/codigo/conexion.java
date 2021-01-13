/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MyC
 */
public class conexion {
 protected Connection conexiones = null;
 private final String URL_BDD = "jdbc:mariadb://localhost:3306/contactos";  
 private final String USUARIO = "root";
 private final String CONTRASEÑA = "";
 private final String DRIVER = "org.mariadb.jdbc.Driver";

 public void conectarBBDD() {
   try {
       Class.forName(DRIVER);
       conexiones = DriverManager.getConnection(URL_BDD, USUARIO, CONTRASEÑA);
   } catch (SQLException ex) {
       Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
       System.out.println("Error al establecer conexión");

   }  
catch (ClassNotFoundException e) {
       System.out.println("Error al establecer conexión");
 e.printStackTrace();      
}
 }
 public void cerrarConexion() throws SQLException {
     if (conexiones.isClosed()){
      conexiones.close();   
     }
 }
 
}


