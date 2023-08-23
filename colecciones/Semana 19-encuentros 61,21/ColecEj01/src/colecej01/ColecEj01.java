/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecej01;

import Servicio.RazaServicio;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class ColecEj01 {
/* 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList. */
        
        RazaServicio sr = new RazaServicio();
        Scanner leer = new Scanner(System.in);

        System.out.println(System.out.println("1) Agregar una raza más");
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
        
      
        
        
        
        
  
        
        
        
        
        
    }
    
    
    


