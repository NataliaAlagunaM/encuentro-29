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
public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora(float precio, String color, char consumoEnergetico, float peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
        this.precioFinal(consumoEnergetico, peso);
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        super.crearElectrodomestico();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la carga (es un int no hagas pavadas)");
        int cargaLec = leer.nextInt();

        return new Lavadora(this.getPrecio(), this.getColor(), this.getConsumo(), this.getPeso(), cargaLec);
    }

    @Override
    public float precioFinal(char argConsumo, float argPeso) {
        float precioCalculado = super.precioFinal(argConsumo, argPeso);
        precioCalculado += this.carga > 30 ? 500 : 0;
        this.precio = precioCalculado;
        return (precioCalculado);
    }

    @Override
    public String toString() {

        return super.toString() + "Lavadora{" + "carga=" + carga + '}';
    }
}
