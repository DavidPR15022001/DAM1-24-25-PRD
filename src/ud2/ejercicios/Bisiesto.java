package ud2.ejercicios;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        int anho;
        boolean esBisiesto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Año: ");
        anho = sc.nextInt();

        sc.close();;
        
        boolean div4 = anho % 4 == 0;
        boolean div100 = anho % 100 == 0;
        boolean div400 = anho % 400 == 0;

        esBisiesto = div400 || div4 && !div100;

        if (esBisiesto) {
            System.out.println("El año " + anho + " es bisiesto.");
        } else {
            System.out.println("El año " + anho + " NO es bisiesto.");
        }
    }
}
