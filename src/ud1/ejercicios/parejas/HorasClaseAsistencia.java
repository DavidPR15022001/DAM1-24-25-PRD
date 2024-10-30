package ud1.ejercicios.parejas;

import java.util.Scanner;

public class HorasClaseAsistencia {
    public static void main(String[] args) {
        String[] modulos = {
            "Programación",
            "Linguaxes de marcas e sistemas de xestión de información",
            "Bases de Datos"
        };
        
        int[] horasModulo = {240, 133, 187};
        final int DURACION_SESION_MINUTOS = 50;

        for (int i = 0; i < modulos.length; i++) {
            String nombreModulo = modulos[i];
            int horasModuloActual = horasModulo[i];

            int minutosTotales = horasModuloActual * 60;
            int sesiones = minutosTotales / DURACION_SESION_MINUTOS;

            double porcentajeApercibimiento = 0.06;
            double porcentajePerdidaEvaluacion = 0.10;

            int faltasApercibimiento = (int) Math.ceil(sesiones * porcentajeApercibimiento);
            int faltasPerdidaEvaluacion = (int) Math.ceil(sesiones * porcentajePerdidaEvaluacion);

            System.out.println("Módulo: " + nombreModulo);
            System.out.println("Total de sesiones (50 minutos): " + sesiones);
            System.out.println("Número de faltas sin justificar que implican un apercibimiento: " + faltasApercibimiento);
            System.out.println("Número de faltas sin justificar para pérdida de evaluación continua: " + faltasPerdidaEvaluacion);
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de faltas de un alumno: ");
        int faltasAlumno = scanner.nextInt();

        for (int i = 0; i < modulos.length; i++) {
            String nombreModulo = modulos[i];
            int horasModuloActual = horasModulo[i];
            int minutosTotales = horasModuloActual * 60;
            int sesiones = minutosTotales / DURACION_SESION_MINUTOS;

            int faltasApercibimiento = (int) Math.ceil(sesiones * 0.06);
            int faltasPerdidaEvaluacion = (int) Math.ceil(sesiones * 0.10);

            System.out.println("Evaluación para el módulo: " + nombreModulo);
            if (faltasAlumno > faltasPerdidaEvaluacion) {
                System.out.println("El alumno ha perdido la evaluación continua.");
            } else if (faltasAlumno > faltasApercibimiento) {
                System.out.println("El alumno recibirá un apercibimiento.");
            } else {
                System.out.println("No hay ningún problema con el número de faltas.");
            }
            System.out.println();
        }

        scanner.close();
    }
}
