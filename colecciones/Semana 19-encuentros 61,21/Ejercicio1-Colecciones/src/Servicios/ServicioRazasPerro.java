/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RazasPerro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ceciy
 */
public class ServicioRazasPerro {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList razas = new ArrayList();
        
        
    public void guardarRazas(int cantidad){
        
        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese una raza");
            RazasPerro r = new RazasPerro(leer.nextLine());
            razas.add(r);
             
        }
        
        
    }
    
    public void mostrarRazas(){
        razas.forEach((raza) -> {
            System.out.println(raza.toString());
            });
    }
    
    public void menu(int opc){

        switch (opc) {
            case 1:
                guardarRazas(1);
                break;
            case 2:
                mostrarRazas();
                break;
        }


    }
    public void eliminarRaza(){

    String raza = leer.nextLine();
        boolean existe = false;
        Iterator<String> iterator = razas.iterator();

        while (iterator.hasNext()) {
            String aux = iterator.next();
            if (aux.equals(raza)) {
                iterator.remove();
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("La raza " + raza + " no existe en la lista razas");
        }
        Collections.sort(razas);
        System.out.println(razas);
    }
}
