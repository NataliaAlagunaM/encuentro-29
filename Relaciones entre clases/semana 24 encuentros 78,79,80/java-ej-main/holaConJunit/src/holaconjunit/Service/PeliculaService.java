/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaconjunit.Service;

import holaconjunit.PeliculaClass.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import holaconjunit.Service.Comparators.Comparators;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class PeliculaService {

    ArrayList<Pelicula> netflix;
    

    public PeliculaService(ArrayList<Pelicula> netflix) {
        //Si se manda una lista, la crea, pero esto no existe. Patrañas.
        this.netflix = netflix;

    }

    public PeliculaService() {
        this.netflix = new ArrayList<>();
        //Si se arranca vacio, arranca pidiendo peliculas por default
        agregarPeliculas();
    }

    public void agregarPelicula() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese titulo de la pelicula");
        String titulo = leer.nextLine();
        System.out.println("Ingrese director de la pelicula");
        String director = leer.nextLine();
        System.out.println("Ingrese duracion de la pelicula (en horas, como double)");
        double duracion = leer.nextDouble();
        netflix.add(new Pelicula(titulo, director, duracion));
    }

    public void agregarPeliculas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas peliculas desea agregar?");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            agregarPelicula();
        }
    }

    public void mostrarPelicula(Pelicula p) {
        System.out.println(p.toString());

    }

    public void mostrarPeliculas() {
        for (Pelicula p : netflix) {
            mostrarPelicula(p);
        }
    }

    public void menu() {
        System.out.println("1. Agregar Peliculas");
        System.out.println("2. Algo va aca.");
    }

    public void ordenarPeliculasPor(String tipoDeOrden, String ascdesc) {
        //TIPOS DE ORDEN: Duracion, Director, Titulo.
        //Tipos de ascdesc: "ASC","DESC"

        if (tipoDeOrden.equals("TITULO")) {
            ordenarPeliculasPorTitulo(ascdesc);
        } else if (tipoDeOrden.equals("DIRECTOR")) {
            ordenarPeliculasPorDirector(ascdesc);
        } else if (tipoDeOrden.equals("DURACION")) {
            ordenarPeliculasPorDuracion(ascdesc);
        } else {
            System.out.println("ERROR FATAL, PRESIONE ALT F4 PARA CONTINUAR");
        }
        mostrarPeliculas();
    }

    private void ordenarPeliculasPorDuracion(String orden) {
        System.out.println("Ordenando por Duracion " + orden);
        Collections.sort(netflix,orden.equals("ASC")?Comparators.ordenarPorDuracionAsc:Comparators.ordenarPorDuracionDesc);
    }

    private void ordenarPeliculasPorTitulo(String orden) {
        System.out.println("Ordenando por Titulo " + orden);
        Collections.sort(netflix,orden.equals("ASC")?Comparators.ordenarPorTituloAsc:Comparators.ordenarPorTituloDesc);
    }

    private void ordenarPeliculasPorDirector(String orden) {
        System.out.println("Ordenando por Director " + orden);
        Collections.sort(netflix,orden.equals("ASC")?Comparators.ordenarPorDirectorAsc:Comparators.ordenarPorDirectorDesc);
    }
    

}
