package ud2.ejemplos;

public class EjemploFor4 {
    public static void main(String[] args) {
        for (int a = 1, b = 1; a + b < 10; a++, b += 2) {
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a + b));
        }
    }
}
