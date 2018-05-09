/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro.aplicacion.modelo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import simulacro.aplicacion.modelo.dominio.Autor;
import simulacro.aplicacion.modelo.dominio.Libro;

/**
 *
 * @author Alejandro
 */
public class GestorLibro implements Serializable{
    private List<Libro> listaLibros = new ArrayList<>();
    private Libro libro = new Libro();
    private Autor autor = new Autor();

    public GestorLibro() {
        Autor autor1 = new Autor("Pedor", "Tarifa");
        Autor autor2 = new Autor("Hector", "Liberatori");
        Autor autor3 = new Autor("Juan", "Perez");
        Autor autor4 = new Autor("Alvaro", "Ustarez");
        Autor autor5 = new Autor("Carlos", "Cabral");
        Autor autor6 = new Autor("Beto", "Mariscal");
        Autor autor7 = new Autor("Marcos", "Chiri");
        
        listaLibros.add(libro = new Libro("1", "introduccion a la inf", autor1, new Date(2013, 3, 5)));
        listaLibros.add(libro = new Libro("2", "Matematica Discreta", autor2, new Date(2002, 7, 25)));
        listaLibros.add(libro = new Libro("3", "ingenieria para todos", autor3, new Date(2008, 6, 13)));
        listaLibros.add(libro = new Libro("4", "Universo y estrellas", autor4, new Date(2009, 2, 5)));
        listaLibros.add(libro = new Libro("5", "Java para aprender", autor5, new Date(1994, 10, 24)));
        listaLibros.add(libro = new Libro("6", "Matematica Avanzada", autor6, new Date(1830, 4, 3)));
        listaLibros.add(libro = new Libro("7", "Informatica en Avance", autor7, new Date(2013, 11, 30)));
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public Libro BuscarLibro(String tituloBuscado){
        Libro libroBuscado = new Libro();
        for(int i = 0 ; i< listaLibros.size();i++){
            if(listaLibros.get(i).getTitulo().equals(tituloBuscado)){
                libroBuscado = listaLibros.get(i);
            }
        }
        return libroBuscado;
    }
    
    public void modificar(Libro libroSeleccionado){
        for(int i = 0;i<listaLibros.size();i++){
            if(listaLibros.get(i).equals(libroSeleccionado)){
                listaLibros.set(i, libroSeleccionado);
            }
        }
    }
}
