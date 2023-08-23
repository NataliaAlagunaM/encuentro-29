/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.RazasPerro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ceciy
 */

/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
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
        System.out.println("Ingrese la raza que desea eliminar");
        String r=leer.nextLine();
        razas.stream().filter((_item) -> (razas.contains(r))).forEachOrdered((_item) -> {
            System.out.println("se va a borrar");
            });
        
        

       // Collections.sort(razas);
        mostrarRazas();
    }

}
