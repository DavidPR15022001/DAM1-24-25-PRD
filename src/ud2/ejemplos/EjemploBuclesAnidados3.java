package ud2.ejemplos;

public class EjemploBuclesAnidados3 {
    public static void main(String[] args) {
        int x, n;
        System.out.printf("%10s%10s%10s%10s%n", "x", "x^2", "x^3", "x^4");
        for (x = 1; x <= 10; x++) {
            for (n = 1; n <= 4; n++) {
                System.out.printf("%10.0f", Math.pow(x, n));
            }
            System.out.println();
        }
    }
}
