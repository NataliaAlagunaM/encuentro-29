/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.DiscountCalculator;
import Servicio.DiscountCalculatorServicio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author 57315
 */
public class DiscountCalculatorTest {
    DiscountCalculatorServicio dcs1;
    public DiscountCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //se inicializa el objeto
        dcs1 = new DiscountCalculatorServicio();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void DeberiaCalcularPrecio(){
        // (valorEsperado,valorActual )
        assertEquals(100 , dcs1.ObtenerDescuento(new DiscountCalculator(50,200)),0);
        

    }
}
