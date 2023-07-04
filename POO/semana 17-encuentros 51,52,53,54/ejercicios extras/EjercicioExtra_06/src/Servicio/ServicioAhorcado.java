/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Martin
 */





// Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
// Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
// Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main. 

public class ServicioAhorcado {
    
    Scanner entrada = new Scanner(System.in);
    public Ahorcado ahorcado01 = new Ahorcado();
    char [] bancoLetras;
   
    //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0
    
    public Ahorcado crearJuego(){
        String palabra;
        System.out.println("ingrese una palabra");
        palabra = entrada.nextLine();
        int longitud = palabra.length();
//        metodo para convertir string en caracteres 
//        char [] vector = palabra.toCharArray();
        char [] auxVector = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            auxVector[i] = palabra.charAt(i);
        }
        System.out.println("ingrese la cantidad de jugadas");
        ahorcado01.setCantidadJugadas(entrada.nextInt());
        
        ahorcado01.setCantidadLetras(0);
        
        ahorcado01.setPalabra(auxVector);
        this.bancoLetras = new char[longitud];
        inicializarVector();
        return ahorcado01;
        
    }
    
    // Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public void longitud(){
        
        System.out.println("la longitud es "+ahorcado01.getPalabra().length);
    }
    
    
    // Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscar(char letra) {
        boolean encontrado = false;

        for (int i = 0; i < ahorcado01.getPalabra().length; i++) {
            if (ahorcado01.getPalabra()[i] == letra) {
                encontrado = true;
                this.bancoLetras[i] = letra;
            }
        }
        if (encontrado) {
            System.out.println("Letra encontrada");
        } else {
            System.out.println("Letra no encontrada");
            ahorcado01.setCantidadJugadas(ahorcado01.getCantidadJugadas() - 1);
            System.out.println("Le quedan " + ahorcado01.getCantidadJugadas() + " jugadas");
            if (ahorcado01.getCantidadJugadas()==0) {
                System.out.println("Lo lamento, has perdido");
            }
        }
    }
    
    public void imprimirVector() {
        for (int i = 0; i < this.bancoLetras.length; i++) {
            System.out.print(this.bancoLetras[i] + " ");
        }
        System.out.println("");
    }
    
    public void inicializarVector(){
        for (int i = 0; i < this.bancoLetras.length; i++) {
            this.bancoLetras[i] = '_';
        }
    }
    
    public void finJuego() {

        int contador = 0;
        for (int i = 0; i < this.bancoLetras.length; i++) {
            if (this.bancoLetras[i] == '_') {
                break;
            } else {
                contador++;
            }
        }
        if (contador == this.bancoLetras.length) {
            ahorcado01.setFinJuego(true);
            System.out.println("Felicidades, has ganado!");
        }
    }
    
    
}
