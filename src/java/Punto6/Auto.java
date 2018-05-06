/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

import java.io.Serializable;

/**
 *
 * @author dhal_
 */
public class Auto implements Serializable {
     private String patente;
    private int modelo;
    private String marca;
    private String color;
    private String tipoCombustible;
    
    public Auto(){
        
    }

    public Auto(String patente, int modelo, String marca, String color, String tipoCombustible) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
    }
    

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tipoCombustible
     */
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * @param tipoCombustible the tipoCombustible to set
     */
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}
