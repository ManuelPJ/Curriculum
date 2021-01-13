/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.*;
import java.sql.*;

/**
 *
 * @author MyC
 */
public class DEF {
protected Connection conexiones = null;
 private final String URL_BDD = "jdbc:mysql://localhost:3307/departamento";
 private final String USUARIO = "root";
 private final String CONTRASEÑA = "";
 private final String DRIVER = "com.mysql.cj.jdbc.Driver";

 public void conectarBBDD() {
   try {
       Class.forName(DRIVER);
       conexiones = DriverManager.getConnection(URL_BDD, USUARIO, CONTRASEÑA);
   } catch (SQLException ex) {
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

    public void start() throws Exception {
        JFrame frame = new JFrame("Contacto");
        Interfaz inter = new Interfaz();
        frame.dispose();
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.add(inter);
        frame.setVisible(true);

    }

 public static void main(String[] args) throws Exception{
     DEF definitivo = new DEF();
     definitivo.conectarBBDD();
     definitivo.start();
 }
}
