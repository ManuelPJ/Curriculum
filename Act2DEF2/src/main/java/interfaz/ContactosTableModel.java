/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import codigo.Contacto;
import codigo.MariaDBINTEX;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MyC
 */


public class ContactosTableModel extends AbstractTableModel {
    private List<Contacto> contactos;
    private MariaDBINTEX intex = new MariaDBINTEX();

    public void cargarDatos(){
        contactos = intex.obtenerTodos();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "idcontacto";
            case 1:
                return "nombre";
            case 2:
                return "apellidos";
            case 3:
                return "telefono";
            case 4:
                return "email";
            case 5:
                return "fechanac";
            default:
                return null;
        }
    }

    
    
    @Override
    public int getRowCount() {
        return contactos.size();
    }

    @Override
    public int getColumnCount() {
    return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Contacto c = contactos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.setIdcontacto();
            case 1:
                return c.getNombre();
            case 2:
                return c.getApellidos();
            case 3:
                return c.getTelefono();
            case 4:
                return c.getEmail();
            case 5:
                return c.getFechaEntrada();
            default:
                return null;
        }
        }
    
    
}
