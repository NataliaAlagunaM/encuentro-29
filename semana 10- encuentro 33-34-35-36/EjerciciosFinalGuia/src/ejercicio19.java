
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

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
     int numero;
    int [][] matriz=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.println("ingresa un número para la posicion ["+i+","+j+"]: ");
            numero=leer.nextInt();
            matriz[i][j]= numero;  
            }
        }
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"    ");
            }
            System.out.println("");
        }
        System.out.println("la matriz transpuesta es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i]+"    ");
            }
            System.out.println("");
        }
        boolean verificacion=false;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz [i][j]==-matriz[j][i]) {
                    verificacion=true;
                } else {
                    verificacion=false;
                }
            }
 
        }
        if (verificacion==true) {
             System.out.println("la matriz es anti simétrica");
        } else {
                    System.out.println("la matriz es simétrica");
        }
    }
    
}
