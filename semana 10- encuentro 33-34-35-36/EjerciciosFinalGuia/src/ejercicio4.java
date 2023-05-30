
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

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centígrados");
        double tempC=leer.nextDouble();
        double tempF=fahrenheit(tempC);
        System.out.println("La temperatura en grados Fahrenheit es de: "+tempF+"°F");
    }
    
    public static double fahrenheit(double tempC){
        return 32 + (9 * tempC / 5);
    }
}
