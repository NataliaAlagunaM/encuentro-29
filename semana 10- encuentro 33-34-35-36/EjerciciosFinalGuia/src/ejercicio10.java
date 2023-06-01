
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor límite positivo");
        int limite=leer.nextInt();
        while (limite<=0){
           System.out.println("ingrese el valor límite positivo");
           limite=leer.nextInt(); 
        } 
        int suma=0;
        do {
            System.out.println("Ingrese un número");
            int num=leer.nextInt();
            suma=suma+num;
            System.out.println(suma);
        } while (suma<limite);
        
    }
    
}
