
import com.dam.Excepciones.*;
import com.dam.gestorpalabras.GestorPalabras;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
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
    public void esPalindromoFrase() throws TooShortWordException, NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true, gp.esPalindromo("allí ves sevilla"));
    }

    @Test
    public void esPalindromoPalabra() throws TooShortWordException, NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true, gp.esPalindromo("ana"));
    }

    @Test
    public void noEsPolindromoFrase() throws TooShortWordException, NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(false, gp.esPalindromo("allí ves sevila"));
    }

    @Test
    public void noEsPolindromoPalabra() throws TooShortWordException, NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(false, gp.esPalindromo("ordenador"));
    }

    @Test(expected = Exception.class)
    public void palabraCorta() throws TooShortWordException, NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertTrue(gp.esPalindromo("la"));
    }

    @Test(expected = Exception.class)
    public void noPalabra() throws TooShortWordException, NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertTrue(gp.esPalindromo(""));
    }

    @Test(expected = Exception.class)
    public void numeroEsPalindromo() throws TooShortWordException, NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertTrue(gp.esPalindromo("1111"));
        assertTrue(gp.esPalindromo("hol4"));
    }

    @Test(expected = Exception.class)
    public void simbolosEsPalindromo() throws SymbolException, TooShortWordException, NoNumberException {
        GestorPalabras gp = new GestorPalabras();
        assertTrue(gp.esPalindromo("%hloafs"));
    }

    @Test
    public void contarVocalesPalabra() throws NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(4, gp.contarVocales("ordenador"));
    }

    @Test
    public void contarVocalesFrase() throws NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(7, gp.contarVocales("el ordenador va mal"));
    }

    @Test
    public void contarVocalesConOSinTildes() throws NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(2, gp.contarVocales("árbol"));
        assertEquals(6, gp.contarVocales("allí ves sevilla"));
    }

    @Test(expected = Exception.class)
    public void numeroContarVocales() throws NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true, gp.contarVocales("1111"));
        assertEquals(true, gp.contarVocales("hol4"));
    }

    @Test(expected = Exception.class)
    public void simbolosContarVocales() throws SymbolException, NoNumberException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true,gp.contarVocales("&&%fodh"));
    }

    @Test
    public void invertirPalabras() throws NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("aloh", gp.invertirPalabra("hola"));
        assertEquals("lobrá", gp.invertirPalabra("árbol"));
    }

    @Test
    public void invertirFrase() throws NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("oinotnA omall em", gp.invertirPalabra("me llamo Antonio"));
        assertEquals("etnemlaer és on", gp.invertirPalabra("no sé realmente"));
    }

    @Test(expected = Exception.class)
    public void numeroInvertirPalabras() throws NoNumberException, SymbolException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true, gp.contarVocales("hol4 m3 ll4m0 4nt0n10"));
        assertEquals(true, gp.contarVocales("hol4"));
    }
    
    @Test(expected = Exception.class)
    public void simbolosInvertirPalabras() throws SymbolException, NoNumberException {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true,gp.contarVocales("/ fua % ud$"));
    }

}
