package ud2.funciones;

import java.util.Scanner;

public class MetodoVoidModificado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario la cadena de texto
        System.out.print("Introduce cadena de texto: ");
        String cadena = sc.nextLine();
        
        // Pedimos al usuario el carácter para formar la caja
        System.out.print("Introduce el carácter para la caja: ");
        char caracter = sc.next().charAt(0);
        
        sc.close();
        
        // Llamada al método con el carácter personalizado
        cajaTexto(cadena, caracter);
    }

    // Método que muestra un String rodeado por un borde hecho con el carácter dado
    public static void cajaTexto(String str, char caracter) {
        int n = str.length(); // longitud del String

        // Imprimir línea superior con el carácter proporcionado
        imprimirLinea(n, caracter);
        
        // Imprimir la cadena con los bordes
        System.out.println(caracter + " " + str + " " + caracter);
        
        // Imprimir línea inferior con el carácter proporcionado
        imprimirLinea(n, caracter);
    }

    // Método que imprime una línea de caracteres
    public static void imprimirLinea(int n, char caracter) {
        for (int i = 1; i <= n + 4; i++) { // borde de arriba o abajo
            System.out.print(caracter);
        }
        System.out.println(); // Salto de línea después de imprimir la línea de caracteres
    }
}
