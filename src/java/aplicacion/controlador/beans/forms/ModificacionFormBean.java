/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import simulacro.aplicacion.modelo.dominio.Libro;
import simulacro.aplicacion.modelo.utils.GestorLibro;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class ModificacionFormBean implements Serializable{
    private GestorLibro gestorLibro = new GestorLibro();
    private Libro libroSeleccionado = new Libro();

    /**
     * Creates a new instance of ModificacionFormBean
     */
    public ModificacionFormBean() {
    }

    public GestorLibro getGestorLibro() {
        return gestorLibro;
    }

    public void setGestorLibro(GestorLibro gestorLibro) {
        this.gestorLibro = gestorLibro;
    }

    public Libro getLibroSeleccionado() {
        return libroSeleccionado;
    }

    public void setLibroSeleccionado(Libro libroSeleccionado) {
        this.libroSeleccionado = libroSeleccionado;
    }
    
    public void seleccionarLibro(Libro libro){
        this.libroSeleccionado = libro;
    }
    
    public void modificarLibro(){
        gestorLibro.modificar(libroSeleccionado);
    }
}
