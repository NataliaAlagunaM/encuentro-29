package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Jugador> jugadores = new ArrayList();
    
    public Jugador crearJugador(int i) {
        Jugador J1 = new Jugador();
        
        J1.setId((i));
        
        J1.setNombre("Jugador " + J1.getId());
        
        J1.setMojado(false);
        
        System.out.println(J1.toString());
        
        return J1;
    }
    
    public ArrayList<Jugador> fabricaJugadores() {
        
                
        System.out.println("Ingrese cuantos jugadores: ");
        int cant = leer.nextInt();
        
        if(cant>6 || cant<1) {
            cant = 6;
        }
        
        for (int i = 0 ; i<cant ; i++) {
            jugadores.add(crearJugador(i+1));
        }
        
        return jugadores;
    }
    
    public void disparo(RevolverDeAgua R1, RevolverDeAguaServicio rdas) {
        
//        do {
//    
//            R1.toString();
//            
//
//            
//            if (rdas.mojar(R1)) {
//                Jugador J1 = jugadores.get(R1.getPosicionActual());
//
//                System.out.println("RATATATTATAATT. te mojaste " + J1.getNombre());
//                J1.setMojado(true);
//            } else {
//                Jugador J1 = jugadores.get(R1.getPosicionActual());
//
//                rdas.siguienteChorro(R1);
//                System.out.println("UFF ZAFASTE " + J1.getNombre());
//            }
//        } while (rdas.mojar(R1) == false); 

        do {
    
            
            System.out.println(R1.toString());
            
            
            
            Jugador J1 = jugadores.get(R1.getPosicionActual());

            System.out.println(rdas.mojar(R1));

            
            
            rdas.siguienteChorro(R1);
            System.out.println("UFF ZAFASTE " + J1.getNombre());
            
        } while (rdas.mojar(R1) == false); 

        if (rdas.mojar(R1)) {
                Jugador J1 = jugadores.get(R1.getPosicionActual());

                System.out.println(rdas.mojar(R1));

                
                System.out.println("RATATATTATAATT. te mojaste " + J1.getNombre());
                J1.setMojado(true);
                
        } 
    }
    
}
