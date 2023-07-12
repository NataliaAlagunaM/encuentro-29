/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class POOEj11 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); 

    */
    public static void main(String[] args) {
       int dia;
       int mes;
       int anio;
       
       Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el año:");
        anio=leer.nextInt();
        anio-=1900;
        System.out.println("Ingrese el mes:");
        mes=leer.nextInt();
        mes-=1;
        System.out.println("Ingrese el día:");
        dia=leer.nextInt();
        Date fecha;
        fecha = new Date(anio,mes,dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        int anioNvo=fecha.getYear();
        int anioActual=fechaActual.getYear();
        int resta=anioNvo-anioActual;
        
        System.out.println("la diferencia entre los años es de:" + resta*-1);
    }
    
}
