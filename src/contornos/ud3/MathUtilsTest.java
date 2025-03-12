package contornos.ud3;

import org.junit.jupiter.api.Test;
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
}
