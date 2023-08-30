/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesdeclases;

/**
 *
 * @author max72
 */

import relacionesdeclases.nanananana.*;

public class RelacionesDeClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Voy a hacer lo que yo quiera");
        Perro perri1 = new Perro("chiquito","beagle",3,"Gigante");
        Perro perri2 = new Perro("lola","callejera",4,"minuscula");
        Humano p1 = new Humano("Juan","Apellido",20,"Hola",perri1);
        Humano p2 = new Humano ("Rocio","La Posta",18,"19.999.999",perri2);
        
        System.out.println(p2.toString());
        
    }
    
}
