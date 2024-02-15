
import com.dam.Excepciones.TooShortWordException;
import com.dam.gestorpalabras.GestorPalabras;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dev
 */
public class GestorPalabrasTest {

    @Test
    public void esPalindromoFrase() throws TooShortWordException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true, gp.esPalindromo("allí ves sevilla"));
    }

    @Test
    public void esPalindromoPalabra() throws TooShortWordException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true, gp.esPalindromo("ana"));
    }

    @Test
    public void noEsPolindromoFrase() throws TooShortWordException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(false, gp.esPalindromo("allí ves sevila"));
    }

    @Test
    public void noEsPolindromoPalabra() throws TooShortWordException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(false, gp.esPalindromo("ordenador"));
    }

    @Test(expected = Exception.class)
    public void palabraCorta() throws TooShortWordException {
        GestorPalabras gp = new GestorPalabras();
        assertTrue(gp.esPalindromo("la"));
    }

    @Test(expected = Exception.class)
    public void noPalabra() throws TooShortWordException {
        GestorPalabras gp = new GestorPalabras();
        assertTrue(gp.esPalindromo(""));
    }

    @Test
    public void contarVocalesPalabra() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(4, gp.contarVocales("ordenador"));
    }
    @Test
    public void contarVocalesFrase() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(7, gp.contarVocales("el ordenador va mal"));
    }
    @Test
    public void contarVocalesConOSinTildes() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(2, gp.contarVocales("árbol"));
        assertEquals(6, gp.contarVocales("allí ves sevilla"));
    }

    @Test
    public void invertirPalabras() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("aloh", gp.invertirPalabra("hola"));
        assertEquals("lobrá", gp.invertirPalabra("árbol"));
    }
    
    @Test
    public void invertirFrase() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("oinotnA omall em", gp.invertirPalabra("me llamo Antonio"));
        assertEquals("lobrá", gp.invertirPalabra("árbol"));
    }

}
