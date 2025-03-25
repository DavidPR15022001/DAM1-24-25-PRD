package contornos.ud3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    
    @Test
    void isValid() {
        assertEquals(true, PasswordValidator.isValid("Passw0rd"));
    }

    @Test
    void isNotValidFallaLongitud() {
        assertEquals(false, PasswordValidator.isValid("Passw0"));
    }

    @Test
    void isNotValidFallaMayúscula() {
        assertEquals(false, PasswordValidator.isValid("passw0rd"));
    }

    @Test
    void isNotValidFallaNumero() {
        assertEquals(false, PasswordValidator.isValid("Password"));
    }
}





