package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514 {
    public static void main(String[] args) {
        double importe = 0;
        Scanner sc = new Scanner(System.in);
        double[] t = new double[0];
        do {
            System.out.print("Introduce el sueldo: ");
            importe = sc.nextDouble();
            if (importe != -1) {
                t = Arrays.copyOf(t, t.length + 1);
                t[t.length - 1] = importe;
            }
        } while (importe != -1);
        sc.close();

        if (t.length == 0) {
            System.out.println("No has introducido ningún sueldo. No hay estadísticas que mostrar.");
        } else {
            double suma = 0, max = 0, min = Double.MAX_VALUE;
            Arrays.sort(t);
            for (int i = t.length - 1; i>= 0; i--) {
                System.out.print(t[i] + " ");
                suma += t[i];

                if (t[i] > max)
                max = t[i];
                else if (t[i] < min)
                min = t[i];
            }
            double media = suma / t.length;

            System.out.println("Mínimo: " + min);
            System.out.println("Máximo: " + max);
            System.out.println("Medio de los sueldos: " + media);

            int supMedia = 0, infMedia = 0;
            for (int i = 0; i < t.length; i++) {
                if (t[i] > media)
                supMedia ++;
                else if (t[i] < media)
                infMedia++;
            }
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; i < t.length; j++) {
                    if (t[j + 1] > t[j]) {
                        int aux = 0;
                        t[j] = aux;
                    }
                }
            }
        }

    }
}
