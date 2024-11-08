package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        int anho;
        boolean esBisiesto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Año: ");
        anho = sc.nextInt();

        sc.close();
        ;

        boolean div4 = anho % 4 == 0;
        boolean div100 = anho % 100 == 0;
        boolean div400 = anho % 400 == 0;
        /*
         * SOLUCIÓN CON IFs ANIDADOS
         * if (div4) {
         * if (div100) {
         * if (div400) {
         * esBisiesto = true;
         * } else {
         * esBisiesto = false;
         * }
         * } else {
         * esBisiesto = true;
         * }
         * } else {
         * esBisiesto = false;
         * }
         */

        /*
         * OTRA SOLUCIÓN CON IFs ANIDADOS
         * esBisiesto = false;
         * if (anho % 4 == 0) {
         * if (anho % 100 != 0) {
         * esBisiesto = true;
         * } else {
         * if (anho % 400 == 0) {
         * esBisiesto = true;
         * }
         * }
         * }
         */

        /*
         * SOLUCIÓN CON IF-ELSE Y EXPRESIÓN LÓGICA COMPLEJA
         * if (div400 || div4 && !div100) {
         * esBisiesto = true;
         * } else {
         * esBisiesto = false;
         * }
         */
        esBisiesto = div400 || div4 && !div100;

        if (esBisiesto) {
            System.out.println("El año " + anho + " es bisiesto.");
        } else {
            System.out.println("El año " + anho + " NO es bisiesto.");
        }
    }
}
