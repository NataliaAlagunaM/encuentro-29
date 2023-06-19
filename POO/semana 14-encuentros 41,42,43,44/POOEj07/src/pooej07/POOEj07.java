/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

import Entidad.Persona;

/**
 *
 * @author 57315
 */

/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
*/
public class POOEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sobrepeso=0;
        int ideal=0;
        int bajo=0;
        
        int menor=0;
        int mayor=0;
        
        for (int i = 1; i <= 4; i++) {
        Persona personai=new Persona();
        System.out.println("persona:"+i);
        personai.crearPersona();
        
        if (personai.calcularIMC() == -1) {
            System.out.println("la persona: " + personai.getNombre() + " está por debajo de su peso ideal");
            bajo += 1;
        } else if (personai.calcularIMC() == 0) {
            System.out.println("la persona: " + personai.getNombre() + " está en su peso ideal");
            ideal += 1;
        } else if (personai.calcularIMC() == 1) {
            System.out.println("la persona: " + personai.getNombre() + " tiene sobrepeso");
            sobrepeso += 1;
        }

        if (personai.esMayorDeEdad() == true) {
            System.out.println("La persona tiene " + personai.getEdad() + " años, es mayor de edad");
            mayor += 1;
        } else if (personai.esMayorDeEdad() == false) {
            System.out.println("La persona tiene " + personai.getEdad() + " años,es menor de edad");
            menor += 1;
        }
        }
        
        System.out.println("El porcentaje de personas por debajo del peso ideal es: "+ ((bajo*100)/4));
        System.out.println("El porcentaje de personas que están en su peso ideal es: "+ ((ideal*100)/4));
        System.out.println("El porcentaje de personas con sobrepeso es: "+ ((sobrepeso*100)/4));
        
        System.out.println("El porcentaje de personas mayores de edad es: "+ ((mayor*100)/4));
        System.out.println("El porcentaje de personas menores de edad es: "+ ((menor*100)/4));
        
    }
    
}
        
