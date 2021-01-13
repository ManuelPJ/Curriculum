/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.List;


/**
 *
 * @author MyC
 */
public interface ContactoINTEX {


  public List<Contacto> obtenerTodos(); 
  public void insertar(Contacto contacto); 
  public void eliminar(Long idcontacto);
  public Contacto obtenerContacto(Long idcontacto);

}
