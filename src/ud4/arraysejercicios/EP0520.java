package ud4.arraysejercicios;

import java.util.Arrays;

public class EP0520 {

    // Función que fusiona dos tablas ordenadas en una tercera tabla ordenada
    public static int[] fusionOrdenada(int[] t1, int[] t2) {
        // Creamos un array para almacenar la tabla fusionada
        int[] resultado = new int[t1.length + t2.length];

        // Punteros para recorrer ambos arrays
        int i = 0, j = 0, k = 0;

        // Fusión de los dos arrays
        while (i < t1.length && j < t2.length) {
            if (t1[i] <= t2[j]) {
                resultado[k] = t1[i];
                i++;
            } else {
                resultado[k] = t2[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de t1, si los hay
        while (i < t1.length) {
            resultado[k] = t1[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de t2, si los hay
        while (j < t2.length) {
            resultado[k] = t2[j];
            j++;
            k++;
        }

        // Devolvemos el array fusionado
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la función fusionOrdenada
        int[] t1 = {1, 3, 5, 7, 9};
        int[] t2 = {2, 4, 6, 8, 10};

        // Fusionamos los dos arrays
        int[] resultado = fusionOrdenada(t1, t2);

        // Mostramos el resultado
        System.out.println("Tabla fusionada: " + Arrays.toString(resultado));
    }
}
