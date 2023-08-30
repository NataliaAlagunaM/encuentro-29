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
public class NewClass {

    public static void main(String[] args) {
        
        int[][] M = new int [10][10];
        int[][] P = new int [3][3];
        cargarMatrizEjemplo(M,P);

        int[] position = findSubMatrix(M, P);
        if (position != null) {
            System.out.println("La submatriz P se encontró en M comenzando en la fila " + position[0] + " y la columna " + position[1]);
        } else {
            System.out.println("La submatriz P no se encontró en M");
        }
    }
    

    
    public static void mostrarMatriz(int [][] vector){
        for (int i = 0; i<vector.length; i++){
            for (int j=0; j<vector.length; j++){
                System.out.print("[" + vector[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static void cargarMatrizEjemplo(int[][]matrizM,int[][] matrizP){
		matrizM[0][0]=1;
		matrizM[0][1]=1;
		matrizM[0][2]=1;
		matrizM[0][3]=1;
		matrizM[0][4]=1;
		matrizM[0][5]=1;
		matrizM[0][6]=1;
		matrizM[0][7]=1;
		matrizM[0][8]=1;
		matrizM[0][9]=1;
		matrizM[1][0]=1;
		matrizM[1][1]=1;
		matrizM[1][2]=1;
		matrizM[1][3]=1;
		matrizM[1][4]=1;
		matrizM[1][5]=1;
		matrizM[1][6]=1;
		matrizM[1][7]=1;
		matrizM[1][8]=1;
		matrizM[1][9]=1;
		matrizM[2][0]=1;
		matrizM[2][1]=1;
		matrizM[2][2]=1;
		matrizM[2][3]=1;
		matrizM[2][4]=1;
		matrizM[2][5]=1;
		matrizM[2][6]=1;
		matrizM[2][7]=1;
		matrizM[2][8]=1;
		matrizM[2][9]=1;
		matrizM[3][0]=1;
		matrizM[3][1]=1;
		matrizM[3][2]=1;
		matrizM[3][3]=1;
		matrizM[3][4]=1;
		matrizM[3][5]=1;
		matrizM[3][6]=1;
		matrizM[3][7]=1;
		matrizM[3][8]=1;
		matrizM[3][9]=1;
		matrizM[4][0]=1;
		matrizM[4][1]=1;
		matrizM[4][2]=1;
		matrizM[4][3]=1;
		matrizM[4][4]=36;
		matrizM[4][5]=5;
		matrizM[4][6]=67;
		matrizM[4][7]=1;
		matrizM[4][8]=1;
		matrizM[4][9]=1;
		matrizM[5][0]=1;
		matrizM[5][1]=1;
		matrizM[5][2]=1;
		matrizM[5][3]=1;
		matrizM[5][4]=89;
		matrizM[5][5]=90;
		matrizM[5][6]=75;
		matrizM[5][7]=1;
		matrizM[5][8]=1;
		matrizM[5][9]=1;
		matrizM[6][0]=1;
		matrizM[6][1]=1;
		matrizM[6][2]=1;
		matrizM[6][3]=1;
		matrizM[6][4]=14;
		matrizM[6][5]=22;
		matrizM[6][6]=26;
		matrizM[6][7]=1;
		matrizM[6][8]=1;
		matrizM[6][9]=1;
		matrizM[7][0]=1;
		matrizM[7][1]=1;
		matrizM[7][2]=1;
		matrizM[7][3]=1;
		matrizM[7][4]=1;
		matrizM[7][5]=1;
		matrizM[7][6]=1;
		matrizM[7][7]=1;
		matrizM[7][8]=1;
		matrizM[7][9]=1;
		matrizM[8][0]=1;
		matrizM[8][1]=1;
		matrizM[8][2]=1;
		matrizM[8][3]=1;
		matrizM[8][4]=1;
		matrizM[8][5]=1;
		matrizM[8][6]=1;
		matrizM[8][7]=1;
		matrizM[8][8]=1;
		matrizM[8][9]=1;
		matrizM[9][0]=1;
		matrizM[9][1]=1;
		matrizM[9][2]=1;
		matrizM[9][3]=1;
		matrizM[9][4]=1;
		matrizM[9][5]=1;
		matrizM[9][6]=1;
		matrizM[9][7]=1;
		matrizM[9][8]=1;
		matrizM[9][9]=1;
		
		matrizP[0][0]=36;
		matrizP[0][1]=5;
		matrizP[0][2]=67;
		matrizP[1][0]=89;
		matrizP[1][1]=90;
		matrizP[1][2]=75;
		matrizP[2][0]=14;
		matrizP[2][1]=22;
		matrizP[2][2]=26;
		
	}

    public static int[] findSubMatrix(int[][] M, int[][] P) {
        int n = M.length;
        int m = M[0].length;
        int a = P.length;
        int b = P[0].length;

        for (int i = 0; i <= n - a; i++) {
            for (int j = 0; j <= m - b; j++) {
                boolean match = true;
                for (int x = 0; x < a; x++) {
                    for (int y = 0; y < b; y++) {
                        if (M[i + x][j + y] != P[x][y]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    return new int[] { i, j };
                }
            }
        }

        return null;  // Retorna null si P no se encontró en M
    }
}


