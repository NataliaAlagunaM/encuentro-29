/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;


/**
 *
 * @author max72
 */
public class java {
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        List<String> nombres = simulador.generarNombres();
        List<String> dnis = simulador.generarDNIs();
        List<Alumno> alumnos = simulador.crearAlumnos(nombres, dnis, 10);
        System.out.println("Listado de alumnos:");
        alumnos.forEach(System.out::println);
        simulador.votacion(alumnos);
        simulador.recuentoDeVotos(alumnos);
    }
}
