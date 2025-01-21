package ud4.arraysejercicios;

import static org.junit.jupiter.api.DynamicContainer.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

/**
 * RegistroTiempos
 */
public class RegistroTiempos {

    public static void main(String[] args) {
        LocalTime inicio = LocalTime.now();
        Scanner sc = new Scanner(System.in);
        String entrada;
        int[] tiempos = new int[0];

        do {
            entrada = sc.nextLine();
            LocalTime nuevoTiempo = LocalTime.now();
            int segundosTranscurridos = nuevoTiempo.toSecondOfDay() - inicio.toSecondOfDay();
            tiempos = Arrays.copyOf(tiempos, tiempos.length +1);
            tiempos[tiempos.length - 1] = segundosTranscurridos;
            System.out.println("Segundos transcurridos = " + segundosTranscurridos);
            System.out.println("Hora actual: " + LocalTime.now());
        } while (!entrada.equalsIgnoreCase("F"));

        sc.close();

        System.out.println((Arrays.toString(tiempos)));
        int suma = 0;
        for (int t : tiempos)
            suma += t;
        double media = (double) suma / tiempos.length;
        System.out.println("Media: " + String.format("%.2f", media));

        int contMayores = 0;
        for (int t : tiempos) {
            if (t > media)
                contMayores++;
        }
        System.out.println("Número de registros por encima de la media" + contMayores);

    }
}