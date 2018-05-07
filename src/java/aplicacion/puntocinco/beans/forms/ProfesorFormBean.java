/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntocinco.beans.forms;

import aplicacion.puntocinco.modelo.dominio.Profesor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Dalila
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBean implements Serializable{
    private Profesor profesor;
    private List<Profesor> profesores;

    /**
     * Creates a new instance of ProfesorFormBean
     */
    public ProfesorFormBean() {
        profesor=new Profesor();
        profesores=new ArrayList<>();
    }
    public void agregarProfesor(){
        profesores.add(profesor);
        profesor=new Profesor();
    }
    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the profesores
     */
    public List<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }
    
}
