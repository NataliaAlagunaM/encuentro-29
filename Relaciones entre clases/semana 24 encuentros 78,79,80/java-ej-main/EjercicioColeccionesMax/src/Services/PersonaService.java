/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Classes.Persona;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class PersonaService {
    Persona persona;
    Scanner leer;

    public Persona PersonaService() {
        leer = new Scanner(System.in).useDelimiter("\n");
        return crearPersona();
    }
    
    public Persona crearPersona(){
        leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese DNI");
        String dni = leer.next();
        System.out.println("Ingrese pais");
        String pais = leer.next();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        this.persona = new Persona(nombre,edad,dni,pais);
        return persona;
    }
    
    public Persona cambiarPersona(Persona p,String n,int e,String dni,String pais){
        p.setNombre(n);
        p.setEdad(e);
        p.setPais(pais);
        p.setDni(dni);
        return p;
    }
    
    
}
