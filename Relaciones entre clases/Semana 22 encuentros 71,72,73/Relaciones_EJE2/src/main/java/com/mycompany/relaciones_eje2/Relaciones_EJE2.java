package com.mycompany.relaciones_eje2;

import Servicios.JuegoServicio;


public class Relaciones_EJE2 {

    public static void main(String[] args) {
        JuegoServicio juegoserv = new JuegoServicio();
        juegoserv.crearJuego();
        juegoserv.ronda();
    }
}
