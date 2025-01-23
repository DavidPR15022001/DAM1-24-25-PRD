package ud4.ejercicios;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe un carácter y pulsa ENTER para analizarlo: ");
        String linea;
        do {
            linea = sc.nextLine();
        } while (linea.equals(""));
        char ch = linea.charAt(0);
        sc.close();

        System.out.println("Análisis del carácter: " + ch);
        System.out.println("- ¿Es un dígito? " + Character.isDigit(ch));
        System.out.println("- ¿Es una letra? " + Character.isLetter(ch));
        System.out.println("- ¿Es un dígito o una letra? " + Character.isLetterOrDigit(ch));
        System.out.println("- ¿Es minúscula? " + Character.isLowerCase(ch));
        if (Character.isLowerCase(ch))
            System.out.println("- - En mayúsculas sería " + Character.isUpperCase(ch));
        System.out.println("- ¿Es un carácter de espacio \' \'? " + Character.isSpaceChar(ch));
        System.out.println("- ¿Es un espacio en blanco? (incluye tabuladores, etc.) " + Character.isWhitespace(ch));
        System.out.println("Este carácter tiene como nombre: " + Character.getName(ch));
        
        
    }
}
