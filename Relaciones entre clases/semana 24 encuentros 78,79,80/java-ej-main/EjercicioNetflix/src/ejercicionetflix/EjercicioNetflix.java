/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionetflix;
import Contenido.*;
import java.util.Scanner;
public class EjercicioNetflix {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaService servicioPeli = new PeliculaService();
        Pelicula [] pelis = new Pelicula[2];
        AlquilerService servicioAlquiler = new AlquilerService();
        Alquiler [] netflix = new Alquiler[20];
        boolean fueEjecutadaLa1 = false;
        int countAlquileres = 0;
        
       boolean salida = false;
        while(salida == false){
            System.out.println("Seleccione una opción:");
            System.out.println("1. Cargar pelicula");
            System.out.println("2. Hacer una lista de todas las peliculas disponibles");
            System.out.println("3. Cargar un alquiler");
            System.out.println("4. Realizar una lista de todos los alquileres");
            System.out.println("5. Buscar películas por título");
            System.out.println("6. Buscar películas por genero");
            System.out.println("7. Buscar alquileres por fecha");
            System.out.println("8. Calcular Servicio alquiler");
            System.out.println("9. Salir");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                {
                    pelis = servicioPeli.crearPelicula(2);
                    fueEjecutadaLa1 = true;
                }
                    break;
                case 2:
                    if (fueEjecutadaLa1)
                        servicioPeli.mostrarPeliculas(pelis);
                    else
                        System.out.println("NO EJECUTASTE LA 1 PAPI");
                    break;
                case 3:
                    if (fueEjecutadaLa1){
                        
                        netflix[countAlquileres] = servicioAlquiler.crearAlquiler(pelis);
                        countAlquileres++;
                    }
                        
                    else
                        System.out.println("NO EJECUTASTE LA 1 PAPI");
                    break;
                case 4:
                    System.out.println("Aqui creamos una lista de todos los alquileres");
                    break;
                case 5:
                    if (fueEjecutadaLa1){
                        servicioPeli.mostrarPeliculas(pelis);
                        System.out.println("Ingrese titulo");
                        boolean existe = servicioPeli.buscarPorTitulo(pelis,leer.nextLine());
                        if (existe)
                            System.out.println("Si, la encontre pero no te digo donde");
                        else
                            System.out.println("No, no esite pa");
                    }
                    else
                        System.out.println("NO EJECUTASTE LA 1 PAPI");
                    break;
                case 6:
                    if (fueEjecutadaLa1){
                        servicioPeli.mostrarPeliculas(pelis);
                        System.out.println("Ingrese genero");
                        String genero = leer.nextLine();
                        boolean existe = servicioPeli.buscarPorGenero(pelis,genero);
                        if (existe)
                            System.out.println("Si, la encontre pero no te digo donde");
                        else
                            System.out.println("No, no esite pa");
                    }
                    else
                        System.out.println("NO EJECUTASTE LA 1 PAPI");
                    break;
                case 7:
                    System.out.println("Aqui buscamos por fecha");
                    break;
                case 8:
                    servicioAlquiler.calcularTotalServicio(netflix);
                    break;
                case 9:
                    salida = true;
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }
            
            
        }
     
    }
}

