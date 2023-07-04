/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actextra2_poo;

import Entidades.FigGeometrica;
import Services.ServiceFiguraG;

/**
 *
 * @author rembecuadro
 */
public class ActExtra2_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        // llamar el servicio
        ServiceFiguraG figura = new ServiceFiguraG();
        // llamar el objeto que se crea con el método del servicio
        FigGeometrica fig = figura.crearFigura();
        // llamar el método para cálculos
        double area = figura.areaFigura(fig);
        double perimetro = figura.perimetroFigura(fig);
        
        
    }
    
}
