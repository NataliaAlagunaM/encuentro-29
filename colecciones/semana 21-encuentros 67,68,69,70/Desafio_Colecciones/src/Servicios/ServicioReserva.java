package Servicios;

import Entidades.Persona;
import Entidades.Reserva;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ServicioReserva {
    ServicioPersona p1= new ServicioPersona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<Integer, Boolean> habDisponible = new HashMap<>();
    int cont = 0;

    public void habitaciones() {
        for(int i = 0; i <10; i++) {
            habDisponible.put(i+1, true);
        }
    }

    public void crearReserva(){


        Reserva r1 = new Reserva();


        System.out.println("Cuantas personas se van a hospedar?");
        int cantPersona = leer.nextInt();

        switch (cantPersona){
            case 1:
                for (int i = 8; i < 10; i++){
                    if(habDisponible.get(i+1)){
                        System.out.println("La habitación "+(i+1)+ " está disponible.");
                        habDisponible.put(i+1, false);
                        datosReserva(r1,cantPersona,i);


                        break;
                    }else {
                        System.out.println("La habitación "+(i+1)+ " no está disponible.");
                    }
                }
                break;
            case 2:

                for (int i = 0; i <5 ; i++){
                    if(habDisponible.get(i+1)){
                        System.out.println("La habitación "+(i+1)+ " está disponible.");
                        habDisponible.put(i+1, false);
                        datosReserva(r1,cantPersona,i);


                        break;

                    }else {
                        System.out.println("La habitación "+(i+1)+ " no está disponible.");
                    }
                }
                break;
            case 3:
                for (int i = 5; i <8 ; i++){
                    if(habDisponible.get(i+1)){
                        System.out.println("La habitación "+(i+1)+ " está disponible.");
                        habDisponible.put(i+1, false);
                        datosReserva(r1,cantPersona,i);

                        break;
                    }else {
                        System.out.println("La habitación "+(i+1)+ " no está disponible.");
                    }
                }
                break;
            default:
                System.out.println("El número de personas ingresado no es correcto.");

        }


    }

    public void datosReserva(Reserva r1, int cantPersona, int i){
        ArrayList<Persona> listaPersAux = new ArrayList<Persona>();

        for (int j = 0; j <cantPersona; j++){
            System.out.println("Huesped "+(j+1)+":");
            Persona pers =  p1.crearPersona();
            listaPersAux.add(pers);

        }
        r1.setListaPersonas(listaPersAux);

        System.out.println("Ingrese check-in:");
        r1.setFechaEntrada(leer.next());
        System.out.println("Ingrese check-out:");
        r1.setFechaSalida(leer.next());
        r1.setNumeroHabitacion(i+1);
        cont++;
        r1.setId(cont);

        System.out.println(r1.toString());
    }

}
