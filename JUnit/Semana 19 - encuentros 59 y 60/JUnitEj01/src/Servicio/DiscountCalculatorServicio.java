/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.DiscountCalculator;

/**
 *
 * @author 57315
 */

/*
Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
*/
public class DiscountCalculatorServicio {
    
    public double ObtenerDescuento(DiscountCalculator dc1){
        return dc1.getPrecio()-((dc1.getPrecio()*dc1.getDescuento())/100);
    }
}
