package ud2;

import java.util.Scanner;

public class Util {

    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    static String notaEnTexto(int nota) {
        String notaEnTexto = "";
        return notaEnTexto;
    }

    static String notaEnTexto(double nota) {

        String notaEnTexto = "";
        
        if (nota >= 0 && nota < 5) {
            notaEnTexto = "insuficiente";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "notable";
        } else if (nota >= 9 && nota < 10) {
            notaEnTexto = "sobresaliente";
        }
        
        return notaEnTexto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota: ");
        double nota = sc.nextDouble();
        System.out.println(notaEnTexto(nota));
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número / Año ");
        int n = sc.nextInt();
        sc.close();

        if (esPar(n))
            System.out.println("Es Par");
        else
            System.out.println("Es Impar");

        if (esBisiesto(n))
            System.out.println("Es Bisiesto");
        else
            System.out.println("NO es bisiesto");

            System.out.println(mayor (4, 17));
            System.out.println(mayor (8, 1));
        }/* */

}
