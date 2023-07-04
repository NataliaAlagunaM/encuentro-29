/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Martin
 */

//Crear una clase Ahorcado (como el juego), la cual deberá contener
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
//cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
//con los parámetros que sean necesarios:
// Constructores, tanto el vacío como el parametrizado

public class Ahorcado {
    char [] palabra;
    int cantidadLetras;
    int cantidadJugadas;
    boolean finJuego = false;

    public boolean isFinJuego() {
        return finJuego;
    }

    public void setFinJuego(boolean finJuego) {
        this.finJuego = finJuego;
    }
    
    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantidadLetras, int cantidadJugadas) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugadas = cantidadJugadas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }
    
    
            
    
}
