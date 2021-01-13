/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Objects;

/**
 *
 * @author MyC
 */
public class Contacto {
    private long idcontacto;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String email;
    private String fechaEntrada;

    
    public Contacto() {
        
        nombre = "";
        apellidos = "";
        telefono = 000000000;
        email = "";
        fechaEntrada = "";
    }
    
    
    public Contacto(long idcontacto, String nombre, String apellidos, int telefono, String email, String fechaEntrada) {
        this.idcontacto = idcontacto;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.fechaEntrada = fechaEntrada;
    }


    public long setIdcontacto() {
        return idcontacto;
    }

    public void setIdcontacto(long idcontacto) {
        this.idcontacto = idcontacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (this.idcontacto ^ (this.idcontacto >>> 32));
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.apellidos);
        hash = 53 * hash + this.telefono;
        hash = 53 * hash + Objects.hashCode(this.email);
        hash = 53 * hash + Objects.hashCode(this.fechaEntrada);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (this.idcontacto != other.idcontacto) {
            return false;
        }
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.fechaEntrada, other.fechaEntrada)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contacto{" + "idcontacto=" + idcontacto + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + ", fechaEntrada=" + fechaEntrada + '}';
    }

    
    

}
