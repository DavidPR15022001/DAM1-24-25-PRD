package ud2.ejemplos;

public class EjemploFor1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        /*
         * BUCLE WHILE EQUIVALENTE
         * int i = 1;
         * while (i <= 10) {
         * System.out.print(i + " ");
         * i++;
         * }
         */
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\nFin programa: ");
    }
}
