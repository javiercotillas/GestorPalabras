
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
    public void introducirNumeros() {
        GestorPalabras gp = new GestorPalabras();
        assertEquals(false, gp.esPalindromo("3ew567"));
        assertEquals(true, gp.esPalindromo("00100"));
    }
    
}
