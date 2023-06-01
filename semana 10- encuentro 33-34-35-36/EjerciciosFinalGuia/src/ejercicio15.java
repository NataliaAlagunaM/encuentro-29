
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

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int dimension=100;
    int[] num = new int[dimension];
    
        for (int i = 0; i < dimension; i++) {
            num[i]=dimension-i;
        }
        System.out.print("[");
        for (int i = 0; i < dimension; i++) {
            System.out.print(+num[i]+" ");
        }
        System.out.println("]");
    }
    
}
