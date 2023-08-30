/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaconjunit;

//import holaconjunit.ClaseCalculadora.ValidadorDeContrasenias;

import LibreriaService.LibreriaService;
import ProductoService.ProductoService;
import holaconjunit.Service.PeliculaService;


/**
 *
 * @author max72
 */
public class HolaConJunit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*PeliculaService netflix = new PeliculaService();
        netflix.ordenarPeliculasPor("TITULO", "ASC");
        netflix.ordenarPeliculasPor("TITULO", "DESC");
        netflix.ordenarPeliculasPor("DIRECTOR", "ASC");
        netflix.ordenarPeliculasPor("DIRECTOR", "DESC");
        netflix.ordenarPeliculasPor("DURACION", "ASC");
        netflix.ordenarPeliculasPor("DURACION", "DESC");*/
        /*ProductoService walmart = new ProductoService();
        walmart.agregarProducto();
        walmart.agregarProducto();
        walmart.mostrarProductos();
        walmart.editarPrecio();
        walmart.mostrarProductos();
        walmart.eliminarProducto();
        walmart.mostrarProductos();*/
        
        LibreriaService inicio = new LibreriaService();
        inicio.run();
    }
    
    
}
