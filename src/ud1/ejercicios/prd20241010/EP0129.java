package ud1.ejercicios.prd20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        n = sc.nextInt();
        sc.close();

        String salida = n % 7 == 0 ? "El número es múltiplo de 7. No hay que sumar nada" : "Para el siguiente múltiplo de 7 sumo " + (7 - n % 7);
        System.out.println(salida);
    }
}
