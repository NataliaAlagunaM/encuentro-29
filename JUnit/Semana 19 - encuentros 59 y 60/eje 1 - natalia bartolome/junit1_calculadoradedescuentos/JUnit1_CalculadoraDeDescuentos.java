package junit1_calculadoradedescuentos;

import Entidad.DiscountCalculator;
import Service.DiscountCalculatorService;

public class JUnit1_CalculadoraDeDescuentos {

    public static void main(String[] args) {

        DiscountCalculatorService cS = new DiscountCalculatorService();

        DiscountCalculator calcu = cS.createDisc();

        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Descuento del 10% : $" + cS.calcularDescDiez(calcu));
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Descuento Max (30%) : $" + cS.calcularDescMax(calcu));
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Descuento Min (5%) : $" + cS.calcularDescMin(calcu));
        cS.calcularDescMin(calcu);
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("Sin Descuento: $" + cS.calcularSinDesc(calcu));
        System.out.println("-----------------------------------------");
        System.out.println("");

    }

}
