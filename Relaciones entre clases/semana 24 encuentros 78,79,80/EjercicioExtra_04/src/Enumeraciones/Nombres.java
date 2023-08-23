/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeraciones;

import java.util.Random;

/**
 *
 * @author Martin
 */
public enum Nombres {
    MARTIN, INGRID, NATALIA, SONIA, MALORY, RAFAEL, VIVIANA, LETICIA, ESTEFANIA, JEAN, VANESA;

    private static final Random PRNG = new Random();

    public static Nombres randomNombres() {
        Nombres[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }
}
