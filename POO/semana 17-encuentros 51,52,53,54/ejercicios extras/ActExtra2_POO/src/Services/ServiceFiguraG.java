/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.FigGeometrica;
import java.util.Scanner;

/**
 *
 * @author rembecuadro
 */
public class ServiceFiguraG {
    Scanner leer = new Scanner(System.in);   
    
    public FigGeometrica crearFigura() {
        System.out.println("Escoja la figura geométrica");
        System.out.print("1. Cuadrado\n2. Rectángulo\n3. Triángulo\n4. Circulo\n5. Hexagono\n6. Pentágono\n7. Rombo\n-> ");
        
        
        String Figura = leer.next();

        FigGeometrica f = new FigGeometrica();
        
        
        switch (Figura) {
            case "Cuadrado": 
                f.setTipo(Figura);
                System.out.println("Digite el tamaño del lado");
                f.setLado(leer.nextInt());
                break;
                
            case "Rectangulo": 
                f.setTipo(Figura);
                System.out.println("Digite el valor de la base");
                f.setBase(leer.nextInt());
                System.out.println("Digite el valor de la altura");
                f.setAltura(leer.nextInt());              
                break;
                
            case "Triangulo": 
                f.setTipo(Figura);
                System.out.println("Digite el valor de la base");
                f.setBase(leer.nextInt());
                System.out.println("Digite el valor de la hipotenusa");
                f.setHipotenusa(leer.nextInt());
                break;
                
            case "Circulo":
                f.setTipo(Figura);
                System.out.println("Digite el valor del radio");
                f.setRadio(leer.nextInt());
                break;
                
            case "Hexagono":
                f.setTipo(Figura);
                System.out.println("Digite el valor del lado");
                f.setCatetoA(leer.nextInt());
                System.out.println("Digite el valore de la altura\nEste es un valor que va entre el punto medio del lado hasta el centro del hexagono");
                f.setHipotenusa(leer.nextInt());
                break;
                
            case "Pentagono": 
                f.setTipo(Figura);
                System.out.println("Digite el valor del lado");
                f.setCatetoA(leer.nextInt());
                System.out.println("Digite el valore de la altura\nEste es un valor que va entre el punto medio del lado hasta el centro del hexagono");
                f.setHipotenusa(leer.nextInt());
                break;
                
            case "Rombo":
                f.setTipo(Figura);
                System.out.println("Digite el valor de la base");
                f.setBase(leer.nextInt());
                System.out.println("Digite el valor de la altura");
                f.setHipotenusa(leer.nextInt());
                break;
        }
        
        return f;
    }
    
public double areaFigura(FigGeometrica fg) {
 
        switch (fg.getTipo()) {
            case "Cuadrado":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+fg.getLado() * fg.getLado()+"\n");
                break;
                
            case "Rectangulo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+fg.getBase() * fg.getAltura()+"\n");
                break;
                
            case "Triangulo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+(fg.getBase() * fg.getHipotenusa())/2+"\n");
                break;
                
            case "Circulo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+Math.PI * fg.getRadio()* fg.getRadio()+"\n");
                break;
                
            case "Hexagono":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+(6*fg.getCatetoA()*fg.getHipotenusa()/2)+"\n");
                break;
                
            case "Pentagono":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+(5*fg.getCatetoA()*fg.getHipotenusa()/2)+"\n");
                break;
                
            case "Rombo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+fg.getBase() * fg.getAltura()+"\n");
                break;
                
            default: 
                return 0;
        }
        
   return 0;     
    }
    
    public double perimetroFigura(FigGeometrica fg) {

        switch (fg.getTipo()) {
            case "Cuadrado":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+4 * fg.getLado()+"\n");
                break;
            case "Rectangulo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+((2 * fg.getBase())+2*fg.getAltura())+"\n");
                break;

            case "Triangulo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+3 * fg.getBase()+"\n");
                break;
                
            case "Circulo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+2 * Math.PI * fg.getRadio()+"\n");
                break;
                            
            case "Hexagono":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+6*fg.getCatetoA()+"\n");
                break;
                                
            case "Pentagono":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+5*fg.getCatetoA()+"\n");
                break;
                                
            case "Rombo":
                System.out.print("El area del "+fg.getTipo()+" es igual a "+((2 * fg.getBase())+2*fg.getAltura())+"\n");
                break;
                
            default:
                return 0;
        }

        return 0;
    }
}

