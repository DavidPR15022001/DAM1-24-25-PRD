package ud2.ejercicios;

import java.util.Scanner;

public class E0201 {
    public static void main(String[] args) {
        int numero;
        boolean par;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();
        sc.close();

        par = numero % 2 == 0;

        if (par) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }

        System.out.println("Fin del programa");
    }
}
