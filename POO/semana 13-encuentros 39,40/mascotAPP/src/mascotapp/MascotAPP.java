/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author 57315
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // crear objeto
        //a la izquierda donde se asigna el objeto
        //a la derecha hago nacer el objeto
        Mascota m1 = new Mascota();
        
        //caracteristicas a la mascota, dar nombre a la variable m1
        
        m1.apodo="chiquito";
        m1.nombre="Fernando Chiquito";
        m1.tipo="Perro";
        m1.edad=14;
        m1.raza="Beagle";
        m1.cola=true;
        m1.color="Tricolor";
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo);
        
//    public String nombre;
//    public String apodo;
//    //conejo, perro, gato, loro, carpincho
//    public String tipo;
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
    }
    
}
