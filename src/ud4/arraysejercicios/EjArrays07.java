package ud4.arraysejercicios;

import java.util.Scanner;

public class EjArrays07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de alturas
        System.out.print("Introduce el número de alturas: ");
        int n = scanner.nextInt();

        // Declarar el array para almacenar las alturas
        double[] alturas = new double[n];

        // Leer las alturas
        System.out.println("Introduce las alturas:");
        for (int i = 0; i < n; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
        }

        // Calcular la altura media
        double suma = 0;
        for (double altura : alturas) {
            suma += altura;
        }
        double media = suma / n;

        // Calcular cuántas alturas son superiores e inferiores a la media
        int superiores = 0;
        int inferiores = 0;
        for (double altura : alturas) {
            if (altura > media) {
                superiores++;
            } else if (altura < media) {
                inferiores++;
            }
        }

        // Mostrar los resultados
        System.out.printf("Altura media: %.2f\n", media);
        System.out.println("Alturas superiores a la media: " + superiores);
        System.out.println("Alturas inferiores a la media: " + inferiores);

        scanner.close();
    }
}
