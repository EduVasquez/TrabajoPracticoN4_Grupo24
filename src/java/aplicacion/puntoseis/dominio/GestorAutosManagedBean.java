/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntoseis.dominio;

import Punto6.Auto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author dhal_
 */
@ManagedBean
@RequestScoped
public class GestorAutosManagedBean {

     private Auto[] autos = new Auto[5];
    private Auto auto;
    

    /**
     * Creates a new instance of GestorAutosManagedBean
     */
    public GestorAutosManagedBean() {
        Auto auto1 = new Auto("AA647AA", 2016, "Peugot", "Gris", "Nafta"); // Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto2 = new Auto("AB147VA", 2017, "Citroen", "Azul", "Gasoil");// Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto3 = new Auto("AB237RT", 2017, "Fiat", "Negro", "Nafta");// Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto4 = new Auto("AA456WR", 2016, "Toyota", "Marron", "Gasoil");// Creamos un objeto de la clase Auto y le damos los valores al constructor
        Auto auto5 = new Auto("AC575YU", 2018, "Ford", "Rojo", "Gns");// Creamos un objeto de la clase Auto y le damos los valores al constructor

        autos[0] = auto1;
        autos[1] = auto2;
        autos[2] = auto3;
        autos[3] = auto4;
        autos[4] = auto5;
        
      
    }
    
    public void leer(Auto autos){
        auto = autos;
        
        
    }
    
    public void modificarAuto(Auto aut){
      for(int i=0; i<autos.length; i++){
        if(aut.getPatente().equals(autos[i].getPatente())){
            autos[i].setPatente(aut.getPatente());
            autos[i].setModelo(aut.getModelo());
            autos[i].setMarca(aut.getMarca());
            autos[i].setColor(aut.getColor());
            autos[i].setTipoCombustible(aut.getTipoCombustible());
            
            
        }
    }        
    }

    /**
     * @return the autos
     */
    public Auto[] getAutos() {
        return autos;
    }

    /**
     * @param autos the autos to set
     */
    public void setAutos(Auto[] autos) {
        this.autos = autos;
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
}
