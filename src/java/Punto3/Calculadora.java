/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3;


/**
 *
 * @author dhal_
 */
public class Calculadora {

    private double numeroUno;
    private double numeroDos;
    
    public Calculadora(){
        
    }

    public void obtenerNumeros(double numeroUno, double numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;

    }

    public double calcularSumar() {
        return (numeroUno + numeroDos);
    }

    public double calcularRestar() {
        return (numeroUno - numeroDos);
    }

    public double calcularMultiplicar() {
        return (numeroUno * numeroDos);
    }

    public double calcularDividir() {
        do {
            return (numeroUno / numeroDos);
        } while (numeroDos == 0);

    }
    
    public double calcularPotencia() {
        return (Math.pow(numeroUno, numeroDos));
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

}
