
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

/*Crear un programa que dado un numero determine si es par o impar.*/
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número a evaluar");
        int num=leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número "+num+" es par");
        } else{
            System.out.println("El número "+num+" es impar");
        }
    }
    
}
