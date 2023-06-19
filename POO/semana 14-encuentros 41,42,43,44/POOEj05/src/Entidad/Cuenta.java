/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class Cuenta {
    int numeroCuenta;
    long DNI;
    int saldoActual;
    int interes;

    public Cuenta() {
    }
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    
    public Cuenta(int numeroCuenta, long DNI, int saldoActual,int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes= interes;
    }
//b) Agregar los métodos getters y setters correspondientes    
    
     public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setBase(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
     public double getDni() {
        return DNI;
    }

    public void setDni(long DNI) {
        this.DNI = DNI;
    }
    
     public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.    
    
    public void crearCuenta(){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el número de cuenta");
        this.numeroCuenta=leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        this.DNI=leer.nextLong();
        System.out.println("Ingrese su saldo actual: ");
        this.saldoActual=leer.nextInt();
    }
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.   
    
    public double igresar(int saldoActual){
        Scanner leer = new Scanner (System.in);
        double dineroSuma;
        double saldoNuevo;
        System.out.println("Ingrese la cantidad de dinero a sumar: ");
        dineroSuma=leer.nextDouble();
        System.out.println("el dinero total es: ");
        saldoNuevo=dineroSuma + this.saldoActual;
        System.out.println(saldoNuevo);
        return saldoNuevo;
        
    }
    

/*
    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
    */    
    
    public double retirar(int saldoActual){
        Scanner leer = new Scanner (System.in);
        int dineroResta;
        int saldoNuevo=(int) this.igresar(saldoActual);
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        dineroResta=leer.nextInt();
        if (this.saldoActual<dineroResta) {
            System.out.println("No hay suficiente saldo");
            this.saldoActual=0;
        }
        saldoNuevo= -dineroResta + saldoNuevo;
        System.out.println("el dinero disponible es: "+saldoNuevo);
        return saldoNuevo;
    }

    /*
    f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
    */
    
    public double extraccionRapida(){
       double resultado=this.saldoActual*0.2; 
       return resultado;
    }
    
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
        int saldoNuevo=(int) this.extraccionRapida();
        System.out.println(saldoNuevo);
    }

//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultar(int saldoActual){
        int saldoNuevo=(int) this.extraccionRapida();
        System.out.println("Los datos de la cuenta son: ");
        System.out.println("DINI: "+this.DNI);
        System.out.println("El número de la cuenta es: "+this.numeroCuenta);
        System.out.println("El saldo actual es: "+saldoNuevo);
    }



   
}
