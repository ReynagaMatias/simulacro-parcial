/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Libro implements Serializable{
    private String ISBN;
    private String titulo;
    private Autor autor;
    private Date fechaEdicion;

    public Libro() {
        autor= new Autor();
    }

    public Libro(String ISBN, String titulo, Autor autor, Date fechaEdicion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaEdicion = fechaEdicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
