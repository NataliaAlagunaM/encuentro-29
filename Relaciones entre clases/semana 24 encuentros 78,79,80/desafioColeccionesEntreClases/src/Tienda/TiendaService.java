/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import desafiocoleccionesentreclases.Producto.Producto;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class TiendaService {
    ArrayList <Tienda> tiendaList = new ArrayList<>();
    private LinkedHashMap <Producto,Integer> listaConStock = new LinkedHashMap<>();
    
    
    public void crearTienda(ArrayList<Producto> lista) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("ID:");
        Integer ID = leer.nextInt();
        
        tiendaList.add(new Tienda(ID,lista));
    }
    
    public void mostrarTiendas() {
        System.out.println("");
        System.out.println("Se muestra la lista de tiendas:");
        tiendaList.forEach((t) -> {
            System.out.println(t.toString());
        });
    }
    
    public void modificarTienda() {
        System.out.println("¿Qué tienda deseas modificar?");
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        int opcion = leer.nextInt();

        for (Tienda t : tiendaList) {
            if (t.getId() == opcion) {
                System.out.println("Nuevo rep:");
                t.setRepresentante(leer.nextLine());
                System.out.println("Nueva direc: ");
                t.setDireccion(leer.nextLine());
            }
        }
        System.out.println("Producto " + opcion + " modificado con éxito.");
    }
    
    public void eliminarTienda(){
        System.out.println("Ingrese el id de la tienda a eliminar");
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        for(Tienda t : tiendaList){
            int elimid = leer.nextInt();
            if (t.getId() == elimid){
                tiendaList.remove(t);
                break;
            }
        }
        System.out.println("Si existia, se elimino. Sino, no. No se puede eliminar lo que no existe.");
    }
    
    public void agregarProductoATienda(int numTienda){
        
    }
    
    public void venderProductoEnTienda(int numTienda){
        
    }
    
    public void eliminarProductoEnTienda(int numTienda){
        
    }
    
    public void mostrarProductosDeTienda(int numTienda){
        
    }
    
    public void menu(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese cuantos productos desea cambiar");
        int productosACambiar = leer.nextInt();
        System.out.println("Ingrese tienda donde se desean cambiar por ID");
        int tiendaCambiar = leer.nextInt();
        
        for (int i = 0; i<productosACambiar; i++){
            System.out.println("Que queremo hacer? 1. Vender, 2. Mostrar, 3. Eliminar. 4. Agregar");
            int opcion = leer.nextInt();
            
        }
        
    }
}
