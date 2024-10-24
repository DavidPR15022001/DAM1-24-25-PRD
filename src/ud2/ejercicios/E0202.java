package ud2.ejercicios;

import java.util.Scanner;

public class E0202 {
    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número entero:");
        num2 = sc.nextInt();
        sc.close();

        if (num1 == num2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}
