package ud2.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class E0217 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numero1 = random.nextInt(99) + 1;
        int numero2 = random.nextInt(99) + 1;
        
        System.out.println("¿Cuánto es " + numero1 + " + " + numero2 + "?");
        
        int respuestaUsuario = scanner.nextInt();
        
        int sumaCorrecta = numero1 + numero2;
        
        if (respuestaUsuario == sumaCorrecta) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta es " + sumaCorrecta);
        }

        scanner.close();
    }
}
