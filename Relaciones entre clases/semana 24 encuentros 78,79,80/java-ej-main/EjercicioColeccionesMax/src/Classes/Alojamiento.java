/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Services.ReservaService;
import java.util.ArrayList;

/**
 *
 * @author max72
 */
public class Alojamiento {
    private ArrayList <Reserva> reservas;

    public Alojamiento() {
        reservas = new ArrayList<Reserva>();
    }

    public void menu(){
        agregarReserva();
    }
    
    public void agregarReserva(){
        ReservaService tamadre = new ReservaService();
        reservas.add(tamadre.crearReserva());
    }
    
    public void eliminarReserva(){
        
    }
    
    public void editarReserva(){
        
    }
    
    
    
}
