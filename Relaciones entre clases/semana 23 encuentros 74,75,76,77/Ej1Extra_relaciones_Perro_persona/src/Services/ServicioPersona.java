/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.Perro;
import Entities.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 57311
 */
public class ServicioPersona {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Perro> todosLosPerros = new ArrayList();

    public void crearPerro() {

        /*  for (int i = 0; i < 10; i++) {

            Perro prr1 = new Perro();
            prr1.setNombre("Perro " + i);
            prr1.setRaza("Dálmata");
            prr1.setAdoptable(true);
            todosLosPerros.add(prr1);
           
        }*/
        Perro prr1 = new Perro();
        prr1.setNombre("Rocky");
        prr1.setRaza("Dálmata");
        prr1.setAdoptable(true);
        todosLosPerros.add(prr1);

        Perro prr2 = new Perro();
        prr2.setNombre("Coco");
        prr2.setRaza("Labrador");
        prr2.setAdoptable(true);
        todosLosPerros.add(prr2);

    }

    ArrayList<Persona> adoptantes = new ArrayList();

    public void crearPersona() {
        String perroAdoptar;
        String r1="";
        for (int i = 0; i < 4; i++) {
            boolean bandera = true;
            Persona pers1 = new Persona();
            pers1.setNombre("Fulanito " + i);
            pers1.setApellido(" De tal");
            pers1.setDNI(i * 1000);

            do {

                System.out.println("Deseas adoptar un perro? s-n");
                String respuesta = sc.next();
                

                ArrayList<Perro> perrosAdoptados = new ArrayList();
                if (respuesta.equalsIgnoreCase("s")) {
                    mostrarPerros();

                    System.out.println("Qué perro desea adoptar?");
                    perroAdoptar = sc.next();

                    for (Perro mascota : todosLosPerros) {
                        if (mascota.getNombre().equalsIgnoreCase(perroAdoptar)) {
                            bandera = false;
                            if (mascota.isAdoptable()) {
                                perrosAdoptados.add(mascota);
                                pers1.setMascotas(perrosAdoptados);
                                System.out.println("Felicitaciones! " + pers1.getNombre() + " " + pers1.getApellido() + " usted adoptó a " + perroAdoptar);
                                mascota.setAdoptable(false);
                                System.out.println("Deseas adoptar otro perro?");
                                r1 = sc.next();

                            } else {
                                System.out.println("Este perro ya fue adoptado");
                            }
                        }

                    }
                    if (bandera) {
                        System.out.println("Este perro no está en la lista");
                    }
                }

            } while (r1.equalsIgnoreCase("s"));

            adoptantes.add(pers1);

        }
    }

    public void agregarPerros() {

    }

    public void mostrarPerros() {
        System.out.println(todosLosPerros.toString());

    }

    public void mostrarPersonas() {
        System.out.println(adoptantes.toString());
    }

}
