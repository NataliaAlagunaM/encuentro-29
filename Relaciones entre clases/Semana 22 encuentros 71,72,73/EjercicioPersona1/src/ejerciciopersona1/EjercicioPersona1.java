/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersona1;

import Entidades.DNI;
import Entidades.Persona;

/**
 *
 * @author Natalia Alaguna
 */
public class EjercicioPersona1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI d1 = new DNI();
        d1.setSerie('A');
        d1.setNumero(1234);
        
        Persona p1 = new Persona();
        p1.setNombre("Natalia");
        p1.setApellido("Alaguna");
        p1.setDni(d1);
        
        System.out.println(p1);
    }
    }
    
}
