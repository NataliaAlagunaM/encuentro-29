package Services;

import java.util.Scanner;

import Entities.Pelicula;

public class PeliculaService {

    public Pelicula crearPelicula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título de la película:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese el género de la película:");
        String genero = scanner.nextLine();
        System.out.println("Ingrese el año de la película:");
        int anio = scanner.nextInt();
        System.out.println("Ingrese la duración de la película:");
        int duracion = scanner.nextInt();

        return new Pelicula(titulo, genero, anio, duracion);
    }

    public void listarPeliculasDisponibles(Pelicula[] peliculas) {
        System.out.println("Listado de películas disponibles:");
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i].getTitulo());
        }
    }

    public void buscarPeliculaPorTitulo(Pelicula[] peliculas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título de la película:");
        String titulo = scanner.nextLine();
        System.out.println("Listado de películas con el título " + titulo + ":");
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getTitulo().equals(titulo)) {
                System.out.println(peliculas[i].getTitulo());
            }else{
                System.out.println("No se encontró la película");
            }
        }
        }

    public void buscarPeliculaPorGenero(Pelicula[] peliculas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el género de la película:");
        String genero = scanner.nextLine();
        System.out.println("Listado de películas con el género " + genero + ":");
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getGenero().equals(genero)) {
                System.out.println(peliculas[i].getTitulo());
            }else{
                System.out.println("No se encontaron peliculas de este género");
            }
        }
    }
}
