package ud1.pruebas;

public class EP0126 {
    public static void main(String[] args) {
    
        double numero, raiz;
        
        java.util.Scanner entrada;
        
        entrada = new java.util.Scanner(System.in);

        System.out.print("Introduce un número real: ");
        numero = entrada.nextDouble();
        
        raiz = Math.sqrt(numero);

        System.out.println("Raíz cuadrada: " + raiz);
        
        entrada.close();
        
    }
}
