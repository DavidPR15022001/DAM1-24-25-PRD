// David Padín Ruibal DAM1 26/03/2025
package contornos.ud3;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiscountSystemTest {
    @Test
    void valorNoValido() {
        try {
            DiscountSystem.applyDiscount(-1, false);
            fail("ERROR!! amount < 0 debería generar una excepción");
        } catch (Exception e) {

        }
    
    }
    @Test
    void valorEntre50Y100() {
        assertEquals(52.25, DiscountSystem.applyDiscount(55, false),0.01);
    }
    @Test
    void valorMayorQue100() {
        assertEquals(139.5, DiscountSystem.applyDiscount(155, false),0.01);
    }
    @Test
    void valorMayorQue200YLoyalCustomer() {
        assertEquals(216.75, DiscountSystem.applyDiscount(255, true),0.01);  
    }
}
