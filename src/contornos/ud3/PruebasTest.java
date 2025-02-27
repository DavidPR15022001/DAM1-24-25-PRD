package contornos.ud3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PruebasTest {

// Tests Numero Perfecto

    @Test
    public void testNumeroPerfecto() {
        // Casos positivos
        assertTrue(Pruebas.esNumeroPerfecto(6), "6 es un número perfecto");
        assertTrue(Pruebas.esNumeroPerfecto(28), "28 es un número perfecto");
        assertTrue(Pruebas.esNumeroPerfecto(496), "496 es un número perfecto");
        
        // Casos negativos
        assertFalse(Pruebas.esNumeroPerfecto(1), "1 no es un número perfecto");
        assertFalse(Pruebas.esNumeroPerfecto(12), "12 no es un número perfecto");
        assertFalse(Pruebas.esNumeroPerfecto(100), "100 no es un número perfecto");
        
        // Casos límite
        assertFalse(Pruebas.esNumeroPerfecto(0), "0 no es un número perfecto");
        assertFalse(Pruebas.esNumeroPerfecto(-6), "Los números negativos no son considerados perfectos");
    }

// Tests Array Pares e Impares

    @Test
    public void testContarParesImpares() {
        // Caso 1: Array con solo números pares
        int[] numeros1 = {2, 4, 6, 8, 10};
        int[] resultado1 = Pruebas.contarParesImpares(numeros1);
        assertEquals(5, resultado1[0], "Debe haber 5 números pares");
        assertEquals(0, resultado1[1], "Debe haber 0 números impares");

        // Caso 2: Array con solo números impares
        int[] numeros2 = {1, 3, 5, 7, 9};
        int[] resultado2 = Pruebas.contarParesImpares(numeros2);
        assertEquals(0, resultado2[0], "Debe haber 0 números pares");
        assertEquals(5, resultado2[1], "Debe haber 5 números impares");

        // Caso 3: Array con mezcla de números pares e impares
        int[] numeros3 = {1, 2, 3, 4, 5, 6};
        int[] resultado3 = Pruebas.contarParesImpares(numeros3);
        assertEquals(3, resultado3[0], "Debe haber 3 números pares");
        assertEquals(3, resultado3[1], "Debe haber 3 números impares");

        // Caso 4: Array vacío
        int[] numeros4 = {};
        int[] resultado4 = Pruebas.contarParesImpares(numeros4);
        assertEquals(0, resultado4[0], "Debe haber 0 números pares");
        assertEquals(0, resultado4[1], "Debe haber 0 números impares");

        // Caso 5: Array con un solo número par
        int[] numeros5 = {2};
        int[] resultado5 = Pruebas.contarParesImpares(numeros5);
        assertEquals(1, resultado5[0], "Debe haber 1 número par");
        assertEquals(0, resultado5[1], "Debe haber 0 números impares");

        // Caso 6: Array con un solo número impar
        int[] numeros6 = {1};
        int[] resultado6 = Pruebas.contarParesImpares(numeros6);
        assertEquals(0, resultado6[0], "Debe haber 0 números pares");
        assertEquals(1, resultado6[1], "Debe haber 1 número impar");
    }

// Tests Scanner Pares e Impares


}





