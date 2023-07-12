/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjavaapp;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author max72
 */
public class MyFirstJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        /*
        int enteroNuevo;
        enteroNuevo = leer.nextInt();
        System.out.println(enteroNuevo + " Es el entero");
        String texto = "pan";
        if (texto.isEmpty()){
            System.out.println("Esta vacio");
        } 
        else 
        {
            System.out.println("Tiene texto");
        };
        
        */
        /*
        EJ1
        int suma = 0;
        
        suma += leer.nextInt();
        suma += leer.nextInt();
        
        System.out.println(suma);
        //EJ2 y 3
        String nombre;
        nombre = leer.nextLine();
        System.out.println(nombre);
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        //EJ4
        
        int grados = leer.nextInt();
        System.out.println("Los " + grados + "ºC son " + 32+(9*grados/5) + "º F");
        */
        /*
        int par = leer.nextInt();
        if (par%2 == 0){
            System.out.println("Par");
        }
        else
        {
            System.out.println("Impar");
        }
        
        
        String igual = leer.nextLine();
        if (igual.equals("eureka")){
            System.out.println("es");
        }
        else
        {
            System.out.println("noes");
        }
        
        String newLine = leer.next();
        if (newLine.length() == 8){
            System.out.println("CORRECTO");
        }
        else
        {
            System.out.println("Incorrecto");
        }
        
        String newLine = leer.next();
        char newchar = newLine.charAt(0);
        if (newchar == 'A'){
            System.out.println("CORRECTO");
        }
        else
        {
            System.out.println("Incorrecto");
        }
        //EJ 10
        System.out.println("Ingrese numero limite");
        int limite = leer.nextInt();
        int suma = 0; 
        while (suma < limite){
            System.out.println("Ingrese un num para sumar");
            suma+=leer.nextInt();
        }
        System.out.println("La suma de los numeros es: " + suma);
        
        ///EJ11
        System.out.println("Ingrese numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = leer.nextInt();
        System.out.println("MENU: \n1. Sumar\n2. Restar\n3. Multip\n4. Dividir\n5. Salir\nElija opcion:");
        int opcionMenu = leer.nextInt();
        switch(opcionMenu){
            case 1: {
                System.out.println("La suma es: " + (num1 + num2));
                break;
            }
            case 2: {
                System.out.println("La resta es: " + (num1 - num2));
                break;
            }
            case 3: {
                System.out.println("La mul es: " + (num1 * num2));
                break;
            }
            case 4: {
                double res = (double)num1/num2;
                System.out.println("La div es: " + res);
                break;
            }
        }
        
        //EJ12
        int correctos = 0;
        int incorrectos = 0;
        while (true){
        String rs232 = leer.next();
        if (rs232.length() != 5 && !rs232.equals("&&&&&")){
            System.out.println("No valido");
            incorrectos++;
        }
        else if (rs232.charAt(0) != 'X' && !rs232.equals("&&&&&")){
            System.out.println("No valido");
            incorrectos++;
        }
        else if (rs232.charAt(4) != 'O' && !rs232.equals("&&&&&")){
            System.out.println("No valido");
            incorrectos++;
        }
        else if (!rs232.equals("&&&&&"))
        correctos++;
        else
        break;
       };
        System.out.println("Correctos: " + correctos + " Incorrectos: " + incorrectos);
        
        System.out.println("Ingrese entero");
        int lado = leer.nextInt();
        for (int i = 0; i<lado; i++)
        {
            for (int j = 0; j<lado; j++){
                if (i == 0 || i == lado-1 || j==0 || j == lado-1 )
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
        //EJ14
        convertirInfo(40,"libras");
        
        //EJ15
        int[] vector = new int[100];
        rellenarVector(vector);
        
        //EJ16
        System.out.println("Diga un num pa levantar el vector");
        int n = leer.nextInt();
        int [] vector = new int [n];
        int [] vectorLleno = rellenarVector(vector);
        System.out.println("Ahora decime un num");
        int num = leer.nextInt();
        int posicion = -1;
        boolean repetido = false;
        for (int i = 0; i<n; i++){
            if (num == vector[i]) {
                if (posicion == -1){
                    posicion = i;
                }else if (!repetido) {
                    repetido = true;
                    break;
                }
            }
            
        }
        if (posicion == -1)
                System.out.println("not found");
            else {
                System.out.println("Item found at posic " + posicion + " y " + (repetido?"estaba ":"no estaba ") + "repetido");
            }
        //EJ17
        int n =5;
        int [] vector = new int [n];
        int undig,dosdig,tresdig,cuatrodig,cincodig;
        undig = dosdig = tresdig = cuatrodig = cincodig = 0;
        for (int i = 0; i<n; i++){
            int casees = vector[i];
            if (casees<=9 && casees >=0)
                undig++;
            if (casees<=99 && casees >=10)
                dosdig++;
            if (casees<=999 && casees >=100)
                tresdig++;
            if (casees<=9999 && casees >=1000)
                cuatrodig++;
            if (casees>=99999 && casees >=10000)
                cincodig++;
        }
        System.out.println(undig + " " + dosdig + " " + tresdig + " " + cuatrodig + " " + cincodig);
        
        //EJ18
        int [][] vector = new int [5][5];
        int c = 0;
        for (int i = 0; i<5; i++)
            for (int j = 0; j<5; j++){
                vector [i][j] = c;
                c++;
            }
        mostrarMatriz(vector);
        vector = ej18(vector);
        mostrarMatriz(vector);
        */
        //EJ19 Matriz anti simetrica.
        int[][] matriz = llenarMatrizManual();
        
        if (esAntiSimetrica(matriz))
            System.out.println("Es antisimetrica");
        else
            System.out.println("No es antisimetrica.");
        /*
        //EJ 20 fucking matriz magica.
        int[][] matriz = llenarMatrizManual();
        if (esMatrizMagica(matriz))
            System.out.println("Es magica");
        else
            System.out.println("No es magica.");
        
        //EJ 21
        //THERE IS NO WAY I'M DOING THAT.
        //////////////////////////
        //EXTRAS
        //////////////////////////
        //EJ 1-EXTRA
        int tiempo = 1600;
        int horas = 0;
        int dias = 0;
        if (tiempo > 60 * 24){
            dias = Math.round(tiempo / (60*24));
            tiempo = tiempo % (60*24);
        }
        if (tiempo > 60)
            horas = Math.round(tiempo / 60);
        System.out.println(tiempo + " minutos son " + dias + " dias y " + horas +" horas. ");
        
        //Ej2-extra
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int aux;
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println(a + " " + b + " " + c  + " " + d);
        */
        //EJ 3 4 5 6 7 8 ni ahi extra
        //
        
    }
    
    
    public static boolean esAntiSimetrica(int [][] matriz){
        boolean value = true;
        for (int i = 0; i<matriz.length; i++ ){
            if (matriz[i][matriz.length -i -1] != matriz[matriz.length - i -1][i] * - 1)
                value = false;
        }
        
        return value;
    }
    
    public static boolean esMatrizMagica (int [][] matriz){
        //primera Linea
        int sumaOriginal = 0;
        int nuevaSuma = 0;
        for (int i = 0; i<matriz.length; i++)
            sumaOriginal += matriz[0][i];
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                nuevaSuma +=matriz[i][j];
            }
            if (sumaOriginal != nuevaSuma)
                return false;
            nuevaSuma = 0;
        }    
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                nuevaSuma +=matriz[j][i];
            }
            if (sumaOriginal != nuevaSuma)
                return false;
            nuevaSuma = 0;
        }
        for (int i = 0; i<matriz.length; i++){
                nuevaSuma +=matriz[i][i];
        }
            if (sumaOriginal != nuevaSuma)
                return false;
            nuevaSuma = 0;
        for (int i = 0; i<matriz.length; i++){
                nuevaSuma +=matriz[i][matriz.length-1-i];
                }
            if (sumaOriginal != nuevaSuma)
                return false;
            nuevaSuma = 0;
        return true;
    }
    
    public static int [][] llenarMatrizManual(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamanio a inicializar: ");
        int size = leer.nextInt();
        int [][] vector = new int [size][size];
        for (int i = 0; i<size; i++)
            for (int j = 0; j<size; j++){
                vector[i][j] = leer.nextInt();
            }
        return vector;
    }
    
    public static void mostrarMatriz(int [][] vector){
        for (int i = 0; i<vector.length; i++){
            for (int j=0; j<vector.length; j++){
                System.out.print("[" + vector[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static int [][] llenarMatriz(){
            int [][] vector = new int [5][5];
        int c = 0;
        for (int i = 0; i<5; i++)
            for (int j = 0; j<5; j++){
                vector [i][j] = c;
                c++;
            }
        return vector;
    }
    
    public static int [][] ej18 (int vector[][]){
        int [][] newVector = new int [5][5];
        for (int i = 0; i<5; i++)
            for (int j =0; j<5; j++)
                newVector[j][i] = vector[i][j];
        return newVector;
    }
    
   //EJ15 MOD 16
    public static int [] rellenarVector( int vector[]){
        Random rand = new Random ();
        for (int i = 0; i<vector.length; i++){
            vector [i] = rand.nextInt(20);
            //System.out.println(vector[i]);
        }
        return vector;
    }
     
    //EJ 14
    public static void convertirInfo(float euros,String moneda){
        switch (moneda){
            case "libras":
                System.out.println(0.86*euros + " es la conversion a Libras");
                break;
            case "pesos":
                System.out.println(1.28611*euros + " es la conversion a pesos");
                break;
            case "yenes":
                System.out.println(129852*euros + " es la conversion a yenes");
                break;
            default:
                System.out.println("Unknown conversion");
        }
    }
    
      
}



