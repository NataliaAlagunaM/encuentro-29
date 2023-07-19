/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitej01;

import Entidad.DiscountCalculator;
import Servicio.DiscountCalculatorServicio;

/**
 *
 * @author 57315
 */
public class JUnitEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiscountCalculatorServicio p1 = new DiscountCalculatorServicio();
        System.out.println("El resultado es:");
        System.out.println(p1.ObtenerDescuento(new DiscountCalculator(50,200)));
    }
    
}
