package Contenido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author max72 + Rosenrot3585
 */
public class AlquilerService {
    public Alquiler crearAlquiler(Pelicula[] pelis) throws ParseException {
        int opc;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el título de la película que desea alquilar: ");

        System.out.println("indique la pelicula a alquilar ingresando el número:");

        do {

            for (int i = 0; i < pelis.length; i++) {
                System.out.println((i + 1) + " - " + pelis[i].getTitulo());
            }
            opc = leer.nextInt();
        } while (opc < 0 || opc >= pelis.length);

        Pelicula peliculaAlquilada = pelis[opc];

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ingrese la fecha de inicio del alquiler (dd/mm/aaaa)");
        String fechaI = leer.next();
        System.out.println("Ingrese la fecha de finalización del alquiler (dd/mm/aaaa)");
        String fechaF = leer.next();
        Date fechaInicio = formato.parse(fechaI);
        Date fechaFin = formato.parse(fechaF);
        System.out.println("Ingrese el valor diario del alquiler:");
        int precio = leer.nextInt();

        return new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
    }
    
    public void calcularTotalServicio(Alquiler[] alquileres) {
        double totalAlquileres = 0;
        double precioS;
        int diaI, diaF, recD;

        for (int i = 0; i < alquileres.length; i++) {
            diaF = alquileres[i].getFechaFin().getDay();
            diaI = alquileres[i].getFechaInicio().getDay();
            precioS = (double) alquileres[i].getPrecio();

            if ((diaF - diaI) > 3) {
                recD = diaF - diaI - 3;
                totalAlquileres += precioS * 3 + (precioS * 1.1 * recD);
            } else {
                totalAlquileres += precioS * (diaF - diaI);
            }

        }

        System.out.println("El total del servicio de alquileres fue de: $ " + totalAlquileres);
    }
        public void mostrarAlquileres(Alquiler[] alquis) {
        for (int i = 0; i < alquis.length; i++) {
            System.out.println("Datos del alquiler " + (i + 1));
            alquis[i].toString();
            System.out.println("");
        }
    }


}
