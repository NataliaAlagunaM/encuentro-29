/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Martin
 */

// Por último, del espectador, nos interesa saber su
//nombre, edad y el dinero que tiene disponible.

public class Espectador {
    private String nombreEsp;
    private int edad;
    private int dinero;

    public Espectador() {
    }

    public Espectador(String nombreEsp, int edad, int dinero) {
        this.nombreEsp = nombreEsp;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombreEsp() {
        return nombreEsp;
    }

    public void setNombreEsp(String nombreEsp) {
        this.nombreEsp = nombreEsp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombreEsp=" + nombreEsp + ", edad=" + edad + ", dinero=" + dinero + '}'+'\n';
    }
    
    
}
