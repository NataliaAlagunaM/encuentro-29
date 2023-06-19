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
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el valor de la base del rectángulo: ");
        this.base=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectángulo: ");
        this.altura=leer.nextDouble();
    }
    
    public double superficie(){
        return this.base*this.altura;
    }
    
    public double perimetro(){
        return (this.base + this.altura)*2;
    }
    
     public void dibujarRectangulo() {
        System.out.println("Su rectángulo luce así:");
        System.out.println("");
        for (int i = 0; i < this.altura; i++) {
            System.out.println("");
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == this.base - 1) {
                        System.out.print("*");

                    } else {

                        System.out.print(" ");
                    }
                }

            }
        }

    }
}
