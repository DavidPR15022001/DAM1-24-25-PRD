package ud2.ejemplos;

import java.util.Scanner;

public class EjemploWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;

        System.out.print("Introduzca un número ( < 0 para finalizar): ");
        num = sc.nextInt();

        while (num >= 0) {
            suma += num;
            System.out.print("Introduzca un número ( < 0 para finalizar): ");
            num = sc.nextInt();
        }

        sc.close();

        System.out.println("La suma es: " + suma);
    }
}
