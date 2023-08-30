/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusa.subclases;

/**
 *
 * @author max72
 */
public class Jugador {

    int id;
    final String nombre = "Jugador " + id;
    boolean ensangrentado = false;
    //final int MAX_JUGADORES = 6;

    public Jugador(int id) {
        this.id = id;
    }

    public boolean disparo(Revolver r) {
        if (r.mojar()) {
            this.ensangrentado = true;
        }
        r.siguienteChorro();
        return ensangrentado;
    }
}
