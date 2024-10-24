package ud2.ejercicios;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();
        
        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();
        
        System.out.print("Introduce el año: ");
        int año = scanner.nextInt();

        int diasDelMes;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasDelMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasDelMes = 30;
                break;
            case 2:
    
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    diasDelMes = 29;
                } else {
                    diasDelMes = 28;
                }
                break;
            default:
                System.out.println("Mes inválido.");
                scanner.close();
                return;
        }

        if (dia < 1 || dia > diasDelMes || mes < 1 || mes > 12) {
            System.out.println("Fecha inválida.");
        } else {
            dia++;
            if (dia > diasDelMes) {
                dia = 1;
                mes++;
                if (mes > 12) {
                    mes = 1;
                    año++;
                }
            }
            System.out.printf("El día siguiente es: %02d/%02d/%d%n", dia, mes, año);
        }

        scanner.close();
    }
}
