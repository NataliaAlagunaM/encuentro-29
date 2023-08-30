/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    public void Rectangulo (double base,double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void crearConDatosUsuario(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese base");
        this.base = leer.nextDouble();
        System.out.println("Ingrese altura");
        this.altura = leer.nextDouble();
        System.out.println("Gracias humano");
    }
    
    public double perimetro (){
        return this.base*2 + this.altura *2;
    }
    
    public double superficie (){
        return this.base*this.altura;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i<this.altura; i++){
            for (int j = 0; j<this.base; j++){
                if (i== 0 || i == this.altura-1 || j == 0 || j == this.base-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    
}
