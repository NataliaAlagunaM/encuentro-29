
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


/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        
        System.out.println("escoja la opción que desea:");
        System.out.println("A. euros a libras ");
        System.out.println("B. euros a dólares ");
        System.out.println("C. euros a yenes ");
        String moneda=leer.nextLine();
        moneda=moneda.toUpperCase();
        
        System.out.println("Ingrese la cantidad de euros que desea convertir:");
        double euros=leer.nextDouble();
        cambio(euros,moneda);
    }
    
    public static void cambio(double euros, String moneda){
        double camb;
        switch (moneda){
            case "A":
                camb=euros*0.86;
                System.out.println("el valor en libras es de:"+camb);
                break;
            case "B":
                camb=euros*1.28611;
                System.out.println("el valor en dólares es de:"+camb);
                break;
            case "C":
                camb=euros*129.852;
                System.out.println("el valor en yenes es de:"+camb);
                break;
        }
    }
}
