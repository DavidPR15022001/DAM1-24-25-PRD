package ud1.operadores;

import java.util.Scanner;

public class E0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte edad;

        System.out.print("Escribe tu edad: ");
        edad = sc.nextByte();
        sc.close();

        edad++;

        System.out.println("El año que viene tendrás " + edad + " años.");
    }
}
