package ud1.identificadores;

import java.util.Scanner;

public class InteresCompuesto {
    public static void main(String[] args) {
        double importeInicial, importeFinal;
        int anhos;

        final double INTERES = 0.05;
        final double NUM_PAGOS = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Importe a invertir (euros): ");
        importeInicial = sc.nextDouble();

        System.out.print("Duración de la inversión (años): ");
        anhos = sc.nextInt();

        sc.close();

        double base = 1 + INTERES / NUM_PAGOS;
        double exponente = NUM_PAGOS * anhos;

        importeFinal = importeInicial * Math.pow(base, exponente);

        System.out.println("El importe final tras " + anhos + " de inversión es de " + importeFinal + " euros");
    }
}
