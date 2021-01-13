/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyC
 */
public class MariaDBINTEX extends conexion implements ContactoINTEX {

    private ResultSet resultset;

    @Override
    public List<Contacto> obtenerTodos() {
        this.conectarBBDD();
        String sql = "SELECT * FROM contactos;";
        List<Contacto> contactos = new ArrayList<>();

        try {
            PreparedStatement sentencia = conexiones.prepareStatement(sql);
            resultset = sentencia.executeQuery();
            while (resultset.next()) {
                Contacto cont = new Contacto();
                cont.setIdcontacto(resultset.getLong("idcontacto"));
                cont.setNombre(resultset.getString("nombre"));
                cont.setApellidos(resultset.getString("apellidos"));
                cont.setTelefono(resultset.getInt("telefono"));
                cont.setEmail(resultset.getString("email"));
                cont.setFechaEntrada(resultset.getString("fechanac"));

                contactos.add(cont);
            }
        } catch (SQLException ex) {
        } finally {
            try {
                this.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(MariaDBINTEX.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return contactos;
    }

    @Override
    public void insertar(Contacto contacto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Long idcontacto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Contacto obtenerContacto(Long idcontacto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        List<Contacto> list = new ArrayList<>();
        MariaDBINTEX intex = new MariaDBINTEX();
        list = intex.obtenerTodos();

        for (Contacto cont : list) {
            System.out.println(cont.setIdcontacto());
            System.out.println(cont.getNombre());
            System.out.println(cont.getApellidos());
            System.out.println(cont.getEmail());
            System.out.println(cont.getFechaEntrada());
            System.out.println(cont.getTelefono());

        }
    }

}
