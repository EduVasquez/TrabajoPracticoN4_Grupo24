/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntoocho.form.beans;


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
       
    listaDeLibro.add(new Libro(456, "Cartero", "Charles Bukowski", 919.99,"Novela"));
    listaDeLibro.add(new Libro(123, "Factótoum","Charles Bukowski", 932.99,"Novela"));
    listaDeLibro.add(new Libro(412, "Pulp","Charles Bukowski", 995.99,"Novela"));
    listaDeLibro.add(new Libro(345, "El Mítico Hombre-Mes","Steve Krug", 50.99,"Programación"));
    listaDeLibro.add(new Libro(765, "No me hagas pensar","Steve Krug", 132.99,"Programación"));
    listaDeLibro.add(new Libro(9879, "El libro negro del programador","Steve Krug", 132.99,"Programación"));
    listaDeLibro.add(new Libro(867, "Relatos cortos","Miguel Cervantes", 219.99,"Literatura"));
    listaDeLibro.add(new Libro(9832, "Don Quijote de la Mancha","Miguel Cervantes", 519.99,"Literatura"));
    listaDeLibro.add(new Libro(4562, "Nostromo", "Miguel Cervantes", 1219.99,"Literatura"));
  
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
        LibroFormBeans.listaDeLibro = listaDeLibro;
    }

  
}
