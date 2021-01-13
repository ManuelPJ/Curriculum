/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ej1defa;

/**
 *
 * @author MyC
 */
public class Codigo {
    private int idDepartamentos;
    private String Nombre;
    private int Numempleado;
    private String Jefe;
    private String Servicios;
        
        public Codigo(int idDepartamentos, String Nombre, int Numempleado, String Jefe, String Servicios) {
            this.idDepartamentos = idDepartamentos;
            this.Nombre = Nombre;
            this.Numempleado = Numempleado;
            this.Jefe = Jefe;
            this.Servicios = Servicios;
        }
        
        


    //Getters y Setters

        public int getIdDepartamentos() {
            return idDepartamentos;
        }

        public void setIdDepartamentos(int idDepartamentos) {
            this.idDepartamentos = idDepartamentos;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public int getNumempleado() {
            return Numempleado;
        }

        public void setNumempleado(int Numempleado) {
            this.Numempleado = Numempleado;
        }

        public String getJefe() {
            return Jefe;
        }

        public void setJefe(String Jefe) {
            this.Jefe = Jefe;
        }

        public String getServicios() {
            return Servicios;
        }

        public void setServicios(String Servicios) {
            this.Servicios = Servicios;
        }

    @Override
    public String toString() {
        return "Codigo{" + "idDepartamentos=" + idDepartamentos + ", Nombre=" + Nombre + ", Numempleado=" + Numempleado + ", Jefe=" + Jefe + ", Servicios=" + Servicios + '}';
    }
        
        
    }
    
