/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej09;

import Entidad.Matematica;

/**
 *
 * @author 57315
 */
public class POOEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Matematica nuevo = new Matematica ();
        nuevo.setNumeroReal1(Math.random()*10);
        nuevo.setNumeroReal2(Math.random()*10);
        
        System.out.println("Numero 1:"+nuevo.getNumeroReal1());
        System.out.println("Numero 2:"+nuevo.getNumeroReal2());

        System.out.println("El mayor es " + nuevo.devolverMayor());
        System.out.println("CalcularPotencia da: "+ nuevo.calcularPotencia());
        System.out.println("calcularRaiz da: "+ nuevo.calcularRaiz());
    }
    
}
