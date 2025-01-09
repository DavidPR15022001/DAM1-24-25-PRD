package ud4.arraysejercicios;

import java.util.Scanner;

public class EP0515 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_ALUMNOS = 5;
        final int NUM_TRIMESTRES = 3;

        int[][] notas = new int[NUM_ALUMNOS][NUM_TRIMESTRES];

        // Leer las notas de los alumnos
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Introduce las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < NUM_TRIMESTRES; j++) {
                System.out.print("Trimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextInt();
            }
        }

        // Calcular y mostrar la media del grupo en cada trimestre
        for (int j = 0; j < NUM_TRIMESTRES; j++) {
            int sumaTrimestre = 0;
            for (int i = 0; i < NUM_ALUMNOS; i++) {
                sumaTrimestre += notas[i][j];
            }
            double mediaTrimestre = (double) sumaTrimestre / NUM_ALUMNOS;
            System.out.printf("La media del grupo en el trimestre %d es: %.2f\n", (j + 1), mediaTrimestre);
        }

        // Pedir al usuario la posición de un alumno para calcular su media
        System.out.print("Introduce la posición del alumno (1-5) para calcular su media: ");
        int posicionAlumno = scanner.nextInt();

        if (posicionAlumno < 1 || posicionAlumno > NUM_ALUMNOS) {
            System.out.println("Posición no válida.");
        } else {
            int indiceAlumno = posicionAlumno - 1;
            int sumaAlumno = 0;
            for (int j = 0; j < NUM_TRIMESTRES; j++) {
                sumaAlumno += notas[indiceAlumno][j];
            }
            double mediaAlumno = (double) sumaAlumno / NUM_TRIMESTRES;
            System.out.printf("La media del alumno %d es: %.2f\n", posicionAlumno, mediaAlumno);
        }

        scanner.close();
    }
}