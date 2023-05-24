/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int num,i,suma;
        //se define i como contador
        i=0;
        //se inicializa la suma de los numeros ingresados
        suma=0;
            do {
                System.out.println("Ingrese un número");
                num=leer.nextInt();
                 i=i+1;
                 if (num<0){
                     suma=suma;
                 } else {
                     suma=suma+num;
                 }
                 if (num==0){
                     System.out.println("Se detectó el 0");
                 }
                }while (num!=0 && i<20);

            System.out.println("El total de la suma es de:" + suma);
        
  
    
    }
}
