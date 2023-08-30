/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author max72
 */
public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;
    private int interes;
 

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
       
        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public int getInteres() {
        return interes;
    }


    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }


    public void crearCuenta(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero de cuenta:");
        this.numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI:");
        this.dniCliente = leer.nextLong();
        System.out.println("Ingrese saldo de cuenta:");
        this.saldoActual = leer.nextInt();
        System.out.println("Ingrese numero de cuenta:");
        this.interes = leer.nextInt();
    }
    
    public int ingresar(double ingreso){
        this.saldoActual +=ingreso;
        
        return this.saldoActual;
    }
    
    public int retirar(double retiro){
        if (retiro>this.saldoActual) {
            System.out.println("El saldo es insuficiente");
            return 0;
        }
        
        return this.saldoActual-=retiro;
    }
    
    public int extraccionRapida(double retiro){
        if (retiro>(0.2*this.saldoActual)) {
            System.out.println("El retiro es mayor al 20% del saldo");
            return 0;
        }
        
        return this.saldoActual-=retiro;
    }
    
    public int consultarSaldo(){
        return this.saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + this.numeroCuenta + ", dniCliente=" + this.dniCliente + ", saldoActual=" + this.saldoActual + ", interes=" + this.interes + '}';
    }
    
}
