/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author max72
 */
import java.util.*;

class Alumno {
    String nombreCompleto;
    String dni;
    int cantidadDeVotos = 0;

    Alumno(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto + ", DNI: " + dni + ", Votos: " + cantidadDeVotos;
    }
}