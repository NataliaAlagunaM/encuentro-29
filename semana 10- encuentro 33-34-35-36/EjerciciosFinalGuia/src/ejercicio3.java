/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */
import java.util.Scanner;
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.*/
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        String fraseMinuscula=frase.toLowerCase();
        String fraseMayuscula=frase.toUpperCase();
        
        System.out.println("La frase original es: "+frase);
        System.out.println("La frase en minúsculas es: "+fraseMinuscula);
        System.out.println("La frase en mayúsculas es: "+fraseMayuscula);
    }
    
}
