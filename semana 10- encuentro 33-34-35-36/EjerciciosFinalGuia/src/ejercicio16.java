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

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/

public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
    
    int [] vector=new int [n];
    int numero;
    int contador;
    contador=0;
        for (int i = 0; i < n; i++) {
            //numero aleatorio entre 1 y 10
            numero = (int)(Math.random()*10+1);
            vector[i]= numero;
        }
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.print("]");
        
        System.out.println("");
        System.out.println("Ingrese el número que desea buscar: ");
        int buscar=leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i]==buscar) {
                contador=contador+1;
                System.out.println("El numero se encuentra en la posición: "+i); 
            }
        }
        if (contador>1) {
            System.out.println("El número "+buscar+" se encuentra repetido "+contador+" veces");
        } else if(contador==0){
            System.out.println("El número "+buscar+" no se encuentra en el vector");
        } else if (contador==1){
            System.out.println("El número "+buscar+" se encuentra 1 vez");
        }
    }
    
}
