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
public class Calculadora implements Serializable{
    
    public int sumar(int num1, int num2){
        int suma=0;
        suma=num1+num2;
        return suma;
    }
}
