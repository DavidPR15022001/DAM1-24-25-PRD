package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class E0210 {
    public static void main(String[] args) {
        int nota;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota (número entero) de 0 a 10: ");
        nota = sc.nextInt();
        sc.close();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10.");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("La nota debe estar entre 0 y 10.");
        }

        switch (nota) {
            case 0, 1, 2, 3, 4 ->
                System.out.println("Insuficiente");
            case 5 ->
                System.out.println("Suficiente");
            case 6 ->
                System.out.println("Bien");
            case 7, 8 ->
                System.out.println("Notable");
            case 9, 10 ->
                System.out.println("Sobresaliente");
            default ->
                System.out.println("La nota debe estar entre 0 y 10.");
        }

        String notaTexto = switch (nota) {
            case 0, 1, 2, 3, 4 -> {
                yield "Insuficiente";
            }
            case 5 -> {
                yield "Suficiente";
            }
            case 6 -> {
                yield "Bien";
            }
            case 7, 8 -> {
                yield "Notable";
            }
            case 9, 10 -> {
                yield "Sobresaliente";
            }
            default -> {
                yield "La nota debe estar entre 0 y 10.";
            }
        };
        System.out.println(notaTexto);

        System.out.println("Fin del programa");
    }
}
