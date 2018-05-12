/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1;

import aplicacion.puntouno.dominio.Temperatura;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author dhal_
 */
@ManagedBean
@RequestScoped
public class GestorTemperaturaManagedBean implements Serializable{
    
     private  Temperatura temper;
    private double num;
    private char unidadOrigen;
    private char unidadDestino;
    
    /**
     * Creates a new instance of GestorTemperaturaManagedBean
     */
    public GestorTemperaturaManagedBean() {
    }

    /**
     * @return the temper
     */
    public Temperatura getTemper() {
        return temper;
    }

    /**
     * @return the num
     */
    public double getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(double num) {
        this.num = num;
    }

    /**
     * @return the unidadOrigen
     */
    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    /**
     * @param unidadOrigen the unidadOrigen to set
     */
    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    /**
     * @return the unidadDestino
     */
    public char getUnidadDestino() {
        return unidadDestino;
    }

    /**
     * @param unidadDestino the unidadDestino to set
     */
    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    
    /**
     *
     * @return el valor de resultado
     */
    public double convertirUnidades(){
        double resultado=0;
        temper = new Temperatura();
        temper.obtenerNumero(num);
        if(unidadOrigen == 'C' && unidadDestino =='F'){
            resultado = temper.obtenerCelsiusDeFarentheit();
        }else{
            if(unidadOrigen == 'C' && unidadDestino =='K'){
               resultado = temper.obtenerCelsiusDeKelvin();
            }else{
                if(unidadOrigen == 'F' && unidadDestino =='C'){
                    resultado = temper.obtenerFarentheitDeCelsius();
                }else{
                    if(unidadOrigen == 'F' && unidadDestino =='K'){
                         resultado = temper.obtenerFarentheitDeKelvin();
                    }else{
                        if(unidadOrigen == 'K' && unidadDestino =='C'){
                            resultado = temper.obtenerKelvinDeCelsius();
                        }else{
                            if(unidadOrigen == 'K' && unidadDestino =='f'){
                                resultado = temper.obtenerKelvinDeFarentheit(); 
                            }             
                        }
                            
                    }
                }
            }
            
        }
        return resultado;
    }
}
