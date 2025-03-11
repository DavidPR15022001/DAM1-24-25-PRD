package contornos.ud3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testFactorialPositivo() {

        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    public void testFactorialCero() {

        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    public void testFactorialUno() {

        assertEquals(1, MathUtils.factorial(1));
    }

    @Test
    public void testFactorialNumeroNegativo() {

        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }

    @Test
    public void testFactorialGrande() {

        assertEquals(3628800, MathUtils.factorial(10));
    }
}

