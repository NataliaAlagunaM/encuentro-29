/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaconjunit.ClaseCalculadora;

/**
 *
 * @author max72
 */
public class DiscountCalculator {
    
    public DiscountCalculator() {
        
    }
    public static double estatica(double precio, double descuento)
    {
        
        return precio - precio * descuento / 100;
    }

    
    
}
