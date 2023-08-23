package servicios;

import entidades.Perro;
import entidades.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona() {
        Persona persona1 = new Persona();
        System.out.println("Ingresa el nombre de la persona:");
        persona1.setNombre(leer.next());
        adoptarPerro();
    }

    public void fabricarPersona() {
        String respuesta = "";
        do {
            crearPersona();
            System.out.println("Deseas crear otra persona? (S/N)");
            respuesta = leer.next();
        }
        while (respuesta.equalsIgnoreCase("s"));

    }

    public void adoptarPerro() {

        ServicioPerro.mostrarPerros();
        String respuestNombre = "";

        boolean bandera = true;
        boolean banderaNombre = true;
        do {
            System.out.println("¿Cual perro quieres adoptar?: ");
            respuestNombre = leer.next();
            for (Perro perro : ServicioPerro.listaPerros) {
                if (perro.getNombre().equalsIgnoreCase(respuestNombre)) {
                    banderaNombre = false;
                    if (perro.isAdoptado() == true) {
                        System.out.println(perro.getNombre() + " ya esta adoptado 😥");
                    } else {
                        perro.setAdoptado(true);
                        System.out.println("Felicitaciones adoptaste a: " + perro.getNombre() + " 🤗");
                        bandera = false;
                    }
                }
            }
            if (banderaNombre) {
                System.out.println("Ese nombre no está en la lista");
            }
        } while (bandera);
    }

}
