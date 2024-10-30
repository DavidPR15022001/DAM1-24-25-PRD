package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Escribe un número: ");
        numero = sc.nextInt();
        while (numero != 0) {
            // Proceso
            if (numero % 2 == 0)
                System.out.println("Es par");
            
            if (numero > 0) 
                System.out.println("Es positivo");

            System.out.println("El cuadrado es " + Math.pow(numero, 2));

            System.out.println("Escribe un número: ");
            numero = sc.nextInt();
        }
        sc.close();
    }
}
