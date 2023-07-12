/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author 57315
 */
public class ServicioArreglo {
    
    public Arreglo a1 = new Arreglo();
    
    public Arreglo crearArreglo(){
       
        double [] vectorAux = new double [50];
        for (int i = 0; i < 50; i++) {
            vectorAux[i]=Math.random()*100;
        }
        a1.setArregloA(vectorAux);
        
        return a1;
    }
    
    public void mostrarArreglo(){
        System.out.println(Arrays.toString(a1.getArregloA()));
    }
    
    public void ordenarArreglo(){
        double [] vectorAux = new double [50];
        Arrays.sort(a1.getArregloA());
        System.out.println(Arrays.toString(a1.getArregloA()));
    }
    
    public void crearArregloB(){
        double [] vectorAux = new double [20];
        for (int i = 0; i < 20; i++) {
            if (i<10) {   
                vectorAux[i]=a1.getArregloA()[i];
            } else if (i>=10){
                vectorAux[i]=0.5;
            }
            
        }
        a1.setArregloB(vectorAux);
        
        System.out.println(Arrays.toString(a1.getArregloB()));
    }
}
