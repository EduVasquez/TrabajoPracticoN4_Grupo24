/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntocinco.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Dalila
 */
public class Profesor implements Serializable{
    private String nombre;
    private String titulo;
    private char sexo;
    private Integer nroId;
    private String materia;

    public Profesor() {
    }
    
    public Profesor(String nombre, String titulo, char sexo, Integer nroId, String materia) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.sexo = sexo;
        this.nroId = nroId;
        this.materia = materia;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the nroId
     */
    public Integer getNroId() {
        return nroId;
    }

    /**
     * @param nroId the nroId to set
     */
    public void setNroId(Integer nroId) {
        this.nroId = nroId;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
}
