import java.util.ArrayList;
import java.util.Scanner;
import Entities.Alquiler;
import Entities.Pelicula;
import Services.AlquilerService;
import Services.PeliculaService;

public class Desafio2 {
    public static void main(String[] args) throws Exception {

        PeliculaService peliculaService = new PeliculaService();
        AlquilerService alquilerService = new AlquilerService();
        int j = 0;
        Pelicula[] listaPeliculas = new Pelicula[5];
        Alquiler[] listaAlquileres = new Alquiler[5];
        for (int i = 0; i < listaPeliculas.length; i++) {
            listaPeliculas[i] = peliculaService.crearPelicula();
        }
        // listaPeliculas[0] = new Pelicula("El señor de los anillos", "Terror", 2001, 120);
        // listaPeliculas[1] = new Pelicula("El señor de los anillos 2", "Fantasía", 2002, 65);
        // listaPeliculas[2] = new Pelicula("El señor de los anillos 3", "Fantasía", 2003, 130);
        // listaPeliculas[3] = new Pelicula("Harry Potter", "Terror", 2001, 140);
        // listaPeliculas[4] = new Pelicula("Harry Potter 2", "Fantasía", 2002, 120);
        // listaAlquileres[0] = new Alquiler("El señor de los anillos", null , null, 10);

        Scanner scanner = new Scanner(System.in);
    
        int option = 0;
        do {
            System.out.println("Ingrese una opción:");
            System.out.println("1. Listar películas disponibles");
            System.out.println("2. Buscar película por título");
            System.out.println("3. Buscar película por género");
            System.out.println("4. Alquilar película");
            System.out.println("5. Ver precio total");
            System.out.println("6. Salir");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    peliculaService.listarPeliculasDisponibles(listaPeliculas);
                    break;
                case 2:
                    peliculaService.buscarPeliculaPorTitulo(listaPeliculas);
                    break;
                case 3:
                    peliculaService.buscarPeliculaPorGenero(listaPeliculas);
                    break;
                case 4:
                    j = j + 1;
                    listaAlquileres[j] = alquilerService.crearAlquiler();
                    break;
                case 5:
                System.out.println(listaAlquileres[j].getPrecio() + " pesos");
                    break;
                case 6:
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (option != 5);

    }

}
