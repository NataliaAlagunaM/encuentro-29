/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

//El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:

import Enumeraciones.Apellido;
import Enumeraciones.Nombres;

//nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
//tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
//desde el main.
public class Alumno {
    private Nombres nombre;
    private Apellido apellido;
    private int dni;
    private int cantVotos;

    public Alumno() {
    }

    public Alumno(Nombres nombre, Apellido apellido, int dni, int cantVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public Nombres getNombre() {
        return nombre;
    }

    public void setNombre(Nombres nombre) {
        this.nombre = nombre;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public void setApellido(Apellido apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre +
                ", apellido=" + apellido +
                ", dni=" + dni +
                ", cantVotos=" + cantVotos + '}'+'\n';
    }
    
    
    
    
    
}
