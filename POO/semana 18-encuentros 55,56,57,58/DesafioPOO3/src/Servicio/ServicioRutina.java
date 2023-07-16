/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
/*
crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
En el método principal (main):
*/
public class ServicioRutina {
    private ArrayList<Rutina> listaRutinas = new ArrayList<>();

	public ArrayList<Rutina> getListaRutinas() {
		return listaRutinas;
	}

	Scanner sc = new Scanner(System.in).useDelimiter("\n");
	
	
	public Rutina crearRutina() {
		Rutina r = new Rutina();
		System.out.println("Ingresar ID");
		r.setId(sc.nextInt());
		System.out.println("Ingrese su nombre");
		r.setNombre(sc.next());
		System.out.println("Ingrese su duracion");
		r.setDuracion(sc.nextInt());
		System.out.println("Ingrese su nivel de dificultad (facil=1, intermedio=2, dificil=3)");
		r.setNivelDificultad(sc.nextInt());
		System.out.println("Ingrese su descipcion");
		r.setDescripcion(sc.next());
	
		listaRutinas.add(r);
		return r;
	}
	
	public ArrayList<Rutina> obtenerRutinas(){
		return this.listaRutinas;
	}

	public void actualizarRutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {
		boolean check =false;
		for (Rutina rutina : listaRutinas)  {
			if (rutina.getId() == id) {
				check = true;
				rutina.setNombre(nombre);
				rutina.setDuracion(duracion);
				rutina.setNivelDificultad(nivelDificultad);
				rutina.setDescripcion(descripcion);
				System.out.println("Modificado exitosamente");
			}
		}
		if(!check) {
			System.out.println("No existe el ID");
		}
		
	}
	
	public void eliminarRutina(int id) {
		int i = 0;
		if (this.listaRutinas.size() > 0 && this.listaRutinas.size() >= id) {
			for (Rutina r : listaRutinas) {
				if (r.getId() == id) {
					i = listaRutinas.indexOf(r);

				}
			}
			System.out.println("Eliminado exitosamente");
			listaRutinas.remove(i);
		} else {
			System.out.println("no hay nada para eliminar bro");
		}

	}
}
