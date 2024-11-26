package ud2.prdexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ChiclesRegalo {

    public static int totalChicles(int chiclesComprados, int envoltorios, int chiclesRegalo) {
        int totalChicles = -1;



        return totalChicles;
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1 ));
        assertEquals(111, totalChicles(100, 10, 1));        
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
    }


}