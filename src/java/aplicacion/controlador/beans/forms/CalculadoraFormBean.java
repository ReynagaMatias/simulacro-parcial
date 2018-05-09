/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import simulacro.aplicacion.modelo.dominio.Calculadora;

/**
 *
 * @author Alejandro
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private Calculadora calculadora = new Calculadora();
    private int num1;
    private int num2;
    private int resultado;

    /**
     * Creates a new instance of SimulacroFormBean
     */
    public CalculadoraFormBean() {
    }

    public CalculadoraFormBean(int num1, int num2,int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

  
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int sumar(){
        return calculadora.sumar(num1, num2);
    }
}
