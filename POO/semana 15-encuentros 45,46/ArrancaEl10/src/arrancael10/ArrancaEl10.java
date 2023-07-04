/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrancael10;

import clases.Matematica;

/**
 *
 * @author max72
 */
public class ArrancaEl10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica nuevo = new Matematica ();
        
        nuevo.setNumeroReal1(Math.random()*100);
        nuevo.setNumeroReal2(Math.random()*100);
        
        System.out.println("Numero real 1: " + nuevo.getNumeroReal1());
        System.out.println("Numero real 2: " + nuevo.getNumeroReal2());
        
        System.out.println("El mayor es " + nuevo.devolverMayor());
        System.out.println("calcularPotencia da: " + nuevo.calcularPotencia());
        System.out.println("calcularRaiz da: " + nuevo.calcularRaiz());
        
        System.out.println("Prueba de devolver mayor static " + Matematica.devolverMayor(1,2));
    }
    
}
