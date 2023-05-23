/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.*/
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la nota");
        double nota=leer.nextDouble();
        while (nota<0 || nota>10){
            System.out.println("Ingrese la nota");
            nota=leer.nextDouble();
        }
        System.out.println("La nota se encuentra entre 0 y 10");
    }
}
