/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;

import desafiocoleccionesentreclases.Producto.Producto;
import java.util.ArrayList;

/**
 *
 * @author max72
 */
public class Tienda {
    private int id;
    private ArrayList <Producto> productList;
    private String direccion = "Shopping Nro 1 tienda nro "+(id+1);
    private String representante = "Representante tienda "+(id+1);

    public Tienda(int id, ArrayList<Producto> productList) {
        this.id = id;
        this.productList = productList;
    }

    public Tienda(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Producto> productList) {
        this.productList = productList;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Tienda " + "id:" + id + ", Prods: " + productList + ", Direc:" + direccion + ", rep:" + representante;
    }
    
}
