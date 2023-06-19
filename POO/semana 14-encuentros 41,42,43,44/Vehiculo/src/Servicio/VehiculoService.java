/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class VehiculoService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Vehiculo CrearVehiculo(){    
        String tipo = "";
        do {
            System.out.println("Insertar tipo: ");
            tipo = leer.next();
        } while (!(tipo.equalsIgnoreCase("auto") || tipo.equalsIgnoreCase("moto") || tipo.equalsIgnoreCase("bici")));
        
        System.out.println("Insertar marca: ");
        String marca = leer.next();
        System.out.println("Insertar modelo: ");
        String modelo = leer.next();
        System.out.println("Insertar anio: ");
        int anio = leer.nextInt();
        
        Vehiculo v1 = new Vehiculo(marca, modelo, anio, tipo);
        
        return v1;
    }
    
    
    
    public int Moverse (String tipo){
        
        System.out.println("Ingrese el tiempo en segundos:");
        int tiempo = leer.nextInt();
        int recorrido = 0;
        
        switch (tipo) {
            case "auto":
                recorrido = tiempo * 3;
                break;
            case "moto":
                recorrido = tiempo * 2;
                break;
            case "bici":
                recorrido = tiempo;
                break;  
        }
        
        return recorrido;
        
    }
    
    public int Frenar(String tipo){
        
        int recorrido = this.Moverse(tipo);
        
        //System.out.println("El recorrido antes de frenar es: "+ recorrido);
        
        switch (tipo) {
            case "auto":
                recorrido += 2;
                break;
            case "moto":
                recorrido += 2;
                break;
            case "bici":
                break;  
        }
        //System.out.println("El recorrido total es: "+ recorrido);
        return recorrido;
    }
    
}
