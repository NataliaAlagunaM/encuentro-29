/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationpoo;

//ej1
//import Entity.Libro;

//ej2
//import Entity.Circunferencia;

//ej4
//import Entity.Rectangulo;

//ejExtra1
import extra.Vehiculo;

/**
 *
 * @author max72
 */
public class JavaApplicationPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*// EJ 1
        Libro nuevo = new Libro ();
        nuevo.cargarPidiendoDatos();
        nuevo.escribirInfo();
        */
        /* EJ 2
        Circunferencia nueva = new Circunferencia();
        nueva.setRatio(9.99);
        System.out.println(nueva.area());
        System.out.println(nueva.perimetro());
        */
        /*
        EJ 4
        
        *//*
        Rectangulo nuevo = new Rectangulo ();
        nuevo.crearConDatosUsuario();
        nuevo.dibujarRectangulo();
        System.out.println(nuevo.perimetro());
        */
        Vehiculo autito = new Vehiculo();
        
       Vehiculo motito = new Vehiculo();
        Vehiculo labici = new Vehiculo();
        System.out.println("Los vehiculos se mueven as follows: (auto, moto bici)");
        System.out.println(autito.moverseYfrenar(1));
        System.out.println(motito.moverseYfrenar(1));
        System.out.println(labici.moverseYfrenar(1));
        System.out.println(autito.moverseYfrenar(5));
        System.out.println(motito.moverseYfrenar(5));
        System.out.println(labici.moverseYfrenar(5));
        System.out.println(autito.moverseYfrenar(10));
        System.out.println(motito.moverseYfrenar(10));
        System.out.println(labici.moverseYfrenar(10));
        System.out.println(autito.moverseYfrenar(60));
        System.out.println(motito.moverseYfrenar(60));
        System.out.println(labici.moverseYfrenar(60));
        
        
    }
}
