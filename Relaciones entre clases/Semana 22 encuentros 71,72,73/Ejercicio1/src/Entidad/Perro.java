/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Natalia Alaguna
 */
public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamanio;

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro " + "nombre " + nombre + ", raza " + raza + ", edad " + edad + ", tamanio " + tamanio;
    }
    
}
