/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocoleccionesentreclases.Producto;

/**
 *
 * @author max72
 */
public class Producto {
    private int id;
    private String nombre = "Producto "+id;
    private float precio;

    public Producto(int id, float precio) {
        this.id = id;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto: \n" + "ID: " + id + "\nNombre: " + nombre + "\nPrecio=" + precio;
    }
    
}
