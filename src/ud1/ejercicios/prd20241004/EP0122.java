package ud1.ejercicios.prd20241004;

import java.util.Scanner;

public class EP0122 {
    public static void main(String[] args) {
        double gradosF, gradosC;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados Farenheit: ");
        gradosF = sc.nextDouble();
        sc.close();

        gradosC = 5 / 9.0 * (gradosF - 32);

        System.out.printf("Esta temperatura es igual a %.2f grados centigrados", gradosC);
    }
}
