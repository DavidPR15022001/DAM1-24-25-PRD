package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    public static void main(String[] args) {
        double importe = 0;
        Scanner sc = new Scanner(System.in);
        double[] t = new double[0];

        // Lectura anticipada
        System.out.print("Introduce el sueldo: ");
        importe = sc.nextDouble();
        while (importe != -1) {
            t = Arrays.copyOf(t, t.length + 1);
            t[t.length - 1] = importe;
            // Lectura repetida
            System.out.print("Introduce el sueldo: ");
            importe = sc.nextDouble();
        }
        sc.close();



        if (t.length == 0) {
            System.out.println("No has introducido ningún sueldo. No hay estadísticas que mostrar");
        } else {
            double suma = 0, max = 0, min = Double.MAX_VALUE;
            Arrays.sort(t);
            System.out.print("Sueldos de mayor a menor: ");
            for (int i = t.length - 1; i >= 0; i--) {
                System.out.print(t[i] + " ");
                suma += t[i];

                if (t[i] > max)
                    max = t[i];
                else if (t[i] < min)
                    min = t[i];
            }

            double media = suma / t.length;

            System.out.println();
            System.out.println("Mínimo: " + min);
            System.out.println("Máximo: " + max);
            System.out.printf("Media de los sueldos: %.2f", media);

            int supMedia = 0, infMedia = 0;
            for (double e : t) {
                if (e > media)
                    supMedia++;
                else if (e < media)
                    infMedia++;
            }

            System.out.println("Sueldo superiores a la media: " + supMedia);
            System.out.println("Sueldo inferiores a la media: " + infMedia);
        }
    }
}
