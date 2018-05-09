/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alejandro
 */
public class Autor implements Serializable{
    private String nombre;
    private String Apellido;

    public Autor() {
    }

    public Autor(String nombre, String Apellido) {
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
}
