package Services;

import java.util.Date;
import java.util.Scanner;

import Entities.Alquiler;

public class AlquilerService {
    
    public Alquiler crearAlquiler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título de la película:");
        String pelicula = scanner.nextLine();
        System.out.println("Ingrese la fecha de inicio del alquiler:");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        Date fechaInicio = new Date(dia,anio,mes);
        System.out.println("Ingrese la fecha de fin del alquiler:");
        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int anio1 = scanner.nextInt();
        Date fechaFin = new Date(dia1,mes1,anio1);
        double precio = calcularPrecioTotal(fechaInicio, fechaFin);
        return new Alquiler(pelicula, fechaInicio, fechaFin, precio);
    }

    public void listarAlquileres(Alquiler[] alquileres) {
        System.out.println("Listado de alquileres:");
        for (int i = 0; i < alquileres.length; i++) {
            System.out.println(alquileres[i].getPelicula());
        }
    }

    public void buscarAlquilerPorFecha(Alquiler[] alquileres) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de inicio del alquiler:");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        Date fechaInicio = new Date(dia,mes,anio);
        System.out.println("Listado de alquileres con la fecha de inicio " + fechaInicio + ":");
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i].getFechaInicio().compareTo(fechaInicio) == 0) {
                System.out.println(alquileres[i].getPelicula());
            }else{
                System.out.println("No se encontró el alquiler");
            }
        }
        }

    public double calcularPrecioTotal(Date fechaInicio, Date fechaFin) {
        double precio;
        if (fechaInicio.getDate() <= 3) {
            precio = 10;
        }else{
            precio = 10 + (10*0.10);

        }
        return precio;
    }
}
