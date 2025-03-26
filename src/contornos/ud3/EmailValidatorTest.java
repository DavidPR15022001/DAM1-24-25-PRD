// David Padin Ruibal DAM1 26/03/2025
package contornos.ud3;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    void noValidoPorNulo() {
        assertFalse(EmailValidator.isValid(null));
    }
}
