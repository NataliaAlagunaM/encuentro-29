
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */
//Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int dimension=7;
    String[] equipo = new String[dimension];
    
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el nombre del compañero:");
            equipo[i]=leer.nextLine();
        }
        
        for (int i = 0; i < dimension; i++) {
            System.out.print("["+equipo[i]+"  ");
        }
         System.out.println("]");       
    }
}
