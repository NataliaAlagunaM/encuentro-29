/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import Servicio.MovilServicio;

/**
 *
 * @author 57315
 */
public class POOEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    MovilServicio ms = new MovilServicio();
    ms.cargarCelular();
    ms.ingresarCodigo();
    
    }
    
}
