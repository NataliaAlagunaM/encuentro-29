/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author max72
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 7; i >= 0; i--) {

            boolean cabeza = i < 7;
            boolean cuerpo = i < 6;
            boolean brazoDerecho = i < 4;
            boolean brazoIzquierdo = i < 5;
            boolean piernaIzquierda = i < 3;
            boolean piernaDerecha = i < 2;
            boolean lazo = i<1;

            String model1 = "__________ \n|        ";
            String model2 = cabeza ? "O" : "";
            String model11= lazo?"\n|       ---":"";
            String model3 = " \n|       ";
            String model4 = brazoIzquierdo ? "\\" : " ";
            String model5 = cuerpo ? "|" : " ";
            String model6 = brazoDerecho ? "/" : " ";
            String model7 = " \n|        ";
            String model8 = piernaIzquierda ? "/" : " ";
            String model9 = piernaDerecha ? "\\" : " ";
            String model10 = " \n| \n==============\n";

            String finalModel = model1 + model2+model11 + model3 + model4 + model5 + model6 + model7 + model8 + model9 + model10;

            System.out.println(finalModel);
        }
        System.out.println("modelFinal");
    }

}
