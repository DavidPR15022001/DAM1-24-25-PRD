package ud2.prdexamen;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ChiclesRegalo {

    public static int totalChicles(int chiclesComprados, int envoltoriosRegalo, int chiclesGratis) {
        if (chiclesComprados < 0 || envoltoriosRegalo < 0 || chiclesGratis < 0) {
            return -1;
        }
        if (envoltoriosRegalo == 0) {
            return chiclesComprados;
        }
        if (chiclesGratis >= envoltoriosRegalo) {
            return -1;
        }
        int totalChicles = chiclesComprados;
        int envoltorios = chiclesComprados;

        while (envoltorios >= envoltoriosRegalo) {
            int chiclesNuevos = (envoltorios / envoltoriosRegalo) * chiclesGratis;
            totalChicles += chiclesNuevos;
            envoltorios = (envoltorios % envoltoriosRegalo) + chiclesNuevos;
        }
        return totalChicles;
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        assertEquals(-1, totalChicles(-1, 2, 1));
        assertEquals(-1, totalChicles(10, 1, -1));
        assertEquals(-1, totalChicles(20, 2, 2));
        assertEquals(10, totalChicles(7, 3, 1));
        assertEquals(40, totalChicles(27, 3, 1));
        assertEquals(21, totalChicles(11, 2, 1));
        assertEquals(31, totalChicles(16, 2, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(100, totalChicles(100, 0, 1));
        assertEquals(0, totalChicles(0, 0, 1));
        assertEquals(0, totalChicles(0, 2, 1));
    }

}
