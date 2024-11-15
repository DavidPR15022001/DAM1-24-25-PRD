//Saúl Fernández Salgado

package ud1.naoexamen;

import java.util.Scanner;

public class CompraConjunta {

    public static void main(String[] args) {
        double precioTotalProducto;
        double precio1, precio2, precio3;
        double bote;
        String respuesta;

        // Pido datos por pantalla

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa pedirá el precio de un artículo por" +
                " pantalla y la cantidad de dinero aportada por cada uno de los tres individuos" +
                " que participan en el pago");
        System.out.println();

        System.out.println("Introduzca el precio del artículo a comprar:");
        precioTotalProducto = sc.nextDouble();

        System.out.println("Por favor, introduzca la cantidad que pagará el primer individuo:");
        precio1 = sc.nextDouble();

        System.out.println("Por favor, introduzca la cantidad que pagará el segundo individuo:");
        precio2 = sc.nextDouble();

        System.out.println("Por favor, introduzca la cantidad que pagará el tercer individuo:");
        precio3 = sc.nextDouble();

        sc.close();

        // Realizo los calculos

        bote = precio1 + precio2 + precio3;

        bote -= precioTotalProducto;

        respuesta = bote == 0 ? "Se ha comprado el artículo con el precio justo" : 
                    bote > 0  ? "Sobran para el bote " + bote + " euros" : 
                                "Faltan " + -bote + " euros";
                                
        System.out.println(respuesta);

    }
}
