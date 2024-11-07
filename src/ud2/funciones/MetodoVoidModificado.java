package ud2.funciones;

import java.util.Scanner;

public class MetodoVoidModificado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cadena de texto: ");
        String cadena = sc.nextLine();
        System.out.print("Introduce el carácter para la caja: ");
        char caracter = sc.next().charAt(0);
        sc.close();
        
        int n = cadena.length();
        for (int i = 0; i < n + 4; i++) System.out.print(caracter); // Línea superior
        System.out.println();
        System.out.println(caracter + " " + cadena + " " + caracter); // Texto con bordes
        for (int i = 0; i < n + 4; i++) System.out.print(caracter); // Línea inferior
        System.out.println();
    }
}
