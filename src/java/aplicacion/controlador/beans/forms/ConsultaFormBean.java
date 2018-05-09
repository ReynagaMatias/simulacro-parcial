/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

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
public class ConsultaFormBean {
    private GestorLibro gestor;
    private String tituloBuscado;
    private Libro libroBuscado;

    /**
     * Creates a new instance of ConsultaFormBean
     */
    public ConsultaFormBean() {
        gestor = new GestorLibro();
        libroBuscado = new Libro();
    }

    public ConsultaFormBean(GestorLibro gestor, String tituloBuscado, Libro libroBuscado) {
        this.gestor = gestor;
        this.tituloBuscado = tituloBuscado;
        this.libroBuscado = libroBuscado;
    }

    public GestorLibro getGestor() {
        return gestor;
    }

    public void setGestor(GestorLibro gestor) {
        this.gestor = gestor;
    }

    public String getTituloBuscado() {
        return tituloBuscado;
    }

    public void setTituloBuscado(String tituloBuscado) {
        this.tituloBuscado = tituloBuscado;
    }

    public Libro getLibroBuscado() {
        return libroBuscado;
    }

    public void setLibroBuscado(Libro libroBuscado) {
        this.libroBuscado = libroBuscado;
    }
    
    
    public void busquedaTitulo(){
        if(tituloBuscado!=null){
            libroBuscado = gestor.BuscarLibro(tituloBuscado);
        }
    }
    
}
