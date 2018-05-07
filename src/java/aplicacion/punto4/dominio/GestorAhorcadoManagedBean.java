/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto4.dominio;

import Punto4.Ahorcado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author dhal_
 */
@ManagedBean
@ViewScoped
public class GestorAhorcadoManagedBean implements Serializable{
    private Ahorcado ahorcado;

    /**
     * Creates a new instance of GestorAhorcadoManagedBean
     */
    public GestorAhorcadoManagedBean() {
        ahorcado = new Ahorcado();
    }

    /**
     * @return the ahorcado
     */
    public Ahorcado getAhorcado() {
        return ahorcado;
    }

    /**
     * @param ahorcado the ahorcado to set
     */
    public void setAhorcado(Ahorcado ahorcado) {
        this.ahorcado = ahorcado;
    }
    
}
