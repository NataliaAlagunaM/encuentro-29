package Services;

import java.util.Scanner;

public class ServicioMenu {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private ServicioProducto servicioProducto = new ServicioProducto();

    public void inicializarMenu(){
        int eleccion;
        do {
            System.out.println(
                    "Que accion deseas realizar en la tienda ? \n " +
                            "1. Anadir producto al inventario. \n " +
                            "2. Actualizar precio del producto por nombre. \n " +
                            "3. Descontar/Eliminar del inventario. \n " +
                            "4. Mostrar producto por nombre. \n " +
                            "5. Mostrar todos los productos. \n " +
                            "6. Salir. \n "
            );
            eleccion = input.nextInt();
            switch (eleccion){
                case 1:
                    servicioProducto.anadirProducto();
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del producto que deseas actualizar :");
                    servicioProducto.actualizarProducto(input.next());
                    break;
                case 3:
                    System.out.println("Ingresa el nombre del producto que deseas descontar/eliminar del inventario :");
                    String nombre = input.next();
                    System.out.println("Ingresa la cantidad que deseas descontar al producto : ");
                    int cantidad = input.nextInt();
                    servicioProducto.borrarProducto(nombre, cantidad);
                    break;
                case 4:
                    System.out.println("Ingresa el nombre del producto que deseas consultar :");
                    servicioProducto.leerProductoPorNombre(input.next());
                    break;
                case 5:
                    servicioProducto.leerProductos();
                    break;
                case 6:
                    System.out.println("Has salido de la aplicacion con exito!");
                    break;
                default:
                    System.out.println("Ingresa una opcion correcta (del 1 al 6) : ");
            }
        } while(eleccion != 6);
    }

}
