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
        
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        return a1;
    }
    
    public void mostrarArreglo(){
        System.out.println(Arrays.toString(a1.getArregloA()));
    }
    
    public void ordenarArreglo(){
        
    }
}
