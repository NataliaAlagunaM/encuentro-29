/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author max72
 */
public class Reserva {
    private Habitacion hab;
    private ArrayList <Persona> ocupantes;

    public Reserva(Habitacion hab, ArrayList<Persona> ocupantes) {
        this.hab = hab;
        this.ocupantes = ocupantes;
    }

    public Habitacion getHab() {
        return hab;
    }

    public void setHab(Habitacion hab) {
        this.hab = hab;
    }

    public ArrayList<Persona> getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(ArrayList<Persona> ocupantes) {
        this.ocupantes = ocupantes;
    }

    @Override
    public String toString() {
        return "Reserva: " + "Hab:" + hab + ", Ocupantes: " + ocupantes;
    }
    
    
}
