/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Movil {
    private String marca;
    private String modelo;
    private int precio;
    private int memoriaRam;
    private int almacenamiento;
    private int [] codigo;

    public Movil() {
    }

    public Movil(String marca, String modelo, int precio, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    public void cargarCelular(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la marca");
        this.marca = leer.nextLine();
        System.out.println("Ingrese modelo");
        this.modelo = leer.nextLine();
        System.out.println("precio");
        this.precio = leer.nextInt();
        System.out.println("memoria Ram");
        this.memoriaRam = leer.nextInt();
        System.out.println("storage");
        this.almacenamiento = leer.nextInt();
        System.out.println("Gracias pa");
    }
    
    public void ingresarCodigo(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ahora el codigo. de a uno papi.");
        this.codigo = new int [7];
        for (int i = 0; i < this.codigo.length; i++) {
            this.codigo[i] = leer.nextInt();
        }
        System.out.println("Gracias pa.");
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }
    
    
}
