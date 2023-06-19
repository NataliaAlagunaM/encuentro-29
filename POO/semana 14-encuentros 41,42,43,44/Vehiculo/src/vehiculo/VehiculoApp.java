/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import Entidad.Vehiculo;
import Servicio.VehiculoService;

/**
 *
 * @author DELL
 */
public class VehiculoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoService vs = new VehiculoService();
        
        Vehiculo vehiculo1 = vs.CrearVehiculo();
        //vs.Frenar(vehiculo1.getTipo());
       
        Vehiculo vehiculo2 = vs.CrearVehiculo();
        //vs.Frenar(vehiculo2.getTipo());
        
        Vehiculo vehiculo3 = vs.CrearVehiculo();
        //vs.Frenar(vehiculo3.getTipo());
       
        //System.out.println("El "+ vehiculo1.getTipo()+ " se movio");
        
        if (vs.Frenar(vehiculo1.getTipo()) > vs.Frenar(vehiculo2.getTipo())){
            
            if (vs.Frenar(vehiculo1.getTipo()) > vs.Frenar(vehiculo3.getTipo())){
                System.out.println("El vehiculo de mayor recorrido es: "+ vehiculo1.getTipo());
            } else {
                      System.out.println("El vehiculo de mayor recorrido es: "+ vehiculo3.getTipo());  
            }    
            } else if (vs.Frenar(vehiculo2.getTipo()) > vs.Frenar(vehiculo3.getTipo())){
                System.out.println("El vehiculo de mayor recorrido es: "+ vehiculo2.getTipo());
            } else{
                System.out.println("El vehiculo de mayor recorrido es: "+ vehiculo3.getTipo());
            }
        }
        
        
    }
    
}
