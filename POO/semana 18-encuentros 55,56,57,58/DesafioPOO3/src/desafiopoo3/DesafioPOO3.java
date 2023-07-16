/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoo3;

import Entidad.Cliente;
import Entidad.Rutina;
import Servicio.ServicioCliente;
import Servicio.ServicioRutina;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class DesafioPOO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sca = new Scanner(System.in).useDelimiter("\n");
		ServicioCliente sc = new ServicioCliente();
		
		//Crea al menos cinco clientes con datos ficticios.
		System.out.println("Cuantos clientes quiere dar de alta?");
		int alta = sca.nextInt();
		
		for(int i = 0 ; i < alta ; i++) {
			Cliente c = new Cliente();
			c = sc.registrarCliente();
		}
		
		//ObtÃ©n la lista de todos los clientes registrados y muÃ©stralos por pantalla.
		System.out.println(sc.obtenerClientes());
		
		//Realiza una actualizaciÃ³n en uno de los clientes existentes y muestra la lista de clientes actualizada.
		sc.actualizarCliente(9, "Octu", 12, 160, 50, "crecer");
		System.out.println(sc.obtenerClientes());
		
		//Elimina uno de los clientes existentes y muestra la lista de clientes final.
		sc.eliminarCliente(10);
		System.out.println(sc.obtenerClientes());

		
		//Crea al menos cinco rutinas con datos ficticios.
		ServicioRutina sr = new ServicioRutina();
		
		System.out.println("Cuantas rutinas quiere dar de alta?");
		int altaRutinas = sca.nextInt();
		
		for(int i = 0 ; i < altaRutinas ; i++) {
			Rutina r = new Rutina();
			r = sr.crearRutina();
		}
		
		//ObtÃ©n la lista de todas las rutinas registradas y muÃ©stralas por pantalla.
		System.out.println(sr.obtenerRutinas());


		//Realiza una actualizaciÃ³n en una de las rutinas existentes y muestra la lista de rutinas actualizada.
		sr.actualizarRutina(2, "saltar", 3, 2, "saltar alto");
		
		System.out.println(sr.obtenerRutinas());
		
		//Elimina una de las rutinas existentes y muestra la lista de rutinas final.
		sr.eliminarRutina(3);
		
		System.out.println(sr.obtenerRutinas());
		
		
		
		
	}
	
    }
    

