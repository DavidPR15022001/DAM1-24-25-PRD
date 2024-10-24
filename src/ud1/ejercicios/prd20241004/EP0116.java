package ud1.ejercicios.prd20241004;

import java.util.Scanner;

public class EP0116 {
    public static void main(String[] args) {
        double distancia1;
        double distancia2;
        double distancia3;
        double distancia1Cm;
        double distancia3Cm;
        double suma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una distancia medida en milimetros");
        distancia1 = sc.nextDouble();
        System.out.println("Introduce una distancia medida en centimetros");
        distancia2 = sc.nextDouble();
        System.out.println("Introduce una distancia medida en metros");
        distancia3 = sc.nextDouble();

        sc.close();

        distancia1Cm = distancia1 / 10;
        distancia3Cm = distancia3 * 100;
        suma = distancia1Cm + distancia2 + distancia3Cm;

        System.out.println("La suma de las 3 logitudes introducidas es de " + suma);
    }
}
