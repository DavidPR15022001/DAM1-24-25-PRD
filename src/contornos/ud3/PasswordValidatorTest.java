package contornos.ud3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void testPasswordValida() {
        assertTrue(PasswordValidator.isValid("Clave123"));
        assertTrue(PasswordValidator.isValid("Segura456")); 
    }

    @Test
    void testPasswordCorta() {
        assertFalse(PasswordValidator.isValid("C1ave"));
        assertFalse(PasswordValidator.isValid("A1b2"));
    }

    @Test
    void testFaltaMayuscula() {
        assertFalse(PasswordValidator.isValid("clave123"));
        assertFalse(PasswordValidator.isValid("password1"));
    }

    @Test
    void testFaltaNumero() {
        assertFalse(PasswordValidator.isValid("ClaveClave"));
        assertFalse(PasswordValidator.isValid("Password")); 
    }

    @Test
    void testCasosExtremos() {
        assertFalse(PasswordValidator.isValid(""));
        assertFalse(PasswordValidator.isValid("12345678")); 
        assertTrue(PasswordValidator.isValid("A1234567"));
    }
}





