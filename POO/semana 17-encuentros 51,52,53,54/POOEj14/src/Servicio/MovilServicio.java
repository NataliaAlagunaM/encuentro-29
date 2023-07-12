/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author 57315
 */

/*
Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
public class MovilServicio {
    Scanner leer = new Scanner (System.in);
    Movil celular = new Movil();
    
    public Movil cargarCelular(){
        System.out.println("Agregue la marca del móvil");
        celular.setMarca(leer.nextLine());
        System.out.println("Ingrese el precio del móvil");
        celular.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo del móvil");
        celular.setModelo(leer.nextInt());
        System.out.println("Ingrese la memoria Ram del móvil");
        celular.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento del móvil");
        celular.setAlmacenamiento(leer.nextInt());
        
        return celular;
    }
    
    public void ingresarCodigo(){
        int [] arreglo= new int[7];
        System.out.println("Ingrese el codigo número a número");
        for (int i = 0; i < 7; i++) {
            arreglo[i]=leer.nextInt();
        }  
        celular.setCodigo(arreglo);
        for (int i = 0; i < 7; i++) {
            System.out.print(arreglo[i]);
        }
    }
 
    
}
