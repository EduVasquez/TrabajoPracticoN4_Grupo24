/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntoseis.dominio;


import Punto6.Auto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author dhal_
 */
@ManagedBean
@ViewScoped
public class AutoManagedBean implements Serializable{
    private Auto[] autos;
    private Auto auto;

    /**
     * Creates a new instance of AutoManagedBean
     */
    public AutoManagedBean() {
        this.auto = new Auto();
        this.autos = new Auto[6];
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
         this.setAuto(new Auto());
        setAuto(autos);
        
        
    }
    
    public void modificarAuto(){
        boolean bandera = false;
      for(int i=0; i<getAutos().length && !bandera; i++){
        if( auto.getPatente().equals(autos[i].getPatente())){
                autos[i].setPatente(getAuto().getPatente());
                autos[i].setModelo(getAuto().getModelo());
                autos[i].setMarca(getAuto().getMarca());
                autos[i].setColor(getAuto().getColor());
                autos[i].setTipoCombustible(getAuto().getTipoCombustible());   
            bandera = true;
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
