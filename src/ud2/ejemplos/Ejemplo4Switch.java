package ud2.ejemplos;

import java.util.Scanner;

public class Ejemplo4Switch {
    public static void main(String[] args) {
        int numeroDia;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero del día de la semana (1 a 7): ");
        numeroDia = sc.nextInt();
        sc.close();
        switch (numeroDia) {
            case 1, 3, 5:
                System.out.println("Tenemos clase de programación");
                break;
            case 2, 4:
                System.out.println("Vaya, que pena");
                System.out.println("Hoy no tenemos clase de programación");
                break;
            case 6, 7:
                System.out.println("Estoy deseando que llegue el lunes!!");
                break;
            default:
                System.out.println("Número de día no válido");
        }
    }
}
