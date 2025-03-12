package contornos.ud3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void testPalindromosSimples() {
        assertTrue(StringUtils.isPalindrome("reconocer"));
        assertTrue(StringUtils.isPalindrome("oso"));
    }

    @Test
    void testPalindromosConEspacios() {
        assertTrue(StringUtils.isPalindrome("Anita lava la tina"));
        assertTrue(StringUtils.isPalindrome("A Santa at NASA"));
    }

    @Test
    void testPalindromosConMayusculas() {
        assertTrue(StringUtils.isPalindrome("Reconocer"));
        assertTrue(StringUtils.isPalindrome("Oso"));
    }

    @Test
    void testNoPalindromos() {
        assertFalse(StringUtils.isPalindrome("Java"));
        assertFalse(StringUtils.isPalindrome("Hello world"));
    }

    @Test
    void testCadenasVaciasYUnCaracter() {
        assertTrue(StringUtils.isPalindrome(""));
        assertTrue(StringUtils.isPalindrome("a"));
    }
}
