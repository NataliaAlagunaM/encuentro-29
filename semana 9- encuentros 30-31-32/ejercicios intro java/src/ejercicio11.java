/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */

//ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen 
//sin cambios.
//	a e i o u
//	@ # $ % *
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura "según" para la 
//transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//NOTA: investigue el uso de la función concatenar de PSeInt para armar la palabra/frase.
import java.util.Scanner;
public class ejercicio11 {
      public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese una frase con punt al final");
          String frase=leer.nextLine();
          //longitud de la frase
          int longitud=frase.length();
 /*         while ((frase.substring(longitud-1,longitud))!= "."){
              System.out.println("Ingrese una frase con punt al final");
              frase=leer.nextLine();
          }*/
 
          String fraseFinal=cambiarFrase(frase);
      }
      
      public static String cambiarFrase(String frase){
      System.out.println("Ingrese una frase con punt al final");
   
      String fraseFinal;
      int longitud=frase.length();
      char letra;
          for (int i = 0; i < longitud ; i++) {
              letra=frase.substring(i,i);
          }
      return=fraseFinal;
}
}

