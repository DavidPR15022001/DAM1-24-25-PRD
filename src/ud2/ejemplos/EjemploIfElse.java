package ud2.ejemplos;

import java.util.Scanner;

public class EjemploIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        sc.close();

        if (nota >= 5) {
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        } else {
            System.out.println("Lo siento, has suspendido");
        }

        System.out.println("Hasta Pronto!");
    }
}
