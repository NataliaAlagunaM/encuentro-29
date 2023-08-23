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
public class Humano {
    String nombre;
    String apellido;
    int edad;
    String documento;
    Perro perro;

    public Humano(String nombre, String apellido, int edad, String documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Humano " + "nombre: " + nombre + ", apellido " + apellido + ", edad " + edad + ", documento " + documento + ", perro " + perro;
    }
}
