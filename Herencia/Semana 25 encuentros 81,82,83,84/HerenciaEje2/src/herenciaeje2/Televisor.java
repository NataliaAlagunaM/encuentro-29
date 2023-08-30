/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaeje2;

import java.util.Scanner;

/**
 *
 * @author Natalia Alaguna
 */
public class Televisor extends Electrodomestico {

    private float resolucion;
    private boolean sintonizador;

    public Televisor(float resolucion, boolean sintonizador, float precio, String color, char consumoEnergetico, float peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
        this.precio = this.precioFinal(consumoEnergetico, peso);
    }

    public Televisor() {

    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Televisor crearTelevisor() {
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese resolucion y sintonizador (tru o fols)");
        resolucion = leer.nextFloat();
        sintonizador = leer.nextBoolean();

        return new Televisor(resolucion, sintonizador, this.getPrecio(), this.getColor(), this.getConsumo(), this.getPeso());
    }

    @Override
    public float precioFinal(char argConsumo, float argPeso) {

        float precioCalculado = super.precioFinal(argConsumo, argPeso);
        precioCalculado = (float) (precioCalculado * (resolucion > 40 ? 1.3 : 1));
        precioCalculado = precioCalculado + (sintonizador ? 500 : 0);
        this.setPrecio(precioCalculado);
        return precioCalculado;
    }

    @Override
    public String toString() {
        return super.toString() + "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }

}

