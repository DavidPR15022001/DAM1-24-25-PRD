package ud2.ejemplos;

import java.util.Scanner;

public class EjemploDoWhile1 {
    public static void main(String[] args) {
        int valor;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Introduce un número entero <= 100: ");
            valor = in.nextInt();
            if (valor > 100) {
                System.out.println("Número no valido");
            }
        } while (valor > 100);

        in.close();
        System.out.println("Ha introducido: " + valor);
    }
}
