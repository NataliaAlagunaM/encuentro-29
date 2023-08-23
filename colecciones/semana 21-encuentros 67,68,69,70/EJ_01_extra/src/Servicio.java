import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in);
    ArrayList<Integer> listaEnteros = new ArrayList<>();

    public void agregaNumero () {
        int num;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (num != -99) {
                listaEnteros.add(num);
            }
        } while (num != -99);
    }


    public void mostrarNumeros () {
        System.out.println(listaEnteros);

    }

    public void sumaYpromedio () {

        int suma = 0;
        for (Integer aux : listaEnteros) {
            suma += aux;

        }
        double promedio = suma/listaEnteros.size();


        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }


}


