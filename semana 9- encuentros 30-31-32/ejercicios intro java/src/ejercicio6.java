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
public class ejercicio6 {
/*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1= leer.nextInt();
        System.out.println("Ingrese otro número:");
        int num2= leer.nextInt();
        if (num1>25 && num2>25){
            System.out.println("Ambos números son mayores a 25");
        } else if (num1>25 || num2>25){
            System.out.println("Uno de los números es mayor a 25");
        } else {
            System.out.println("Ningún número es mayor a 25");
        }
    }}
