/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Classes.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class ReservaService {

    Scanner leer;

    public Reserva ReservaService() {
        leer = new Scanner(System.in).useDelimiter("\n");
        return crearReserva();
    }

    public Reserva crearReserva() {
        HabitacionService hab = new HabitacionService();
        Habitacion habitacion = hab.crearHabitacion();
        System.out.println("Ingrese ocupantes (Max: " + habitacion.getCapacidadHab() + ").");
        leer = new Scanner (System.in);
        int personas = leer.nextInt();
        PersonaService servicioPers = new PersonaService();
        ArrayList<Persona> gente = new ArrayList<>();
        for (int i = 0; i < personas; i++) {
            gente.add(servicioPers.crearPersona());
        }
        return new Reserva(habitacion, gente);
    }
    public Reserva modificarReserva(Reserva r){
        //ACA IRIA LA LOGICA PARA MODIFICAR. CANT BE BOTHERED.
        return new Reserva(r.getHab(),r.getOcupantes());
    }
    
    
    
    
}
