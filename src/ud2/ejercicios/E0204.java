package ud2.ejercicios;

import java.util.Scanner;

public class E0204 {
    public static void main(String[] args) {

        double numero;
        boolean casiCero = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número decimal:");
        numero = sc.nextDouble();
        sc.close();

        if (numero != 0) {
            if (numero > -1) {
                if (numero < 1) {
                    casiCero = true;
                }
            }
        }
        casiCero = numero != 0 && numero > -1 && numero < 1;
        
        if (casiCero) {
            System.out.println("El numero " + numero + " es casi-cero.");
        } else {
            System.out.println("El numero " + numero + " NO es casi-cero.");
        }
    }
}
