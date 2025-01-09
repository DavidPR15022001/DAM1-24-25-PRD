package ud4.ejercicios;

import java.util.Random;

public class ArrayAleatorio {
    /**
     * Genera y devuelve un array de n números aleatorios entre -9 y 9, incluyendo el 0.
     * @param n
     * @return
     */
    static int[] arrayAleatorio(int n) {
        int[] t = new int[n];
        Random rnd = new Random();

        for(int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(19) - 9; // Asigna un número entre -9 y 9
        }

        return t;
    }

}

