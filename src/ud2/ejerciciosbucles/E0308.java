package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0308 {
    public static void main(String[] args) {

        final int NUM_NUMEROS = 10;
        int numero;
        int suma = 0;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a calcular la media de " + NUM_NUMEROS + " números.");
        for (int i = 1; i <= NUM_NUMEROS; i++) {
            System.out.println("Escribe un número: ");
            numero = sc.nextInt();

            suma += numero;
        }

        media = suma / (double) NUM_NUMEROS;

        System.out.printf("La media es %.2f", media);

        sc.close();
    }

}
