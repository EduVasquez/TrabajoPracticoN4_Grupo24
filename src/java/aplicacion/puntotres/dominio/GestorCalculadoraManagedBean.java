/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntotres.dominio;

import Punto3.Calculadora;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author dhal_
 */
@ManagedBean
@RequestScoped
public class GestorCalculadoraManagedBean {

    private double numeroUno;
    private double numeroDos;
    private Calculadora calculadora;
    private char operacion;

    /**
     * Creates a new instance of GestorCalculadoraManagedBean
     */
    public GestorCalculadoraManagedBean() {
    }

    

    public double obtenerOperacion() {
        double resultado = 0.0;
        calculadora = new Calculadora();
        calculadora.obtenerNumeros(numeroUno, numeroDos);
        if(operacion == 'S'){
            resultado = calculadora.calcularSumar();
        }else{
            if(operacion == 'R'){
                resultado= calculadora.calcularRestar();
            }else{
                if(operacion == 'M'){
                   resultado = calculadora.calcularMultiplicar();  
                }else{
                    if(operacion == 'D'){
                        resultado = calculadora.calcularDividir();
                    }else{
                        resultado = calculadora.calcularPotencia();
                    }
                     
                }
            }
        }
        return resultado;
    }

    /**
     * @return the numeroUno
     */
    public double getNumeroUno() {
        return numeroUno;
    }

    /**
     * @param numeroUno the numeroUno to set
     */
    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    /**
     * @return the numeroDos
     */
    public double getNumeroDos() {
        return numeroDos;
    }

    /**
     * @param numeroDos the numeroDos to set
     */
    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    /**
     * @return the operacion
     */
    public char getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    /**
     * @return the calculadora
     */
    public Calculadora getCalculadora() {
        return calculadora;
    }

    /**
     * @param calculadora the calculadora to set
     */
    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

}
