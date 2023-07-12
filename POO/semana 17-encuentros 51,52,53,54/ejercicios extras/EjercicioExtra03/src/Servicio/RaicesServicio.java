/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/*



*/
/**
 *
 * @author 57315
 */
public class RaicesServicio {
    
    Scanner leer = new Scanner (System.in);
    Raices ec1 = new Raices();
    public Raices crearEcuacion (){
        System.out.println("Ingrese el valor de a: ");
        ec1.setA(leer.nextInt());
        
        System.out.println("Ingrese el valor de b: ");
        ec1.setB(leer.nextInt());
        
        System.out.println("Ingrese el valor de c: ");
        ec1.setC(leer.nextInt());
        
        return ec1;
    }
    
    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    
    public double getDiscriminante(){
        double discriminante;
        discriminante=(Math.pow(ec1.getB(), 2))-(4*ec1.getA()*ec1.getC());
        return discriminante;
    }
    
    /*
     Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    
    public boolean tieneRaices(){
        double D = getDiscriminante();
        return D>=0; //si se cumple tiene 2 soluciones
    }
     /*
     Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
    */
    
    public boolean tieneRaiz(){
        double D = getDiscriminante();
        return D==0; //si se cumple tiene unica solución
    }
    
    /*
     Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
    */
    public void obtenerRaices(){
        boolean R=tieneRaices();
        double soluciones,soluciones2;
        
        if (R==true) {
            soluciones = ((-ec1.getB()) + Math.sqrt(Math.pow(ec1.getB(), 2) - (4 * ec1.getA() * ec1.getC()))) / (2 * ec1.getA());
            soluciones2 = ((-ec1.getB()) - Math.sqrt(Math.pow(ec1.getB(), 2) - (4 * ec1.getA() * ec1.getC()))) / (2 * ec1.getA());
            System.out.println("Las soluciones son: "+soluciones+" y "+ soluciones2);
        }
    }
    
    /*
     Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
    */
    
    public void obtenerRaiz(){
        boolean R=tieneRaiz();
        double solucion;
        if (R==true) {
           solucion=(-ec1.getB())/(2*ec1.getA()); 
            System.out.println("La única raíz es: "+ solucion);
        }
    }
    
    /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje. 
    */
    
    public void calcular(){
        if (getDiscriminante()>=0) {
            if (getDiscriminante()==0) {
                obtenerRaiz();
            }else if (getDiscriminante()>0){
                obtenerRaices();
            }
        } else{
            System.out.println("La ecuación no tiene ninguna raíz");
        }
    }
}
