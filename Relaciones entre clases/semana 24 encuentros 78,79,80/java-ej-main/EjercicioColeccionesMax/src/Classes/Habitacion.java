/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author max72
 */
public class Habitacion {
    private int numeroHab;
   

    public Habitacion(int numeroHab) {
        if (numeroHab >=1 && numeroHab <=10)
        this.numeroHab = numeroHab;
        else
            this.numeroHab = -1;
        
    }

    public int getCapacidadHab() {
        if (numeroHab != -1)
            return numeroHab>5?((numeroHab>8)?1:3):2;
        else
            return 0;
    }
    
    
    
    
}
