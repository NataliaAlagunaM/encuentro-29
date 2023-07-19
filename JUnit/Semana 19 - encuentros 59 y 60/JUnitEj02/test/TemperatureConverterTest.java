/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.TemperatureConverter;
import Servicio.TemperatureConverterServicio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 57315
 */
public class TemperatureConverterTest {
    TemperatureConverterServicio t1;
    public TemperatureConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        t1=new TemperatureConverterServicio();
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
    public void DeberiaCalcularTemperaturaFinal(){
        // (valorEsperado,valorActual )
        assertEquals(0 , t1.ValorFinal(new TemperatureConverter(0,1,1)),0);
        assertEquals(373.15 , t1.ValorFinal(new TemperatureConverter(100,1,3)),0);
        assertEquals(0 , t1.ValorFinal(new TemperatureConverter(32,2,1)),0);
       
        

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
