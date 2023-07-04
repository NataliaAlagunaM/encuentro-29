/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado o vacío
    public Cafetera() {
    }
    
    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    // Métodos getters y setters.
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    /* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
    
    public void servirTaza(){
        Scanner leer = new Scanner(System.in);
        int cantidadRestante;
        System.out.println("Ingrese el tamaño de la taza vacia: ");
        int tamanoTaza=leer.nextInt();
        this.capacidadMaxima=tamanoTaza;
        System.out.println("¿Cuánto desea servir ?");
        int cantidad=leer.nextInt();
        this.cantidadActual=this.capacidadMaxima-cantidad;
        if (this.cantidadActual<this.capacidadMaxima && this.cantidadActual>0) {
            System.out.println("Aún no se ha llenado la taza");
            cantidadRestante=this.capacidadMaxima-this.cantidadActual;
            System.out.println("Quedan "+cantidadRestante+" ml disponibles para llenar la taza");
        } else if(this.cantidadActual==0){
            System.out.println("La taza se ha llenado exactamente con el límite máximo");
        } else if(this.cantidadActual<0){
            System.out.println("La taza se ha llenado mas del límite");
        }
        
    }
    
   //  Método vaciarCafetera(): pone la cantidad de café actual en cero.

    public void vaciarCafetera(){
        this.cantidadActual=0;
        System.out.println("se ha vaciado la cafetera, la cantidad actual de café en la cafetera es: "+this.cantidadActual);
    }
    
    do {
            
        } while (true);
                 
}
