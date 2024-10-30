package ud1.ejercicios.parejas;

import java.util.Scanner;

public class HorasClaseAsistencia {
    public static void main(String[] args) {
        final String NOMBRE_MODULO = "Programación";
        final int HORAS_MODULO = 240;
        final int DURACION_SESION_MINUTOS = 50;

        // Cálculos
        int minutosTotales = HORAS_MODULO * 60;
        int sesiones = minutosTotales / DURACION_SESION_MINUTOS;

        // Cálculo de faltas
        double porcentajeApercibimiento = 0.06; // > 6%
        double porcentajePerdidaEvaluacion = 0.10; // > 10%

        int faltasApercibimiento = (int) Math.ceil(sesiones * porcentajeApercibimiento);
        int faltasPerdidaEvaluacion = (int) Math.ceil(sesiones * porcentajePerdidaEvaluacion);

        // Mostrar resultados
        System.out.println("Módulo: " + NOMBRE_MODULO);
        System.out.println("Total de sesiones (50 minutos): " + sesiones);
        System.out.println("Número de faltas sin justificar que implican un apercibimiento: " + faltasApercibimiento);
        System.out.println("Número de faltas sin justificar para pérdida de evaluación continua: " + faltasPerdidaEvaluacion);

        // Solicitar número de faltas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de faltas de un alumno: ");
        int faltasAlumno = scanner.nextInt();

        // Evaluar faltas
        if (faltasAlumno > faltasPerdidaEvaluacion) {
            System.out.println("El alumno ha perdido la evaluación continua.");
        } else if (faltasAlumno > faltasApercibimiento) {
            System.out.println("El alumno recibirá un apercibimiento.");
        } else {
            System.out.println("No hay ningún problema con el número de faltas.");
        }

        scanner.close();
    }
}
