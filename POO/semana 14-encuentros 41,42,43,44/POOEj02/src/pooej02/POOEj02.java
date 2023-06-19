/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/

package pooej02;

import Entidad.Circunferencia;

/**
 *
 * @author 57315
 */
public class POOEj02 {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        Circunferencia resultado = new Circunferencia();
        resultado.crearCircunferencia();
        System.out.println("teniendo un radio de: "+resultado.getRadio()+" el área es de: "+resultado.area());
        System.out.println("teniendo un radio de: "+resultado.getRadio()+" el perímetro es de: "+resultado.perimetro());
    }
    
}
