package ud2.ejercicios.PRD20241030;

import java.util.Random;
import java.util.Scanner;

public class E0303 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        Scanner scanner = new Scanner(System.in);
        int intento;

        System.out.println("¡Adivina el número entre 1 y 100!");
        System.out.println("Introduce un número (-1 para rendirte):");

        while (true) {
            intento = scanner.nextInt();

            if (intento == -1) {
                System.out.println("Te has rendido. El número secreto era: " + numeroSecreto);
                break;
            }

            if (intento < 1 || intento > 100) {
                System.out.println("Por favor, introduce un número entre 1 y 100.");
            } else if (intento < numeroSecreto) {
                System.out.println("Mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("Menor");
            } else {
                System.out.println("¡Correcto! Has adivinado el número: " + numeroSecreto);
                break;
            }
        }

        scanner.close();
    }
}
