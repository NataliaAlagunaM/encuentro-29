/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import entidad.DNI;
import entidad.Persona;

/**
 *
 * @author Natalia Alaguna
 */
public class EjercicioPersona {
/*
    EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
    */
    public static void main(String[] args) {
        DNI d1 = new DNI();
        d1.setSerie('A');
        d1.setNumero(1234);
        
        Persona p1 = new Persona();
        p1.setNombre("Natalia");
        p1.setApellido("Alaguna");
        p1.setDni(d1);
        
        System.out.println(p1);
    }
}
