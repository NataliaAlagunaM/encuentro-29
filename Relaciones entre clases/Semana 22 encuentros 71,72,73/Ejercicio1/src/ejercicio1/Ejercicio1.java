/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entidad.Humano;
import Entidad.Perro;

/**
 *
 * @author Natalia Alaguna
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
    */
    public static void main(String[] args) {
        Perro perri1 = new Perro("chiquito","beagle",3,"Grande");
        Perro perri2 = new Perro("rufus","criollo",4,"pequeño");
        Humano p1 = new Humano("Juan","Apellido",20,"Hola",perri1);
        Humano p2 = new Humano ("Natalia","Alaguna",24,"19.999.999",perri2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
    
}
