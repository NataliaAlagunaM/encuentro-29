/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/


package pooej04;

import Entidad.Rectangulo;

/**
 *
 * @author 57315
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rc1 = new Rectangulo();
        rc1.crearRectangulo();

        System.out.println("La superficie del rectángulo de base " + rc1.getBase() + " y " +  rc1.getAltura()+ " es: ");
        System.out.println(rc1.superficie());
        System.out.println("El perímetro del rectángulo de base " + rc1.getBase() + " y " +  rc1.getAltura()+ " es: ");
        System.out.println(rc1.perimetro());
        rc1.dibujarRectangulo();
    }
    
}
