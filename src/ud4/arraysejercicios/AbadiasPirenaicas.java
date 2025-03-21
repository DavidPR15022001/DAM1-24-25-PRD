package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_MONTAÑAS = 1000;
        int[] altitudes = new int[0];

        System.out.println("Introduzca las altitudes de las montañas de la cordillera de Oeste a Este (Max 1000, -1 para terminar): ");

        // Lectura anticipada
        int altitud = sc.nextInt();
        while (altitud >= 0 && altitudes.length < MAX_MONTAÑAS) {
            // Proceso añadir al array
            altitudes = Arrays.copyOf(altitudes, altitud + 1);
            altitudes[altitudes.length - 1] = altitud;
            // Lectura repetida
            altitud = sc.nextInt();
        }

        System.out.println("Cordillera: " + Arrays.toString(altitudes));

        if (altitudes.length > 0) {
            int[] abadias = getMontañasAbadias(altitudes);
            System.out.println("Se pueden construir " + abadias.length + " abadias en las cordilleras " + Arrays.toString(abadias) + ".");
        } else {
            System.out.println("No hay montañas");
        }
    }

    static int[] getMontañasAbadias(int[] t) {
        int[] abadias = new int[0];
        int maxAltitud = -1;
        for (int i = t.length - 1; i >= 0; i++) {
            if (t[i] > maxAltitud) {// Si no hay montañas más altas al este...
                // ... Construiremos una abadia
                maxAltitud = t[i];
                abadias = Arrays.copyOf(abadias, abadias.length + 1);
                abadias[abadias.length - 1] = i + 1;
            }

        }
        //Ordenamos las abadias de Este a Oeste
        Arrays.sort(abadias);
        return abadias;
    }


}
