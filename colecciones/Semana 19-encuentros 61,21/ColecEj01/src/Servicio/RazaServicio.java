/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Natalia Alaguna
 */

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/
public class RazaServicio {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList razas = new ArrayList();
        
        
    public void guardarRazas(int cantidad){
        
        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese una raza");
            Raza r = new Raza(leer.nextLine());
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

}
