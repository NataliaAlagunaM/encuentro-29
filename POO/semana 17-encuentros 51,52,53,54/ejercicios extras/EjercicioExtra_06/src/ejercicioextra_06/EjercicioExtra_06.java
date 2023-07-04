/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_06;

import Servicio.ServicioAhorcado;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_06 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {

        ServicioAhorcado sa = new ServicioAhorcado();
        sa.crearJuego();
        
        sa.longitud();
        
        while (sa.ahorcado01.getCantidadJugadas() > 0 && !sa.ahorcado01.isFinJuego()) {            
            System.out.println("ingrese una letra a buscar");
            char letra = entrada.next().charAt(0);
            sa.buscar(letra);
            sa.imprimirVector();
            sa.finJuego();
        }
        
    }
    
}
