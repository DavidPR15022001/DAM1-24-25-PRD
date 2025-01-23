package ud4.stringsapuntes;

import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera frase: ");
        String frase1 = sc.nextLine();
        System.out.println("Introduzca la segunda frase: ");
        String frase2 = sc.nextLine();

        sc.close();
        
        if (frase1.length() == frase2.length()) {
            System.out.println("Las dos frases tienen la misma logitud.");
        } else if (frase1.length() > frase2.length()) {
            imprimirFrase(frase1);
        } else {
            imprimirFrase(frase2);
        }
    }

private static void imprimirFrase(String frase) {
    System.out.println("La frase más larga, con " + frase.length() + " caracteres de logitud es: " + frase);
}
}
