/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */
//acá se importa el scanner
import java.util.Scanner;
public class ejercicio5 {
    //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
    //Scanner.
    public static void main(String[] args) {
       //se debe poner para scanner
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese si es true o false");
        boolean verdad=leer.nextBoolean();
        System.out.println(verdad);
        
        System.out.println("Ingrese un decimal");
        double num=leer.nextDouble();
        System.out.println(num);
        
        System.out.println("Ingrese un carácter");
        
        //recordar que cambia cuando es caracter
        char letra=leer.next().charAt(0);
        System.out.println(letra);
    }
    
}
