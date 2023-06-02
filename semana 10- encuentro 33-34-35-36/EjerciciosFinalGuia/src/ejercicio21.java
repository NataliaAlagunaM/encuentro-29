
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

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.*/
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int [][] matrizM=new int [10][10];
    int [][] matrizP=new int [3][3];
    
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            System.out.println("ingresa un número para la posicion ["+i+","+j+"]: ");
            int numero=leer.nextInt();
            matrizM[i][j]= numero;  
            }
        }
    
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.println("ingresa un número para la posicion ["+i+","+j+"]: ");
            int numero=leer.nextInt();
            matrizP[i][j]= numero;  
            }
        }
    
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizM[i][j]+"    ");
            }
            System.out.println("");
        }
    
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizP[i][j]+"    ");
            }
            System.out.println("");
        }
    
    subMatrizContenida(matrizM,matrizP);
    
    }
    public static void subMatrizContenida(int[][] matrizM, int[][] matrizP) {
  int coinciden=0;
  for(int i=0;i<10;i++) {
   for(int j=0;j<10;j++) {
    
    if((matrizM[i][j]==matrizP[0][0])&&((i+2<10)&&(j+2<10))) {
     for(int k=0;k<3;k++) {
      for(int l=0;l<3;l++) {
       if(matrizM[i+k][j+l]==matrizP[k][l]) {
        coinciden++;
       }
      }
     }
     if (coinciden==9) {
      System.out.println("Matriz P se encuentra dentro de Matriz M en los indices ["+i+"]["+j+"]"); 
     }
    }
   }
  }
  
 }
}
