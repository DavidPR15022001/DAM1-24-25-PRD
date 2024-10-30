package ud2.ejemplos;

import java.util.Scanner;

public class EjemploWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int contador = 0;
        System.out.print("Introduce número de asteriscos a mostrar: ");
        N = sc.nextInt();
        sc.close();

        while (contador < N) {
            System.out.print("*");
            contador++;
        }
        System.out.println("Fin programa");
    }
}
