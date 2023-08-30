/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocoleccionesentreclases;

import Tienda.TiendaService;
import desafiocoleccionesentreclases.Producto.ProductoService;

/**
 *
 * @author max72
 */
public class DesafioColeccionesEntreClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoService prodServ = new ProductoService();
        TiendaService tiendaServ = new TiendaService();
        
        prodServ.crearProducto();
        prodServ.mostrarProductos();
        tiendaServ.crearTienda(prodServ.getProdList());
        tiendaServ.mostrarTiendas();
    }
    
}
