
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

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.*/
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.println("ingrese dos numeros enteros positivos");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        menu();
        int opcion=leer.nextInt();
        
        boolean logico=true;
        while (true==logico){
        switch (opcion){
            case 1:
                int suma;
                suma=num1+num2;
                System.out.println(num1+"+"+num2+"="+suma);
                menu();
                opcion=leer.nextInt();
                break;
            case 2:
                int resta;
                resta=num1-num2;
                System.out.println(num1+"-"+num2+"="+resta);
                menu();
                opcion=leer.nextInt();
                break;
            case 3:
                int multiplicacion;
                multiplicacion=num1*num2;
                System.out.println(num1+"*"+num2+"="+multiplicacion);
                menu();
                opcion=leer.nextInt();
                break;
            case 4:
                double division;
                division=num1/num2;
                System.out.println(num1+"/"+num2+"="+division);
                menu();
                opcion=leer.nextInt();
                break;
            case 5:  
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String respuesta=leer.nextLine();
                if (respuesta.equals("S")){
                    logico=false;
                } else if (respuesta.equals("N")){
                    logico=true;
                    menu();
                    opcion=leer.nextInt();
            }
                break;
            
        }
    }
    }
    public static void menu(){
        System.out.println("Seleccione una opción del menú: ");
        System.out.println("");
        System.out.println("Menú:");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.salir");
        System.out.println("Elija otra opción:");
    }
}
