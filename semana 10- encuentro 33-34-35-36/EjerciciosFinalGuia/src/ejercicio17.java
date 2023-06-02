
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

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos)*/
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("ingrese la dimensión del vector");
        int num=leer.nextInt();
        int numero;
        int [] vector= new int [num];
        for (int i = 0; i < num; i++) {
            //numero aleatorio entre 1 y 100
            numero = (int)(Math.random()*100+1);
            vector[i]= numero;
        }
        System.out.print("[ ");
        for (int i = 0; i < num; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.print("]");
        
        int contador=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        
        for (int i = 0; i < num; i++) {
        String x = String.valueOf(vector[i]);
        int cantidadDig=x.length();
            switch (cantidadDig) {
                case 1:
                    contador=contador+1;
                    System.out.println("hay "+contador+" números que tienen 1 digito");
                    break;
                case 2:
                    contador2=contador2+1;
                    System.out.println("hay "+contador2+" números que tienen 2 digitos");
                    break;
                case 3:
                    contador3=contador3+1;
                    System.out.println("hay "+contador3+" números que tienen 3 digitos");
                    break;
                case 4:
                    contador4=contador4+1;
                    System.out.println("hay "+contador4+" números que tienen 4 digitos");
                    break;
                case 5:
                    contador5=contador5+1;
                    System.out.println("hay "+contador5+" números que tienen 5 digitos");
                    break;
                default:
                    break;
                    
            }
            /*if (contador>=1) {
                    System.out.println("hay "+contador+" números que tienen 1 digito");
                } else if (contador2>=1){
                    System.out.println("hay "+contador2+" números que tienen 2 digitos");
                } else if (contador3>=1){
                    System.out.println("hay "+contador3+" números que tienen 3 digitos");
                } else if (contador4>=1){
                    System.out.println("hay "+contador4+" números que tienen 4 digitos");
                } else if (contador5>=1){
                    System.out.println("hay "+contador5+" números que tienen 5 digitos");
                }*/
        }
            
                
           
   
        
    }
    
}
