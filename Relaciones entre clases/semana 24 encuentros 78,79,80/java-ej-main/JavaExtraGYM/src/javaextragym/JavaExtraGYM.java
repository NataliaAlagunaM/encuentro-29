/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextragym;


import javaextragym.Sources.Classes.Rutina;
import javaextragym.Sources.Services.*;

/**
 *
 * @author max72
 */
public class JavaExtraGYM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    RutinaService todasLasRutinas = new RutinaService();
    todasLasRutinas.crearRutina(new Rutina());
    
           
    }

}
