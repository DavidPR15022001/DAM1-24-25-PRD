package ud1.ejercicios;

import java.util.Scanner;

public class Ex3_NumerosOrdenados {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int num1, num2, num3;
        boolean mayorAMenor, menorAMayor;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tres números enteros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        sc.close();

        // Proceso
        mayorAMenor = num1 >= num2 && num2 >= num3;
        menorAMayor = num1 <= num2 && num2 <= num3;

        // Salida
        System.out.println("Están ordenados? " + (mayorAMenor || menorAMayor));
        System.out.println("Están ordenados de mayor a menor? " + mayorAMenor);
        System.out.println("Están ordenados de menor a mayor? " + menorAMayor);
    }

}
