/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra03;

import Servicio.RaicesServicio;

/**
 *
 * @author 57315
 */
public class EjercicioExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio rs = new RaicesServicio();
        rs.crearEcuacion();
        rs.calcular();
        
    }
    
}
