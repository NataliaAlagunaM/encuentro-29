/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusa.subclases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Juego {

    ArrayList<Jugador> jugadores;
    Revolver armaLetal;

    public Juego() {
        System.out.println("Cuantos jugadores desean morir hoy");
        Scanner leer = new Scanner(System.in);
        int cantJugadores = leer.nextInt();
        jugadores = new ArrayList<>();
        armaLetal = new Revolver();
        for (int i = 0; i < 6 && i < cantJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
    }

    public boolean ronda() {
        for (Jugador j : jugadores) {
            System.out.println("Jugador " + j.id + ", es momento de probar tu suerte y no morir.");
            if (j.disparo(armaLetal)) {
                System.out.println("MORISTEEEE por favor recolecte sus sesos y retirese.");
                return true;
            } else {
                System.out.println("Sigue vivo. Le toca al proximo.");
            }
        }
        System.out.println("Juego terminado... ?");
        return false;
    }

}
