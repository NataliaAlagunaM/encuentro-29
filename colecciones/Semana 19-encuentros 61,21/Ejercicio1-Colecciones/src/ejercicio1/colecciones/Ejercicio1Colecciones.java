/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.colecciones;

import Servicios.ServicioRazasPerro;
import java.util.Scanner;

/**
 *
 * @author ceciy
 */
public class Ejercicio1Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList. */
        
        ServicioRazasPerro sr = new ServicioRazasPerro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de razas a agregar");
        int cantidad = leer.nextInt();
        
        sr.guardarRazas(cantidad);
        
        int opc;
        do{
            do{
                System.out.println("1) Agregar una raza más");
                System.out.println("2) Salir");
                opc = leer.nextInt(); 
                
                sr.menu(opc);
                
                
                }while(opc != 2);
           
        }while(opc !=1 && opc !=2);
        
        sr.eliminarRaza();
        sr.mostrarRazas();
        
    }
    
    
    
}
