package contornos.ud3;

import java.util.Scanner;

public class Pruebas {

    public static boolean esNumeroPerfecto(int num) {
        int divisor, sumaDivisores;
        divisor = 1;
        sumaDivisores = 0;

        while (divisor < num / 2) {
            if (num % divisor == 0)
                sumaDivisores = sumaDivisores + divisor;
            divisor++;
        }
        
        if (num == sumaDivisores)
            return true;
        else
            return false;

    }

    // Método que cuente cuántos números de un array de entrada son pares y cuántos son impares

    static int[] contarParesImpares(int[] numeros) {

        int contPares = 0;
        int contImpares = 0;

        for (int n : numeros) {

            if (n % 2 == 0) {

                contPares++;
            } else {

                contImpares++;
            }
        }


        int[] contadores = { contPares, contImpares };
        return contadores;
    }

    // Método que lea 10 números de teclado y muestre cuántos son pares y cuántos son impares
    static void contarParesImpares() {
        
        int contPares = 0;
        int contImpares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 10 números: ");

        for (int i = 0; i < 10; i++) {
            
            int num = sc.nextInt();
            sc.close();
            
            if (num % 2 == 0) {
                
                contPares++;
            } else {
        
                contImpares++;
            }
        }

        System.out.printf("Pares: %d\nImpares: %d ", contPares, contImpares);

    }

}
