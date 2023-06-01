
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

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *                    */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el número de elementos:");
        int n=leer.nextInt();
        //parte superior
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        
        //parte central
        for (int i = 0; i < n-2; i++) {
            System.out.print("* ");
            for (int j = 0; j < n-2; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        
        //parte inferior
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        
        
    }
    
}
