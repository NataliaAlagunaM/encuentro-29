/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_ext_1_ant_v;

import servicios.ServicioPerro;
import servicios.ServicioPersona;

/**
 *
 * @author jbi
 */
public class Ej_ext_1_ant_v {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ServicioPersona servicioPersona = new ServicioPersona();
        ServicioPerro servicioPerro=new ServicioPerro();

        servicioPerro.fabricarPerro();
        servicioPersona.fabricarPersona();


        // TODO code application logic here
    }
    
}
