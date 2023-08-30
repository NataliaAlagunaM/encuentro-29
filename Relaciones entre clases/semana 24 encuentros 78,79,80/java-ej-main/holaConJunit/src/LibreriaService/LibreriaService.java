/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaService;

import LibroClass.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class LibreriaService {

    HashSet<Libro> libreria;
    Scanner leer;

    public LibreriaService() {
        libreria = new HashSet<>();
        leer = new Scanner(System.in).useDelimiter("\n");
        crearLibros();
    }

    public void crearLibro() {
        System.out.println("Ingrese Titulo: ");
        String titulo = leer.next();
        System.out.println("Ingrese Autor: ");
        String autor = leer.next();
        System.out.println("Ingrese cantidad de ejemplares");
        int ejemplares = leer.nextInt();
        System.out.println("Ingrese ejemplares prestados, o 0 si no se presto.");
        int prestados = leer.nextInt();
        libreria.add(new Libro(titulo, autor, ejemplares, prestados));
    }

    public void crearLibros() {
        System.out.println("Ingrese cuantos libros desea ingresar");
        int it = leer.nextInt();
        for (int i = 0; i < it; i++) {
            crearLibro();
        }
    }

    public Libro buscarLibro(String nombre) {
        Iterator<Libro> it = libreria.iterator();
        while (it.hasNext()) {
            Libro retornable = it.next();
            if (retornable.getTitulo().equalsIgnoreCase(nombre)) {
                return retornable;
            }
        }
        return new Libro();
    }

    public boolean prestamo() {
        System.out.println("Ingrese nombre del libro que quiere prestamo (ESCRIBA BIEN!)");
        String titulo = leer.next();
        Libro buscado = buscarLibro(titulo);
        if (buscado == new Libro()) {
            System.out.println("No existe. ESCRIBI B I E N ");
            return false;
        }

        if (buscado.getEjemplaresPrestados() < buscado.getEjemplaresEnTotal()) {
            buscado.setEjemplaresPrestados(buscado.getEjemplaresPrestados() + 1);
            System.out.println("Libro prestado con exito. Vuelva prontos.");
            return true;
        }
        System.out.println("NO HAY EJEMPLARES PARA PRESTAR, nadie devuelve, este pais, se va a la ruina.");
        return false;
    }

    public void mostrarLibros() {
        for (Libro l : libreria) {
            System.out.println(l.toString());
        }
    }

    public boolean devolucion() {
        System.out.println("Ingrese nombre del libro que quiere devolver(ESCRIBA BIEN!)");
        String titulo = leer.next();
        Libro buscado = buscarLibro(titulo);
        if (buscado == new Libro()) {
            System.out.println("No existe. ESCRIBI B I E N ");
            return false;
        }

        if (buscado.getEjemplaresPrestados() > 0) {
            buscado.setEjemplaresPrestados(buscado.getEjemplaresPrestados() - 1);
            System.out.println("Libro deBolBido con exito. Vuelva prontos.");
            return true;
        }
        System.out.println("NO HAY EJEMPLARES PARA DEVOLVER, Como vas a devolver algo que no existe, salamin");
        return false;
    }

    public void run() {
        int option = 0;
        do {
            System.out.println("MENU PRINCIPAL!");
            if (libreria.isEmpty()) {
                crearLibros();
            }
            System.out.println("1. Agregar Libros.");
            if (!libreria.isEmpty()) {
                System.out.println("2. Mostrar Libros.");
                System.out.println("3. Prestar Libro.");
                System.out.println("4. Devolver Libro.");
            }
            System.out.println("5. Salir.");
            option = leer.nextInt();
            switch (option) {
                case 1:
                    crearLibros();
                    break;
                case 2:
                    if (!libreria.isEmpty()) {
                        mostrarLibros();
                        break;
                    }
                case 3:
                    if (!libreria.isEmpty()) {
                        prestamo();
                        break;
                    }
                    break;
                case 4:
                    if (!libreria.isEmpty()) {
                        devolucion();
                        break;
                    }
                    break;
                case 5:
                    System.out.println("Hasta lueguito");
                    break;
                default:
                    System.out.println("NI UN NUMERO ESCRIBIS BIEN!?");
            }
        } while (option != 5);
    }

}
