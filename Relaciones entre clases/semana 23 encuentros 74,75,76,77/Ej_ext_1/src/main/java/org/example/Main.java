package org.example;

import servicios.ServicioPerro;
import servicios.ServicioPersona;

public class Main {
    public static void main(String[] args) {
        ServicioPersona servicioPersona = new ServicioPersona();
        ServicioPerro servicioPerro=new ServicioPerro();

        servicioPerro.fabricarPerro();
        servicioPersona.fabricarPersona();


    }
}