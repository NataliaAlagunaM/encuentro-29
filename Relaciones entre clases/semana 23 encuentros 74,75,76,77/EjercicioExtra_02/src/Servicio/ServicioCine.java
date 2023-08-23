/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class ServicioCine {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cine c = new Cine();

    public void llenarMatriz() {
        String[][] auxM = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                auxM[i][j] = " ";
            }
        }
        c.setMatrixSala(auxM);
    }

    public void mostrarMatrix() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + c.getMatrixSala()[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public void crearEspectadores() {
        ArrayList<Espectador> listaAux = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            Espectador esp = new Espectador("Chiquito" + i, ((int) (Math.random() * 100) + 0), ((int) (Math.random() * 350) + 0));
//            System.out.println("Ingrese nombre Espectador");
//            esp.setNombreEsp(leer.next());
//            System.out.println("ingrese su edad");
//            esp.setEdad(leer.nextInt());
//            System.out.println("ingrese la cantidad de dinero");
//            esp.setDinero(leer.nextInt());
            listaAux.add(esp);
        }
        c.setListaEsp(listaAux);
        System.out.println(c.getListaEsp().toString());

    }

    public void ubicarEspectador() {

        for (int i = 0; i < c.getListaEsp().size(); i++) {
            boolean band = true;
            if (c.getListaEsp().get(i).getDinero() >= c.getPrecio()) {
                if (c.getListaEsp().get(i).getEdad() >= c.getP().getEdadMinima()) {
                    do {
                        int j = (int) (Math.random() * 8) + 0;
                        int k = (int) (Math.random() * 6) + 0;
                        if (c.getMatrixSala()[j][k] == " ") {
                            band = false;
                            c.getMatrixSala()[j][k] = "X";
                            System.out.println("El espectador " + c.getListaEsp().get(i).getNombreEsp() + " fue ubicado en la butaca " + (j + 1) + ", " + (k + 1));
                        } else {
                            System.out.println("lugar ocupado");
                        }

                    } while (band);
                }else{
                    System.out.println("sos muy pendejo para ver esto, anda a ver show matematicas");
                }

            } else {
                System.out.println("Sos pobre pibe");
            }

        }

    }

    public void precioEntrada() {
        System.out.println("Cual es el precio de la entrada");
        c.setPrecio(leer.nextInt());
    }

    public void crearPelicula() {
        Pelicula auxP = new Pelicula();
        System.out.println("Titulo de la pelicula");
        auxP.setTitulo(leer.next());
        System.out.println("Duracion de la pelicula en min");
        auxP.setDuracion(leer.nextInt());
        System.out.println("Edad minima de la pelicula");
        auxP.setEdadMinima(leer.nextInt());
        System.out.println("Director de la pelicula");
        auxP.setDirector(leer.next());
        c.setP(auxP);
    }

}
