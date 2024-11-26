package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        double precio;
        int cantidad;
        double precioTotal;
        Scanner sc= new Scanner(System.in);
        
        
        
        try {
            precio = sc.nextDouble();
            System.out.printf("Introduce el precio del producto en euros %.2f", precio);
            cantidad = sc.nextInt();
            System.out.println("Introduce la cantidad de unidades del producto");
        } catch (InputMismatchException e) {
            // TODO: handle exception
        }




        


        
        
        
    }
}
