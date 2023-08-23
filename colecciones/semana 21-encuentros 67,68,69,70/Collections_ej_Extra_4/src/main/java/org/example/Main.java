package org.example;

import org.example.servicios.ServicioCodigoPostal;

public class Main {
    public static void main(String[] args) {

        ServicioCodigoPostal sCp =new ServicioCodigoPostal();
        sCp.pedirCodigoPostal();
        sCp.mostrarDatosIntroducidos();
//        sCp.crearNuevaCiudad();
//        sCp.mostrarDatosIntroducidos();
//        sCp.eliminarTresCiudades();
//        sCp.mostrarDatosIntroducidos();

    }
}