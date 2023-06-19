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
public class Operacion {
    private int numero1;
    private int numero2;
   
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
  

    public Operacion() {
    }
   
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
   
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
   
    public int getNumero1(){
        return this.numero1;
    }
   
    public int getNumero2(){
        return this.numero2;
    }
   
    public void crearOperacion(){
        System.out.println("Ingresa tu numero 1");
        Scanner leer = new Scanner(System.in);
        this.numero1 =leer.nextInt() ;
        System.out.println("Ingresa tu numero 2");
        this.numero2 =leer.nextInt() ;
       
    }
   
    public int sumar(){
        return this.numero1 + this.numero2;
    }
   
    public int restar(){
        return this.numero1 - this.numero2;
    }
   
    public int multiplicar(){
       
        if( this.numero1 == 0 || this.numero2 == 0){
            System.out.println("Error! Uno de tus numeros es 0");
            return 0;
        }
            return this.numero1 * this.numero2;
   
    }
   
    public double dividir(){
       
        if( this.numero1 == 0 || this.numero2 == 0){
            System.out.println("Error! Uno de tus numeros es 0");
            return 0;
        }
            return this.numero1 / this.numero2;
       
       
    }
    
    
}