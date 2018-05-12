/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dhal_
 */
public class Ahorcado {

    private ArrayList<Character> letrasUsada;
    private String[] palabras = {"hola", "casa", "argentina", "escuela", "internet", "programacion", "dormitorio", "informatica", "ingenieria"};
    private String palabra;
    private String palabraElegida;
    private String resultado;
     private String imagen;
    private char letra;
    private boolean coinciden;
    private boolean estado;
    private int intento;
    private int fallo;
    private int cont;
    private int num;

    private Random rand = new Random(System.nanoTime());

    public Ahorcado() {
        imagen = "/Imagen/ahorcado_1.jpg";
        this.palabra = palabras[rand.nextInt(palabras.length)];
        this.palabraElegida = inicializarPalabra();
        this.letrasUsada = new ArrayList<>();
         this.intento =7;
        this.fallo = 0;
        this.cont = 0;
        this.num=2;
        
       
    }
   

    public String inicializarPalabra() {
        palabraElegida = "";
        for (int i = 0; i < getPalabra().length(); i++) {
            palabraElegida = palabraElegida + "*";
        }
        return palabraElegida;
    }

    //Metodo para comparar letra introducida con una palabra del array de palabras
    public void compararLetras() {

       
        if (!letrasUsada.contains(letra) && !estado) {
            letrasUsada.add(letra);
            char[] cadena = palabraElegida.toCharArray();
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    cadena[i] = letra;
                    setCoinciden(true);
                    cont++;
                }
            }
            if (isCoinciden() == false) {
                intento--;
                fallo++;
                 imagen = "/Imagen/ahorcado_" + num + ".jpg";
              num++;

            }
            if (intento > 0 && cont <= palabra.length() - 1) {
                coinciden = false;
                palabraElegida = String.valueOf(cadena);
            } else {
                if (intento == 0 && fallo == palabraElegida.length()) {
                     imagen = "/Imagen/ahorcado_8.jpg";
                    setResultado("GAME OVER");
                } else {
                    if (cont > palabra.length() - 1) {
                        setResultado("GANASTE");
                    }
                }               
                palabraElegida = palabra;
                letrasUsada= new ArrayList<>();
                estado = true;
            }
        }
    }

    /**
     * @return the palabras
     */
    public String[] getPalabras() {
        return palabras;
    }

    /**
     * @param palabras the palabras to set
     */
    public void setPalabras(String[] palabras) {
        this.palabras = palabras;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the palabraElegida
     */
    public String getPalabraElegida() {
        return palabraElegida;
    }

    /**
     * @param palabraElegida the palabraElegida to set
     */
    public void setPalabraElegida(String palabraElegida) {
        this.palabraElegida = palabraElegida;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /**
     * @return the intento
     */
    public int getIntento() {
        return intento;
    }

    /**
     * @param intento the intento to set
     */
    public void setIntento(int intento) {
        this.intento = intento;
    }

    /**
     * @return the fallo
     */
    public int getFallo() {
        return fallo;
    }

    /**
     * @param fallo the fallo to set
     */
    public void setFallo(int fallo) {
        this.fallo = fallo;
    }

    /**
     * @return the letrasUsada
     */
    public ArrayList<Character> getLetrasUsada() {
        return letrasUsada;
    }

    /**
     * @param letrasUsada the letrasUsada to set
     */
    public void setLetrasUsada(ArrayList<Character> letrasUsada) {
        this.letrasUsada = letrasUsada;
    }

    /**
     * @return the coinciden
     */
    public boolean isCoinciden() {
        return coinciden;
    }

    /**
     * @param coinciden the coinciden to set
     */
    public void setCoinciden(boolean coinciden) {
        this.coinciden = coinciden;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
