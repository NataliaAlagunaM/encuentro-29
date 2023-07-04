/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author 57315
 */





public class ServicioCurso {
      Scanner leer = new Scanner(System.in);
    
    public void crearAlumnos(String[] alumnos){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno"+ i+1);
            alumnos[i] = leer.next();
        }
    }

    public Curso crearCurso(){
        Curso nvoCurso = new Curso();
        System.out.println("Ingrese el nombre del Curso");
        nvoCurso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas del curso: ");
        nvoCurso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días del curso: ");
        nvoCurso.setCantidadDiasPorSemana(leer.nextInt());
        do {
            System.out.println("por favor ingrese el turno en el que cursa (mañana o tarde)");
            nvoCurso.setTurno(leer.next());
        } while (!nvoCurso.getTurno().equalsIgnoreCase("mañana") && !nvoCurso.getTurno().equalsIgnoreCase("tarde"));
        System.out.println("Ingrese el valor de la hora: ");
        nvoCurso.setPrecioPorHora(leer.nextFloat());
        crearAlumnos(nvoCurso.getAlumnos());
        
        return nvoCurso;
    } 

    public void calcularGananciaSemanal(Curso curso){
        int horas = curso.getCantidadHorasPorDia();
        int dias = curso.getCantidadDiasPorSemana();
        double precio = curso.getPrecioPorHora();
        System.out.println("La ganancia total de la semana por " + horas + " horas por " + dias + " días a la semana a " + precio+ "$ fue de:");
        System.out.println(5*horas*dias*precio);
    }

}
