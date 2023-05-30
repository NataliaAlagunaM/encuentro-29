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
/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
    int resultado;
    resultado=suma(num1,num2);
        System.out.println("El resultado de "+num1+"+"+num2+"="+resultado);
    }
public static int suma (int num1, int num2){
      return num1+num2;
}
}
