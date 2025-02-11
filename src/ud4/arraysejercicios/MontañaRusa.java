package ud4.arraysejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MontañaRusa {
    public static int contarPicos(int[] alturas) {
        int picos = 0;
        int n = alturas.length;

        // Recorrer el array de alturas
        for (int i = 0; i < n; i++) {
            // Índices de los puntos anterior y siguiente (con índice circular)
            int anterior = (i - 1 + n) % n;
            int siguiente = (i + 1) % n;

            // Verificar si es un pico
            if (alturas[i] > alturas[anterior] && alturas[i] > alturas[siguiente]) {
                picos++;
            }
        }

        return picos;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] alturas = { 10, 20, 10, 30, 25, 15 };
        System.out.println("Número de picos: " + contarPicos(alturas));
    }

    @Test
    void testContarPicos_CasoBase() {
        int[] alturas = { 1, 2, 3, 2, 1 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MultiplesPicos() {
        int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        assertEquals(2, contarPicos(alturas));
    }

    @Test
    void testContarPicos_PicoAlFinal() {
        int[] alturas = { 1, 2, 3, 4, 5 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_PicoEnInicio() {
        int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MontañaCircularSinPicos() {
        int[] alturas = { 3, 2, 1, 2, 3 };
        assertEquals(0, contarPicos(alturas));
    }

    @Test
    void testContarPicos_MontañaCircularConVariosPicos() {
        int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
        assertEquals(2, contarPicos(alturas));
    }

}
