/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author 57311
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int DNI;
    public ArrayList<Perro> mascotas;

    public Persona() {
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Perro> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Perro> mascotas) {
        this.mascotas = mascotas;
    }
    
        @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", mascotas=" + mascotas + '}';
    }
    
}
