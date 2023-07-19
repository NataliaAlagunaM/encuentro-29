package Service;

import Entidad.DiscountCalculator;
import java.util.Scanner;

public class DiscountCalculatorService {

    Scanner sc = new Scanner(System.in);

    public DiscountCalculator createDisc() {

        DiscountCalculator calcu = new DiscountCalculator();

        System.out.println("Ingresar precio del producto por favor");
        calcu.setPrice(sc.nextDouble()); // como se testea si ingreso $ x Scanner?
    
        return calcu;
    }

    public double calcularDescDiez(DiscountCalculator calcu) {

   
        //calcu.setPrice(100);
        calcu.setDiscount(calcu.getPrice()*.1);
        //  calcu.setProduct(calcu.getPrice() - calcu.getDiscount());
        return calcu.getPrice() - calcu.getDiscount();
    }

    public double calcularDescMax(DiscountCalculator calcu) {
        //System.out.println("Ingresar precio del producto por favor");
        //calcu.setPrice(sc.nextDouble());
        //calcu.setPrice(100); 
        calcu.setDiscount(calcu.getPrice()*.3);
        calcu.setProduct(calcu.getPrice() - calcu.getDiscount());
        return calcu.getProduct();
    }

    public double calcularDescMin(DiscountCalculator calcu) {
        // System.out.println("Ingresar precio del producto por favor");
        //calcu.setPrice(sc.nextDouble());
        //calcu.setPrice(100);
        calcu.setDiscount(calcu.getPrice()*.05);
        calcu.setProduct(calcu.getPrice() - calcu.getDiscount());
        return calcu.getProduct();
    }

    public double calcularSinDesc(DiscountCalculator calcu) {
        //System.out.println("Ingresar precio del producto por favor");
        //calcu.setPrice(sc.nextDouble());
        //calcu.setPrice(100);
        calcu.setDiscount(0.0);
        calcu.setProduct(calcu.getPrice() - calcu.getDiscount());
        return calcu.getProduct();
    }

}
