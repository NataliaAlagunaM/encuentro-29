package org.example.servicios;

import org.example.entidades.CodigoPostal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioCodigoPostal {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, String> mapaCodigosPostales = new HashMap<>();

    public void pedirCodigoPostal() {
        CodigoPostal codigo1 = new CodigoPostal();

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa el código postal para ciudad " + (i + 1));
            codigo1.setCodigoPostal(leer.nextInt());
            System.out.println("Ingresa el nombre de la ciudad asociada al código " + codigo1.getCodigoPostal());
            codigo1.setCiudadAosciada(leer.next());
            mapaCodigosPostales.put(codigo1.getCodigoPostal(), codigo1.getCiudadAosciada());
        }
    }

    public void mostrarDatosIntroducidos() {
        for (Map.Entry<Integer, String> entry : mapaCodigosPostales.entrySet()) {
            System.out.println("Ciudad: " + entry.getValue()
                    + " , " + " Código postal: " + entry.getKey());
        }

    }
    /* Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.*/

    public void buscarCodigoPostal() {
        Integer codigoBuscado = 0;
        System.out.println("Ingresa el código postal a buscar: ");
        codigoBuscado = leer.nextInt();
        boolean banderaEncontrado = false;
        for (Map.Entry<Integer, String> entry : mapaCodigosPostales.entrySet()) {
            if (entry.getKey().equals(codigoBuscado)) {
                System.out.println("Código encontrado");
                System.out.println("Corresponde a la ciudad: " + entry.getValue());
                banderaEncontrado = true;
                break;
            }
            if (banderaEncontrado) {
                System.out.println("Código postal no encontrado.");
            }
        }

    }

    public void crearNuevaCiudad() {
        CodigoPostal codigo2 = new CodigoPostal();
        System.out.println("Ingresa el código postal para la nueva ciudad: ");
        codigo2.setCodigoPostal(leer.nextInt());
        System.out.println("Ingresa el nombre de la nueva ciudad: ");
        codigo2.setCiudadAosciada(leer.next());
        mapaCodigosPostales.put(codigo2.getCodigoPostal(), codigo2.getCiudadAosciada());
    }

    public void eliminarTresCiudades() {
        Integer codigoCiudadEliminar = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el código postal a eliminar de la ciudad " + (i + 1));
            codigoCiudadEliminar = leer.nextInt();
            boolean banderaEncontrado = false;
            if (!mapaCodigosPostales.isEmpty()) {
                for (Map.Entry<Integer, String> entry : mapaCodigosPostales.entrySet()) {
                    if (entry.getKey().equals(codigoCiudadEliminar)) {
                        mapaCodigosPostales.remove(codigoCiudadEliminar);
                        System.out.println("Ciudad " + entry.getValue() + " eliminada con éxito.");
                        banderaEncontrado = true;
                        break;
                    }
                    if (banderaEncontrado) {
                        System.out.println("Código postal no encontrado.");
                    }
                }
            } else {
                System.out.println("No hay ciudades para eliminar.");
            }
        }


    }
}
