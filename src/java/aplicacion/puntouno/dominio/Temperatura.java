/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntouno.dominio;

import java.io.Serializable;

/**
 *
 * @author dhal_
 */
public class Temperatura implements Serializable{
    private double numero;
  
    /**
     *
     */
    public Temperatura(){
   }
    
    /**
     *
     * @param numero
     */
    public void obtenerNumero(double numero){
        this.numero = numero;
    }
    
    /**
     *
     * @return el valor
     */
    public double obtenerCelsiusDeFarentheit(){
        return 1.8*numero+32;
    }

    /**
     *
     * @return el valor
     */
    public double obtenerCelsiusDeKelvin(){
        return numero+273.15;
    }
    
    /**
     *
     * @return el valor
     */
    public double obtenerFarentheitDeCelsius(){
        return (numero-32)/1.8;
    }
    
    /**
     *
     * @return el valor
     */
    public double obtenerFarentheitDeKelvin(){
        return (numero+459.67)/1.8;
    }
     
    /**
     *
     * @return el valor
     */
    public double obtenerKelvinDeCelsius(){
        return numero-273.15;
    }
    
    /**
     *
     * @return
     */
    public double obtenerKelvinDeFarentheit(){
        return 1.8*numero-459.67;
    }

    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    
}
