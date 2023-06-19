/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        this.radio=leer.nextDouble();
    }
    
    public double area(){
        return PI*this.radio*this.radio;
    }
    
    public double perimetro (){
        return 2*PI*this.radio;
    }
   
}
