package ud2.funciones;

import java.util.Scanner;

public class MetodoVoidCambiarCaracterCaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena de texto
        System.out.println("Introduce una cadena de texto:");
        String cadena = scanner.nextLine();

        // Imprimir la cadena rodeada por almohadillas por defecto
        System.out.println("Cadena rodeada por almohadillas:");
        System.out.println("#" + cadena + "#");

        // Solicitar un nuevo carácter para rodear la cadena
        System.out.println("Introduce un carácter para rodear la cadena:");
        char caracter = scanner.next().charAt(0);

        // Imprimir la cadena rodeada por el carácter introducido
        System.out.println("Cadena rodeada por el carácter '" + caracter + "':");
        System.out.println(caracter + cadena + caracter);

        scanner.close();
    }
}