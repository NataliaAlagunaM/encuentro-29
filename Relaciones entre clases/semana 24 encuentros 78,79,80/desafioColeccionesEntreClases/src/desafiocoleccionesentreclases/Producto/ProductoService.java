/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocoleccionesentreclases.Producto;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class ProductoService {
    private ArrayList <Producto> productList = new ArrayList<>();
        
    private void crearProducto() {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("ID:");
        Integer ID = leer.nextInt();
        System.out.println("Precio:");
        float precio = leer.nextFloat();

        Producto p = new Producto(ID, precio);
        productList.add(p);
    }
    
    public void crearProductos(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de productos a crear");
        int cantidad = leer.nextInt();
        
        for (int i = 0; i<cantidad; i++){
            crearProducto();
        }
        
    }
    
    public ArrayList<Producto> getProdList(){
        return productList;
    }
    
    public void mostrarProductos() {
        System.out.println("");
        System.out.println("Se muestra la lista de productos:");
        for (Producto producto : productList) {
            System.out.println("--------------------------");
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("--------------------------");
        }
    }
    
    public void modificarProducto() {
        System.out.println("¿Qué producto deseas modificar?");
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        String opcion = leer.nextLine();

        for (Producto producto : productList) {
            if (producto.getNombre().equals(opcion)) {
                System.out.println("Nuevo IID:");
                producto.setId(leer.nextInt());
                System.out.println("Nuevo nombre:");
                producto.setNombre(leer.nextLine());
                System.out.println("Nuevo precio: ");
                producto.setPrecio(leer.nextFloat());
            }
        }
        System.out.println("Producto " + opcion + " modificado con éxito.");
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el id del producto a eliminar");
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        for(Producto p : productList){
            int elimid = leer.nextInt();
            if (p.getId() == elimid){
                productList.remove(p);
                break;
            }
        }
        System.out.println("Si existia, se elimino. Sino, no. No se puede eliminar lo que no existe.");
    }
    
    
}
