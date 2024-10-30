package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {

        final double IVA = 0.21;
        final double UMBRAL_DESCUENTO = 100;
        final double DESCUENTO = 0.05;

        double precioProducto;
        int numUnidades;
        double precioSinIva;
        double iva;
        double precioConIva;
        double descuento;
        double precioFinal;

        Scanner sc = new Scanner(System.in);
        System.out.print("Precio del producto: ");
        precioProducto = sc.nextDouble();
        System.out.print("Número de unidades: ");
        numUnidades = sc.nextInt();
        sc.close();

        precioSinIva = precioProducto * numUnidades;
        iva = precioSinIva * IVA;
        precioConIva = precioSinIva + iva;

        if (precioConIva > UMBRAL_DESCUENTO) {
            descuento = precioConIva * DESCUENTO;
            precioFinal = precioConIva - descuento;
        } else {
            precioFinal = precioConIva;
        }

        System.out.printf("Precio Final: %.2f € %n", precioFinal);
    }
}
