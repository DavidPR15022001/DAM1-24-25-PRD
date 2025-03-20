package ud5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgeClassifierTest {
    
    @Test
    void testInfantil() {
        assertEquals("Infantil", AgeClassifier.classify(0));
        assertEquals("Infantil", AgeClassifier.classify(5));
        assertEquals("Infantil", AgeClassifier.classify(12));
    }

    @Test
    void testAdolescente() {
        assertEquals("Adolescente", AgeClassifier.classify(13));
        assertEquals("Adolescente", AgeClassifier.classify(15));
        assertEquals("Adolescente", AgeClassifier.classify(17));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", AgeClassifier.classify(18));
        assertEquals("Adulto", AgeClassifier.classify(30));
        assertEquals("Adulto", AgeClassifier.classify(64));
    }

    @Test
    void testSenior() {
        assertEquals("Senior", AgeClassifier.classify(65));
        assertEquals("Senior", AgeClassifier.classify(80));
        assertEquals("Senior", AgeClassifier.classify(120));
    }

    @Test
    void testEdadInvalida() {
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> AgeClassifier.classify(-1));
        assertEquals("Idade non válida", exception1.getMessage());
        
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> AgeClassifier.classify(121));
        assertEquals("Idade non válida", exception2.getMessage());
    }
}
