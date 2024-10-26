package ud2.ejercicios;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        int dia, mes, anho;
        boolean hayQueIncrementarMes = false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Dia (DD): ");
        dia = sc.nextInt();
        System.out.print("Mes (MM): ");
        mes = sc.nextInt();
        System.out.print("Año (AAAA): ");
        anho = sc.nextInt();
        sc.close();

        dia++;

        hayQueIncrementarMes = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                yield dia > 31;
            }
            case 2 -> {
                boolean esBisiesto = anho % 400 == 0 || anho % 4 == 0 && !(anho % 100 == 0);
                yield (esBisiesto && dia > 29) || (!esBisiesto && dia > 28);
            }
            case 4, 6, 9, 11 -> {
                yield dia > 30;
            }
            default -> {
                yield false;
            }
        };

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia > 31) hayQueIncrementarMes = true;
                break;
            case 2:
                if (dia > 28) hayQueIncrementarMes = true;
                break;

            case 4, 6, 9, 11:
                if (dia > 30) hayQueIncrementarMes = true;
                break;
        }


        if (hayQueIncrementarMes) {
            dia = 1;
            mes++;

            if (mes > 12) {
                mes = 1;
                anho++;
            }
        }



        System.out.printf("El día siguiente es %d/%d/%d%n", dia, mes, anho);
    }
}
