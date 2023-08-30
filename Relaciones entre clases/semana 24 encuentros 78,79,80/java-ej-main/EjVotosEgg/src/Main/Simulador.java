/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 *
 * @author max72
 */
class Simulador {
    Random random = new Random();

    List<String> generarNombres() {
        List<String> nombres = Arrays.asList("Juan", "María", "Carlos", "Ana", "Luis");
        List<String> apellidos = Arrays.asList("Pérez", "González", "Rodríguez", "Martínez", "García");
        List<String> nombresCompletos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String nombreCompleto = nombres.get(random.nextInt(nombres.size())) + " " + apellidos.get(random.nextInt(apellidos.size()));
            nombresCompletos.add(nombreCompleto);
        }
        return nombresCompletos;
    }

    List<String> generarDNIs() {
        List<String> dnis = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int dni = 10000000 + random.nextInt(90000000);
            dnis.add(String.valueOf(dni));
        }
        return dnis;
    }

    List<Alumno> crearAlumnos(List<String> nombres, List<String> dnis, int cantidad) {
        List<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            alumnos.add(new Alumno(nombres.get(i), dnis.get(i)));
        }
        return alumnos;
    }

    void votacion(List<Alumno> alumnos) {
        for (Alumno votante : alumnos) {
            HashSet<Alumno> votadosSet = new HashSet<>();
            while (votadosSet.size() < 3) {
                Alumno votado = alumnos.get(random.nextInt(alumnos.size()));
                if (votado != votante && !votadosSet.contains(votado)) {
                    votadosSet.add(votado);
                    votado.cantidadDeVotos++;
                }
            }
            System.out.println("Votante: " + votante.nombreCompleto + " Votados: " + votadosSet);
        }
    }

    void recuentoDeVotos(List<Alumno> alumnos) {
        Collections.sort(alumnos, (a, b) -> b.cantidadDeVotos - a.cantidadDeVotos);
        System.out.println("Facilitadores:");
        for (int i = 0; i < 5; i++) {
            System.out.println(alumnos.get(i));
        }
        System.out.println("Facilitadores suplentes:");
        for (int i = 5; i < 10; i++) {
            System.out.println(alumnos.get(i));
        }
    }
}

