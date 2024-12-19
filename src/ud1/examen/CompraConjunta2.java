package ud1.examen;

import java.util.Scanner;

/**
 * Tres amig@s deciden juntar el dinero en efectivo que llevan encima para
 * comprar un artículo para compartir (por ejemplo, una pelota, un libro, un
 * disco, etc.). Haz un programa que permita introducir el precio del artículo
 * (en euros) y el dinero que aporta cada amig@ y que informe si el dinero
 * aportado es suficiente o no para adquirir el artítulo.
 * Si el dinero no es suficiente el programa informará de cuánto falta, y si
 * sobra, se indicará el importe del dinero sobrante que guardará como bote para
 * futuras compras conjuntas.
 */
public class CompraConjunta2 {
    public static void main(String[] args) {
        // Variables de entrada
        double precio, dineroAmigo1, dineroAmigo2, dineroAmigo3;
        // Variables de salida
        boolean dineroSuficiente;
        double dineroBote, dineroFaltante;

        // ENTRADA
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Dinero aportado por cada uno de los 3 amigos: ");
        dineroAmigo1 = sc.nextDouble();
        dineroAmigo2 = sc.nextDouble();
        dineroAmigo3 = sc.nextDouble();
        sc.close();

        // PROCESO
        double sumaDineroAmigos = dineroAmigo1 + dineroAmigo2 + dineroAmigo3;

        dineroSuficiente = sumaDineroAmigos >= precio;
        dineroBote = sumaDineroAmigos - precio;
        dineroFaltante = precio - sumaDineroAmigos;

        // SALIDA
        String msjBote = String.format("Compramos el producto y quedan %.2f euros de bote", dineroBote);
        String msjFalta = String.format("Faltan %.2f euros para comprar el producto.", dineroFaltante);
        String mensaje = dineroSuficiente ? msjBote : msjFalta;

        System.out.println(mensaje);
    }
}
