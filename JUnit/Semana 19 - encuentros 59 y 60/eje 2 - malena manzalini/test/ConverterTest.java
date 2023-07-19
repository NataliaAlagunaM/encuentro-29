
import entities.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    TemperatureConverter tc;

    public ConverterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("Before");
        tc = new TemperatureConverter();
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void deberiaDevolverFarenheitACelsius() {
        assertEquals(20, tc.farenheitACelsius(68), 0);
    }

    @Test
    public void deberiaDevolverCelsiusAFarenheit() {
        assertEquals(68, tc.celsiusAFarenheit(20), 0);
    }

    @Test
    public void deberiaDevolverFarenheitAKelvin() {
        assertEquals(273.15, tc.farenheitAKelvin(32), 0);
    }
    
     @Test
    public void deberiaDevolverKelvinAFarenheit() {
        assertEquals(32, tc.kelvinAFarenheit(273.15), 0);
    }
    
    @Test
    public void deberiaDevolverCelsiusAKelvin() {
        assertEquals(0, tc.celsiusAKelvin(-273.15), 0);
    }
   
    @Test
    public void deberiaDevolverKelvinACelsius() {
        assertEquals(0, tc.kelvinACelsius(273.15), 0);
    }

}
