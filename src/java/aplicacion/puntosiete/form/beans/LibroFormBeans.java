/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntosiete.form.beans;


import aplicacion.puntoocho.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mauro
 */
@ManagedBean
@RequestScoped
public class LibroFormBeans implements Serializable{

    private Libro libro = new Libro();
    private static  List<Libro> listaDeLibro = new ArrayList();
    
    public void agregarLibro(){
       listaDeLibro.add(libro);
       
    }
    public LibroFormBeans() {
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Libro> getListaDeLibro() {
        return listaDeLibro;
    }

    public void setListaDeLibro(List<Libro> listaDeLibro) {
        this.listaDeLibro = listaDeLibro;
    }
    
}
