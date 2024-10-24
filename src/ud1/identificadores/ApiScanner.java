package ud1.identificadores;

import java.time.LocalDate;
import java.util.Scanner;

public class ApiScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.println("Hola, " + nombre + ". Estamos aprendiendo a programar. ");

        System.out.print("En qué año naciste? ");
        int anhoNacimiento = sc.nextInt();
        sc.close();
        int anhoActual = LocalDate.now().getYear();
        int edad = anhoActual - anhoNacimiento;
        System.out.println("Debes tener unos " + edad + " años. Enhorabuena!");
    }
}
