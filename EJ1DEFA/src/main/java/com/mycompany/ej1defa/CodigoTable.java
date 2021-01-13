/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ej1defa;

import javax.swing.table.AbstractTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MyC
 */
    public class CodigoTable extends AbstractTableModel {

    public void cargarDatos(){
       codigos();
    }
 ArrayList<Codigo> ListadoCodigo = new ArrayList<>();
    public ArrayList<Codigo> codigos()
{
     DEF definitivo = new DEF();
     definitivo.conectarBBDD();
     String consulta = "SELECT * FROM departamento";

try {
            PreparedStatement preSt = definitivo.conexiones.prepareStatement(consulta);
            preSt.execute();
 
          ResultSet rs = preSt.executeQuery(consulta);
            while (rs.next()) //Esta es la forma correcta de recorrer los valores obtenidos de una consulta
            {
                int id = rs.getInt("idDepartamentos");
                String Nombre = rs.getString("nombre");
                int numero = rs.getInt("Numempleado");
                String jefe = rs.getString("Jefe"); //creamos un objeto de clase Municipio y luego
                String Servicios = rs.getString("Servicios"); 
            Codigo codi = new Codigo(id, Nombre, numero, jefe, Servicios);
            ListadoCodigo.add(codi);}
        }

  
      catch (Exception e){
         System.out.println("Error en el SQL");

      }
System.out.println(ListadoCodigo);
 return ListadoCodigo;
    }

    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "idDepartamentos";
            case 1:
                return "Nombre";
            case 2:
                return "Numempleado";
            case 3:
                return "Jefe";
            case 4:
                return "Servicios";
            default:
                return null;
        }
    }

    
    
    @Override
    public int getRowCount() {
        return ListadoCodigo.size();
    }

    @Override
    public int getColumnCount() {
    return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Codigo c = ListadoCodigo.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getIdDepartamentos();
            case 1:
                return c.getNombre();
            case 2:
                return c.getNumempleado();
            case 3:
                return c.getJefe();
            case 4:
                return c.getServicios();
            default:
                return null;
        }
        }

    
}
