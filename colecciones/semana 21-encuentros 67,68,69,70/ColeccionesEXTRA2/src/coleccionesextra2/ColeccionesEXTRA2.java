/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package coleccionesextra2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anben
 */
public class ColeccionesEXTRA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useDelimiter("\n");
        ArrayList<CantanteFamoso> listaCantantesFamosos = new ArrayList();
        
        CantantesService cs = new CantantesService();
                
        System.out.println("cuántos cantantes ingresará?");
        int cantidadCant = s.nextInt();
        for (int i = 0; i < cantidadCant; i++) {
           cs.agregarCantante(listaCantantesFamosos);
        }
          cs.mostrarCantantes(listaCantantesFamosos);
        
          
          cs.menu(listaCantantesFamosos);
         
        /*   CantanteFamoso cf1 = new CantanteFamoso("Adele", "22");
        listaCantantesFamosos.add(cf1);
        CantanteFamoso cf2 = new CantanteFamoso("Dua Lipa", "x");
        listaCantantesFamosos.add(cf2);
        CantanteFamoso cf3 = new CantanteFamoso("Shakira", "Moscas");
        listaCantantesFamosos.add(cf3);
        CantanteFamoso cf4 = new CantanteFamoso("Police", "sting");
        listaCantantesFamosos.add(cf4);
        CantanteFamoso cf5 = new CantanteFamoso("Taylor Swift", "1989");
        listaCantantesFamosos.add(cf5);
        listaCantantesFamosos.add(new CantanteFamoso(nombre, album));
         */
      

    }

}
