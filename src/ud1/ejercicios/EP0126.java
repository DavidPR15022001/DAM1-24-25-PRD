package ud1.ejercicios;

public class EP0126 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        double numero, raiz;
        // En este ejercicio usamos la clase Scanner sin importarla previamente.
        java.util.Scanner sc;

        sc = new java.util.Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce un número real: ");
        numero = sc.nextDouble();
        sc.close();
        
        // Proceso
        raiz = Math.sqrt(numero);

        // Salida
        System.out.println("Raíz cuadrada: " + raiz);

    }
}
