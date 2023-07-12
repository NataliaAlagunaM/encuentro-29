/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextragym.Sources.Services;

import java.util.ArrayList;
import java.util.Scanner;
import javaextragym.Sources.Classes.Cliente;

/**
 *
 * @author max72
 */
public class ClienteService {
    ArrayList <Cliente> clientes;
    int ia;

    public ClienteService(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
        this.ia = 0;
    }

    public ClienteService() {
        this.ia = 0;
    }
    
    public void registrarCliente(Cliente agregable){
        agregable.setId(ia);
        this.ia++;
        this.clientes.add(agregable);
        
    }
    
    public void registrarClienteManual(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese qcyo que");
        Cliente nuevo = new Cliente(1,"Max",18,(float)2.4,70,"Ser SSJ4");
        registrarCliente(nuevo);
    }
    
    public ArrayList<Cliente> obtenerRutinas(){
        for (Cliente cliente  : this.clientes){
            System.out.println(cliente);
        }
        
        return this.clientes;
    }
    
    public int actualizarCliente (int id, String nombre, int edad, float altura, float peso, String objetivo){
        for (Cliente cliente : this.clientes ){
            if (cliente.getId() == id){
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                return 1;
            }
        }
        return 0;
    }
    
    public int eliminarRutina (int id){
        for (Cliente cliente : this.clientes ){
            if (cliente.getId() == id){
                clientes.remove(cliente);
                return 1;
            }
        }
        return 0;
    }
    
}
