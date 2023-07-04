/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author 57315
 */
public class Arreglo {
    private double [] arregloA;
    private double [] arregloB;

    public Arreglo() {
    }

    public Arreglo(double[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

    
    
}


