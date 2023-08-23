/*
 Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package coleccionesextra2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author anben
 */
public class CantantesService {

    Scanner s = new Scanner(System.in).useDelimiter("\n");
    Scanner n = new Scanner(System.in);

    public void menu(ArrayList<CantanteFamoso> listaCantantesFamosos) {
       int opcion;
        do {             
            
        System.out.println(" \n"
               + "---MENU---\n"
                + "1. Agregar un cantante\n"
                + "2. Mostrar cantantes\n"
                + "3. Eliminar cantante\n"
                + "4. Salir\n"
                + "-------\n");
         opcion = n.nextInt();

        switch (opcion) {
            case 1:
                agregarCantante(listaCantantesFamosos);
                break;
            case 2:
                mostrarCantantes(listaCantantesFamosos);
                break;
            case 3:
                eliminarCantantes(listaCantantesFamosos);
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("opción inválida");
        }
 } while (opcion!=4);
    }

    public void agregarCantante(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        System.out.println("ingresar el nombre del cantante");
        String nombre = s.next();
        System.out.println("ingresar el nombre del album");
        String album = s.next();

        listaCantantesFamosos.add(new CantanteFamoso(nombre, album));

    }

    public void mostrarCantantes(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        System.out.println("Lista de cantantes:" + listaCantantesFamosos.toString());
    }

    public void eliminarCantantes(ArrayList<CantanteFamoso> listaCantantesFamosos) {
        System.out.println("ingresar el nombre del cantante a eliminar");
        String nombreElim = s.next();

        Iterator<CantanteFamoso> it = listaCantantesFamosos.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombreElim)) {
                it.remove();
            }

        }
    }
}
