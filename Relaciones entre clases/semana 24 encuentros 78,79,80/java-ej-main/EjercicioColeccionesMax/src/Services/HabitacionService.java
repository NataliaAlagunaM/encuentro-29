/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Classes.Habitacion;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class HabitacionService {
    Scanner leer;
    
    public Habitacion HabitacionService(){
        leer = new Scanner(System.in).useDelimiter("\n");
        return crearHabitacion();
    }
    
    public Habitacion crearHabitacion(){
        leer = new Scanner (System.in);
        System.out.println("Ingrese numero de Habitacion");
        int num = leer.nextInt();
        return new Habitacion(num);
    };
    
    public int ocupantes(Habitacion h){
        return h.getCapacidadHab();
    }
    
}
