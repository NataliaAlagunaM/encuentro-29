/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoService;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class ProductoService {

    public HashMap <String,Double> tienda;

    public ProductoService() {
        tienda = new HashMap();
    }

    public void agregarProducto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del prod");
        String nombre = leer.nextLine();
        System.out.println("Ahora el precio");
        Double precio = leer.nextDouble();
        tienda.put(nombre, precio);

    }

    public void eliminarProducto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del prod a borrar");
        String nombre = leer.nextLine();
        tienda.remove(nombre);
    }

    public void editarPrecio() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre del prod a cambiar precio");
        String nombre = leer.nextLine();
        System.out.println("Ingrese precio");
        Double precio = leer.nextDouble();
        tienda.replace(nombre, precio);
    }

    public void mostrarProductos() {
        for (Map.Entry<String, Double> aux : tienda.entrySet()) { // agrego aux
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Nombre: " + key + "\nPrecio: " + value + "\n");
        }
    }
}
