/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrancael10;

//import clases.Matematica;

import clases.Movil;
import clases.sumaEstatica;
import java.util.Date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author max72
 */
public class ArrancaEl10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {/*
        Matematica nuevo = new Matematica ();
        
        nuevo.setNumeroReal1(Math.random()*100);
        nuevo.setNumeroReal2(Math.random()*100);
        
        System.out.println("Numero real 1: " + nuevo.getNumeroReal1());
        System.out.println("Numero real 2: " + nuevo.getNumeroReal2());
        
        System.out.println("El mayor es " + nuevo.devolverMayor());
        System.out.println("calcularPotencia da: " + nuevo.calcularPotencia());
        System.out.println("calcularRaiz da: " + nuevo.calcularRaiz());
        
        System.out.println("Prueba de devolver mayor static " + Matematica.devolverMayor(1,2));
        */
         //EJERCICIO 12 creo que no necesitamos ayuda de nadie.
        //No pregunten como lo hicimos
        /*
        String fecha1 = "2023-01-01";
        String fecha2 = "2023-06-21";
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);

        LocalDate fechaInicio = LocalDate.parse(fecha1, formatter);
        LocalDate fechaFinal = LocalDate.parse(fecha2, formatter);

        Period periodo = Period.between(fechaInicio, fechaFinal);

        System.out.println("La diferencia entre las dos fechas es: "
                + periodo.getYears() + " años, "
                + periodo.getMonths() + " meses, y "
                + periodo.getDays() + " días.");
*/
        
        /*
        Date hoy = new Date ();
        Date hace3dias = new Date ("2020/06/20");
        
        int anios = hoy.getYear() - hace3dias.getYear();
        System.out.println("anios " + anios);
        */
        /*
        //INSTANCIO UNA VEZ LA SUMA ESTATICA
        sumaEstatica nueva = new sumaEstatica(1,2);
        //LLAMO A LA FUNCION DESDE SU INSTANCIA (NUEVA)
        System.out.println("la suma es " + nueva.sumarSoloInstanciada());
        //LLAMO A LA FUNCION DESDE SU OBJETO (SIN LLAMAR A NUEVA) Y LE MANDO SUS VALORES.
        System.out.println("Suma sin instanciar de 3 y 4 es " + sumaEstatica.sumarSinInstanciar(3, 4));*/
        
        Movil nuevo = new Movil ();
        nuevo.cargarCelular();
        nuevo.ingresarCodigo();
        System.out.println(nuevo.toString());
        
            }
    
}
