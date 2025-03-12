package contornos.ud3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void factorialExcepcion() {
        try {
            int res = MathUtils.factorial(-1);
            fail("FALLO: n < 0 debería generar una excepción");
        } catch (Exception e) {
        }
    }

    @Test
    void factorialNoBucle() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    void factorialBucle() {
        assertEquals(1, MathUtils.factorial(1));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
    })
    public void factorialValores(int n, int valorEsperado) {
        assertEquals(valorEsperado, MathUtils.factorial(n));

    }

}
