package ud1.ejercicios.nao20241004;

import java.util.Scanner;

/**
 * EP0122. Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, 
 * mostrando el resultado por pantalla.
 */
public class EP0122 {
    public static void main(String[] args) {
        double gradosF, gradosC;
        
        Scanner sc = new Scanner(System.in);
        // sc.useLocale(Locale.US);
        System.out.print("Introduce la temperatura en grados Farenheit: ");
        gradosF = sc.nextDouble();
        sc.close();

        gradosC = 5 / 9.0 * (gradosF - 32);

        //System.out.println("Esta temperatura es igual a " + gradosC + " grados");
        System.out.printf("Esta temperatura es igual a %.2f grados", gradosC);
        
    }
}
