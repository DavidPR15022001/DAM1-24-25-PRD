package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        double precio;
        int cantidad;

        Scanner sc= new Scanner(System.in);
        
        
        
        try {
            precio = sc.nextDouble();
            System.out.printf("Introduce el precio del producto en euros %.2f", precio);
            cantidad = sc.nextInt();
            System.out.printf("Introduce la cantidad de unidades del producto", cantidad);
        } catch (InputMismatchException e) {
            System.out.println("¡¡ERROR!! debe introducirse un dato numérico");

        }




        


        
        
        
    }
}
