package ud1.prdexamen;

import java.util.Scanner;

public class CompraConjunta {
    public static void main(String[] args) {
        double precio, dineroAmigo1, dineroAmigo2, dineroAmigo3;

        boolean dineroSuficiente;
        double dineroBote, dineroFaltante;

        Scanner sc = new Scanner(System.in);
        System.out.print("Precio del producto");
        precio = sc.nextDouble();
        System.out.println("Dinero aportado por cada uno de los 3 amigos: ");
        dineroAmigo1 = sc.nextDouble();
        dineroAmigo2 = sc.nextDouble();
        dineroAmigo3 = sc.nextDouble();
        
        sc.close();

        double sumaDineroAmigos = dineroAmigo1 + dineroAmigo2 + dineroAmigo3;

        dineroSuficiente = sumaDineroAmigos >= precio;
        dineroBote = sumaDineroAmigos - precio;
        dineroFaltante = precio - sumaDineroAmigos;

        String msjBote = String.format("Compramos el producto y quedan %.2f euros de bote", dineroBote);
        String msjFalta = String.format("Faltan %.2f euros para comprar el producto.", dineroFaltante);
        String mensaje = dineroSuficiente ? msjBote : msjFalta;

        System.out.println(mensaje);

    }
}
