/*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/

package org.example.Servicios;

import org.example.Entidades.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno(){
        Alumno a1;
        boolean bandera = false;
        do{
            a1 = new Alumno();
            System.out.println("Ingrese el nombre del alumno:");
            a1.setNombre(leer.next());

            for(int i = 0; i <3; i++){
                System.out.println("Ingrese nota "+(i+1));
                a1.getNotaAlumno().add(leer.nextInt());
            }

            listaAlumnos.add(a1);
            System.out.println("Desea crear otro alumno? S/N");
            String opcion = leer.next().toUpperCase();

            if(opcion.equals("N")){
                bandera = true;
            }


        } while(!bandera);



    }

    public void mostrarALumnos(){
        listaAlumnos.forEach((a1) -> {
            System.out.println(a1.toString());
        });

    }




    public float notaFinal() {

        String nombre1;
        float sumaDeNotas = 0;
        float promedio = 0;

        System.out.println("Ingrese el nombre del alumno que quiere calcular la nota:");
        nombre1 = leer.next();

        for(Alumno a1 : listaAlumnos){

            if(a1.getNombre().contentEquals(nombre1))
            {
                for (int i: a1.getNotaAlumno()) {
                    sumaDeNotas += i;
                }
                promedio =(float)( sumaDeNotas / a1.getNotaAlumno().size());

            }else {
                System.out.println("El alumno ingresado no existe.");
            }
     
        }

        return promedio;
}
}
