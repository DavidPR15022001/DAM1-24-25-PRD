package ud4.arraysejercicios;

import java.util.Scanner;

public class EjArrays08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constante para el número de empleados
        final int NUM_EMPLEADOS = 20;

        // Arrays para almacenar nombres y sueldos
        String[] nombres = new String[NUM_EMPLEADOS];
        double[] sueldos = new double[NUM_EMPLEADOS];

        // Leer nombres y sueldos
        System.out.println("Introduce el nombre y sueldo de cada empleado:");
        for (int i = 0; i < NUM_EMPLEADOS; i++) {
            System.out.print("Nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
        }

        // Buscar el empleado con el sueldo más alto
        int indiceMayorSueldo = 0;
        for (int i = 1; i < NUM_EMPLEADOS; i++) {
            if (sueldos[i] > sueldos[indiceMayorSueldo]) {
                indiceMayorSueldo = i;
            }
        }

        // Mostrar el resultado
        System.out.println("\nEl empleado con el sueldo más alto es:");
        System.out.println("Nombre: " + nombres[indiceMayorSueldo]);
        System.out.printf("Sueldo: %.2f\n", sueldos[indiceMayorSueldo]);

        scanner.close();
    }
}
