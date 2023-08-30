/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author max72
 */
public class JavaApplication2 {
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = llenarMatrizManual();
        if (esMatrizMagica(matriz))
            System.out.println("Soy magica");
        else
            System.out.println("No soy magica");
        
        

    }
    
        public static int [][] llenarMatrizManual(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamanio a inicializar: ");
        int size = leer.nextInt();
        int [][] vector = new int [size][size];
        for (int i = 0; i<size; i++)
            for (int j = 0; j<size; j++){
                vector[i][j] = leer.nextInt();
            }
        return vector;
    }
    
    public static boolean esMatrizMagica(int [][] matriz ){
        int sumaOriginal = 0, sumaNueva = 0;
        int tam = matriz.length;
        for (int i = 0;i<tam;i++){
        sumaOriginal += matriz[0][i];
        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                sumaNueva += matriz[i][j];
            }
            if (sumaNueva != sumaOriginal)
                return false;
            else
                sumaNueva = 0;
        }
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                sumaNueva += matriz[j][i];
            }
            if (sumaNueva != sumaOriginal)
                return false;
            else
                sumaNueva = 0;
        }
        for (int i = 0; i < tam; i++) {
            sumaNueva += matriz[i][i];
        }
        
        if (sumaNueva != sumaOriginal)
                return false;
            else
                sumaNueva = 0;
        
        for (int i = 0; i < tam; i++) {
            sumaNueva += matriz[i][tam-1-i];
        }
     
        return sumaNueva==sumaOriginal;
 
    }
}

