/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
/*
registrarCliente: lo registra en el sistema.
obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.

*/
public class ServicioCliente {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	Scanner sc = new Scanner(System.in).useDelimiter("\n");

	public Cliente registrarCliente() {
		Cliente c = new Cliente();
		System.out.println("Ingresar ID");
		c.setId(sc.nextInt());
		System.out.println("Ingrese su nombre");
		c.setNombre(sc.next());
		System.out.println("Ingrese su edad");
		c.setEdad(sc.nextInt());
		System.out.println("Ingrese su altura");
		c.setAltura(sc.nextInt());
		System.out.println("Ingrese su peso");
		c.setPeso(sc.nextDouble());
		System.out.println("Ingrese su objetivo");
		c.setObjetivo(sc.next());

		listaClientes.add(c);
		return c;
	}

	public ArrayList<Cliente> obtenerClientes() {

		return this.listaClientes;

	}

	// actualizarCliente(int id, String nombre, int edad, double altura, double
	// peso, String objetivo): recibe el identificador de un cliente existente y los
	// nuevos datos del cliente, y actualiza la informaciÃ³n correspondiente en el
	// sistema.
	public void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo) {
		//existe o no el cliente, y avisar
		//modificado exitosamente
		//no se encontro el cliente
		boolean check =  false;
//		this.listaClientes.forEach(cliente -> {
//			if (cliente.getId() == id) {
//				check =  true;
//				cliente.setNombre(nombre);
//				cliente.setEdad(edad);
//				cliente.setAltura(altura);
//				cliente.setPeso(peso);
//				cliente.setObjetivo(objetivo);
//			}
//		});

		for (Cliente c : listaClientes) {
			if(c.getId() == id){
				check=true;
				c.setNombre(nombre);
				c.setEdad(edad);
				c.setAltura(altura);
				c.setPeso(peso);
				c.setObjetivo(objetivo);
				System.out.println("Modificado exitosamente");
			} 
		}
		if(!check) {
			System.out.println("No existe el ID");
		}
	}

	public void eliminarCliente(int id) {
		int i = 0;
		if (this.listaClientes.size() > 0 && this.listaClientes.size() >= id) {
			for (Cliente c : listaClientes) {
				if (c.getId() == id) {
					i = listaClientes.indexOf(c);
				}
			}
			System.out.println("Eliminado exitosamente");
			listaClientes.remove(i);
		} else {
			System.out.println("No hay nada para eliminar, lo sentimos");
		}

	}
}
