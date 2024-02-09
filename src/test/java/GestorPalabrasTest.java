
import com.dam.gestorpalabras.GestorPalabras;
import static junit.framework.TestCase.assertEquals;
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
    public void esPalindromo() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(true, gp.esPalindromo("ana"));
        assertEquals(false, gp.esPalindromo("ana"));
    }

    @Test
    public void noEsPolindromo() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(false, gp.esPalindromo("ordenador"));
        assertEquals(true, gp.esPalindromo("ordenador"));
    }

    @Test
    public void contarVocales() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(6, gp.contarVocales("abecedario"));
        //assertEquals(true, gp.esPalindromo("ordenador"));
    }
}
