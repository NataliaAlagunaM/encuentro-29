/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;

    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }
    
    public Vehiculo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la marca");
        this.marca = leer.nextLine();
        System.out.println("Escriba el modelo");
        this.modelo = leer.nextLine();
        System.out.println("Escriba el anio");
        this.anio = leer.nextInt();
        System.out.println("Escriba el tipo (bicicleta,auto,moto)");
        this.tipo = leer.next();
    }
    
    private int moverse(int segundos){
        switch (this.tipo){
            case "auto":
                return segundos*3;
            case "moto":
                return segundos*2;
            case "bicicleta":
                return segundos;
        }
        return -1;
    }

    private int frenar(){
        if (this.tipo.equals("auto") || this.tipo.equals("moto"))
            return 2;
        else
            return 0;
    }
    
    public int moverseYfrenar(int segundos){
        return moverse(segundos) + frenar();
    }

    
}
