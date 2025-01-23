package ud4.stringsapuntes;

import java.util.Scanner;

public class E0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        System.out.println("La frase tiene " + contarEspacios(frase) + " espacios");
        sc.close();
    }
    static int contarEspacios(String cad) {
        int contEspacios = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (Character.isSpaceChar(cad.charAt(i)))
            contEspacios++;
        }
        return contEspacios;
    }
}
