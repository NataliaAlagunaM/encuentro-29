/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Circunferencia {
    private double ratio;
    
    public Circunferencia(){
        
    }
    
    public Circunferencia(double ratio ){
        this.ratio = ratio;
        
    }
    
    public void setRatio(double ratio){
        this.ratio = ratio;
    }
    
    public double getRatio (){
    return this.ratio;
    }
    
    public Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ratio");
        double nuevoratio = leer.nextDouble();
        return new Circunferencia(nuevoratio);
    }
    
    public double area (){
        return PI*this.ratio*this.ratio;
    }
    
    public double perimetro(){
        return 2 * PI * this.ratio;
    }
}
