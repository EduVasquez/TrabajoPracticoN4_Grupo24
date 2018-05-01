/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6;

/**
 *
 * @author dhal_
 */
public class Auto { // Creamos la clase auto y definimos las variables que vamos a usar
  
    private String patente;
    private int modelo;
    private String marca;
    private String color;
    private String tipoCombustible;
    
    public Auto(){ // Constructor 1
        
    }
    
    /**
 
     * @param patente
     * @param modelo
     * @param marca
     * @param color
     * @param tipoCombustible
     */
    public Auto( String patente, int modelo, String marca, String color, String tipoCombustible){ // Constructor 2
  
        this.patente=patente;
        this.modelo=modelo;
        this.marca=marca;
        this.color=color;
        this.tipoCombustible=tipoCombustible;
    }
    
    /**
     * metodo mostrarDatos
     */
    /*public void mostrarDatos(){ // Método que mostrará todas las variables del auto
         System.out.println(getNombre() + "        " +getPatente() +"         " +getModelo() + "       " +getMarca() + "         " +getColor() + "         " +getTipoCombustible());;
    }*/
    
  
    
    /**
     * @return el valor de patente
     */
    public String getPatente(){
        return patente;
    }
    
    /**
     * @return el valor de modelo
     */
    public int getModelo(){
        return modelo;
    }
    
    /**
     * @return el valor de marca
     */
    public String getMarca(){
        return marca;
    }
    
    /**
     * @return el valor de color
     */
    public String getColor(){
        return color;
    }
    
    /**
     * @return el valor de tipoCombustible
     */
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    

    /**
     * @param patente
     */
    public void setPatente(String patente){
        this.patente=patente;
    }
    
    /**
     * @param modelo
     */
    public void setModelo(int modelo){
        this.modelo=modelo;
    }
    
    /**
     * @param marca
     */
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    /**
     * @param color
     */
    public void setColor(String color){
        this.color=color;
    }
    
    /**
     * @param tipoCombustible
     */
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }

   
    
}
