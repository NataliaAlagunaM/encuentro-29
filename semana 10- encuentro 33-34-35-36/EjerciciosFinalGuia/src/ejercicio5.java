
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

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
        int doble=num*2;
        int triple=num*3;
        double raiz=Math.sqrt(num);
        
        System.out.println("El número original es: "+num+", el doble es "+doble+", el triple es "+triple+" y la raíz cuadrada es "+raiz);
    }
    
}
