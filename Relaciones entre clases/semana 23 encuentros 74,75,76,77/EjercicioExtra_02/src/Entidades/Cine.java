/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Cine {
    private Pelicula p;
    private ArrayList<Espectador> listaEsp;
    private String [][] matrixSala;
    private int precio;

    public Cine() {
    }

    public Cine(Pelicula p, ArrayList<Espectador> listaEsp, String[][] matrixSala, int precio) {
        this.p = p;
        this.listaEsp = listaEsp;
        this.matrixSala = matrixSala;
        this.precio = precio;
    }

    public Pelicula getP() {
        return p;
    }

    public void setP(Pelicula p) {
        this.p = p;
    }

    public ArrayList<Espectador> getListaEsp() {
        return listaEsp;
    }

    public void setListaEsp(ArrayList<Espectador> listaEsp) {
        this.listaEsp = listaEsp;
    }

    public String[][] getMatrixSala() {
        return matrixSala;
    }

    public void setMatrixSala(String[][] matrixSala) {
        this.matrixSala = matrixSala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "p=" + p + ", listaEsp=" + listaEsp + ", matrixSala=" + matrixSala + ", precio=" + precio + '}';
    }

    
    
    
}
