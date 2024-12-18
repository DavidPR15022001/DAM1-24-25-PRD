// David Padín Ruibal
package ud2.prdexamenrec;

import java.util.Scanner;

public class EstadisticaEstaturas {
    public static void main(String[] args) {
        // Declaración de variables
        double estatura, sumaEstaturas = 0, mediaEstaturas = 0, estaturaMasAlta, estaturaMasBaja;
        int numeroAlumnos = 0;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las estaturas en cm de los alumnos (número negativo para terminar):");

        // Lectura adelantada
        estatura = sc.nextDouble();

        // Verificar si hay al menos una estatura válida
        if (estatura >= 0) {
            // Inicializar estatura más alta y más baja con la primera entrada válida
            estaturaMasAlta = estatura;
            estaturaMasBaja = estatura;

            // Procesar las estaturas
            while (estatura >= 0) {
                numeroAlumnos++; // Contador de alumnos
                sumaEstaturas += estatura; // Acumulador de estaturas

                // Actualizar estatura más alta
                if (estatura > estaturaMasAlta) {
                    estaturaMasAlta = estatura;
                }

                // Actualizar estatura más baja
                if (estatura < estaturaMasBaja) {
                    estaturaMasBaja = estatura;
                }

                // Leer siguiente estatura
                estatura = sc.nextDouble();
            }

            // Cálculo de la media
            mediaEstaturas = sumaEstaturas / numeroAlumnos;

            // Salida de resultados
            System.out.println("Número de alumnos: " + numeroAlumnos);
            System.out.printf("Media de estaturas: %.2f cm%n", mediaEstaturas);
            System.out.println("Estatura más alta: " + estaturaMasAlta + " cm");
            System.out.println("Estatura más baja: " + estaturaMasBaja + " cm");
        } else {
            System.out.println("No has introducido ninguna estatura válida.");
        }

        sc.close();
    }
}


