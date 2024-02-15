
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
        assertEquals(true, gp.esPalindromo("allí ves sevilla"));
        assertEquals(true, gp.esPalindromo("ana"));
    }

    @Test
    public void noEsPolindromo() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(false, gp.esPalindromo("ordenador"));
        assertEquals(false, gp.esPalindromo("allí ves sevila"));
    }

    @Test
    public void contarVocales() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(4, gp.contarVocales("ordenador"));
        assertEquals(4, gp.contarVocales("caminata"));
    }

      @Test
    public void contarVocalesConOSinTildes() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(2, gp.contarVocales("árbol"));
        assertEquals(6, gp.contarVocales("allí ves sevilla"));
    }
    
}
