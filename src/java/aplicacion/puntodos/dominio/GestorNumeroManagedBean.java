/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.puntodos.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author dhal_
 */
@ManagedBean
@ViewScoped
public class GestorNumeroManagedBean {

    private double numero;
    private List<Double> numeros;
    private double mayor;
    private double menor;
    private double promedio;

    /**
     * Creates a new instance of GestorNumeroManagedBean
     */
    public GestorNumeroManagedBean() {
        numeros = new ArrayList<>();
    }

    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     *
     */
    public void agregarNumeros() {
        numeros.add(numero);
        obtenerMayor();
        obtenerMenor();
        obtenerPromedio();
    }

    /**
     *
     */
    public void obtenerMayor() {
        if (!numeros.isEmpty()) {
            mayor = numeros.get(0);
            for (double num : numeros) {
                if (num > mayor) {
                    mayor = num;
                }
            }
        }
    }

    public void obtenerMenor() {
        if (!numeros.isEmpty()) {
            menor = numeros.get(0);
            for (double num : numeros) {
                if (num < menor) {
                    menor = num;
                }
            }
        }
    }

    public void obtenerPromedio() {
        promedio = 0.0;
        double suma = 0.0;
        if (!numeros.isEmpty()) {
            for (double num : numeros) {
                suma = suma + num;
            }
            promedio = suma / numeros.size();
        }
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * @return the numeros
     */
    public List<Double> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }

    /**
     * @return the mayor
     */
    public double getMayor() {
        return mayor;
    }

    /**
     * @param mayor the mayor to set
     */
    public void setMayor(double mayor) {
        this.mayor = mayor;
    }

    /**
     * @return the menor
     */
    public double getMenor() {
        return menor;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

}
