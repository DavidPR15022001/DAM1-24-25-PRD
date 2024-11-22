package ud2.prdexamen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class DuracionDeBombillas {
    public static String causaFinBombilla(int horas, int encendidos, int horasPorEncendido) {
        
        if (horas <= 0 || encendidos <= 0 || horasPorEncendido <= 0 || horasPorEncendido > 10)
            return "ERROR";

        int horasMaxEstimadasUso = encendidos * horasPorEncendido;
        if (horasMaxEstimadasUso > horas) 
            return "HORAS";
        else if (horasMaxEstimadasUso < horas) 
            return "ENCENDIDOS";
        else 
            return "ENCENDIDOS + HORAS";
    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
}
}





