package Servicios;

import Entidades.Persona;

import java.util.Scanner;

public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

public Persona crearPersona(){
    Persona p1 = new Persona();
    System.out.println("Ingrese el nombre:");
    p1.setNombre(leer.next());
    System.out.println("Ingrese la edad:");
    p1.setEdad(leer.nextInt());
    System.out.println("Ingrese el DNI:");
    p1.setDNI(leer.nextInt());
    System.out.println("Ingrese el pais de origen:");
    p1.setPais(leer.next());

   return p1;
}





}
