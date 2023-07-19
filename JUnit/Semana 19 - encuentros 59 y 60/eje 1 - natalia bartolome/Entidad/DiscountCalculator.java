
package Entidad;

import java.util.Scanner;

public class DiscountCalculator {
    
    private double discount;
    private double price;
    private double product;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double discount, double price) {
        this.discount = discount;
        this.price = price;
    }
    
    public DiscountCalculator(double discount, double price, double product) {
        this.discount = discount;
        this.price = price;
        this.product = product;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public double getProduct() {
        return product;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduct(double product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "DiscountCalculator{" + "discount=" + discount + ", price=" + price + ", product=" + product + '}';
    }
    
}

//1. Calculadora de Descuentos:
//Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
//Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
//para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).