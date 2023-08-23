import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BarajaTest {
    private Baraja baraja;
    private ArrayList<Carta> cartaVacio;
    @Before
    public void setUp() throws Exception {
        Baraja baraja = new Baraja();
        ArrayList<Carta> cartaVacio = new ArrayList<Carta>();
    }
    @After
    public void tearDown() throws Exception {
        Baraja baraja = null;
        ArrayList<Carta> cartaVacio = null;
    }
    @Test
    public void testBarajar() {
        assertNull(baraja);
        
    }

    @Test
    public void testCartasDisponibles() {
        assertTrue(baraja.cartasDisponibles() == 40);
        assertEquals(40, baraja.cartasDisponibles());
        // assertEquals(baraja.cartasDisponibles(), 40);
        // assertTrue(null, false);
        
    }

    @Test
    public void testCartasMonton() {

    }

    @Test
    public void testDarCartas() {
        assertTrue(baraja.darCartas(1).size() == 1);
        assertEquals(baraja.darCartas(41), cartaVacio);
        assertEquals(baraja.darCartas(0), cartaVacio);
        assertEquals(baraja.darCartas(-1), cartaVacio);
    }

    @Test
    public void testGetALC() {

    }

    @Test
    public void testMostrarBaraja() {

    }

    @Test
    public void testSiguienteCarta() {

    }
}
