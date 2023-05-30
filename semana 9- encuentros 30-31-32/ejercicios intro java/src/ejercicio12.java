/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */
/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.*/
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese dos números");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        EsMultiplo(num1,num2);
    }  
    
public static void EsMultiplo (int num1, int num2){
    if (num1 % num2 == 0) {
        System.out.println("El primer número es multiplo del segundo");
    }else {
        System.out.println("El primer número no es múltipo del segundo");
    }
}
}

