package Services;

import Entities.Producto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServicioProducto {

    /* CRUD -> C : Create / R : Read / U : Update / D : Delete */

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    private HashMap<String, Producto> inventario = new HashMap<>();

    /* Crear */

    public void anadirProducto(){
        System.out.println("Ingresa el nombre del producto : ");
        String nombreProducto = input.next();
        System.out.println("Ingresa el precio del producto : ");
        double precioProducto = input.nextDouble();
        System.out.println("Ingresa la cantidad del producto : ");
        int cantidadProducto = input.nextInt();
        if(inventario.get(nombreProducto) == null){
            inventario.put(nombreProducto, new Producto(nombreProducto, precioProducto, cantidadProducto));
        }
    }

    /* Leer producto por nombre y leer todos los productos */

    /* Regular Expression */

    /* Comida Italiana
    * Comida Mexicana
    * */

    public void leerProductoPorNombre(String nombreProducto){
        Pattern pattern = Pattern.compile(nombreProducto, Pattern.CASE_INSENSITIVE);
        boolean encontrado = false;
        for (Map.Entry<String, Producto> entry : inventario.entrySet()){
            Matcher matcher = pattern.matcher(entry.getKey());
            if (matcher.find()){
                System.out.println(entry.getKey() + " - " + entry.getValue());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontro el producto en el inventario.");
        }
        /*
        if (inventario.get(nombreProducto) != null){
            System.out.println(inventario.get(nombreProducto).toString());
        } else {
            System.out.println("No se encontro el producto en el inventario.");
        }

         */
    }

    public void leerProductos(){
        System.out.println(inventario);
    }

    /* Actualizar producto */

    public void actualizarProducto(String nombreProducto){
        Producto producto = inventario.get(nombreProducto);
        if (producto != null){
            System.out.println("Ingresa el nuevo precio del producto : ");
            producto.setPrecioProducto(input.nextDouble());
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    /* Borrar producto */

    public void borrarProducto(String nombreProducto, int cantidad){
        Producto producto = inventario.get(nombreProducto);
        if (producto != null){
            if (producto.getCantidadProducto() > cantidad){
                System.out.println("Hay " + cantidad + " menos de " + producto.getNombreProducto() + " en el stock.");
                producto.setCantidadProducto(producto.getCantidadProducto() - cantidad);
            } else {
                System.out.println("Se ha eliminado el producto " + producto.getNombreProducto() + " del inventario.");
                inventario.remove(nombreProducto);
            }
        }
    }




}
