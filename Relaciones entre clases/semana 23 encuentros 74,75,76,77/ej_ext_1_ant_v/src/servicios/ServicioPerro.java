package servicios;

import entidades.Perro;
import entidades.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerro {

    static ArrayList<Perro> listaPerros = new ArrayList<Perro>();

    Scanner leer =new Scanner(System.in).useDelimiter("\n");

    public void crearPerro(){

        Perro perro1=new Perro();
        System.out.println("Ingresa el nombre del perro: ");
        perro1.setNombre(leer.next());
        System.out.println("Ingresa la raza del perro: ");
        perro1.setRaza(leer.next());
        listaPerros.add(perro1);

    }

    public void fabricarPerro(){
        String respuesta="";
        do{
            crearPerro();
            System.out.println("Deseas crear otro perro? (S/N) ");
            respuesta=leer.next();
        }
        while(respuesta.equalsIgnoreCase("s"));

    }

    public static void mostrarPerros(){

       if(!listaPerros.isEmpty()) {
           System.out.println(listaPerros.toString());
       }
    }

}
