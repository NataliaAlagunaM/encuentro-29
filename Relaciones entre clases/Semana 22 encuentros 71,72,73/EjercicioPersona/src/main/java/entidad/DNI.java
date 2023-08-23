package entidad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Natalia Alaguna
 */
public class DNI {
    private char serie;
    private int numero;

    public DNI(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public DNI() {
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
 
    
}
