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
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:*/
public class ejercicio10 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int num;
        int num1;
        int num2;
        int num3;
    
        do {
            System.out.println("Ingrese 4 números");
            num=leer.nextInt();
            num1=leer.nextInt();
            num2=leer.nextInt();
            num3=leer.nextInt();
    
        } while ((num<1 || num>20)||(num1<1 || num1>20)||(num2<1 || num2>20)||(num3<1 || num3>20));
        
        System.out.print(num);
            for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
            
        System.out.println("");
        
        System.out.print(num1);
            for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
            
        System.out.println("");
         
        System.out.print(num2);
            for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
            
        System.out.println("");
        
        System.out.print(num3);
            for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
    

 
    }
}
