package ud1.ejercicios.parejas;

public class EP0127 {
    public static void main(String[] args) {

        int a = 5, b = 7;
            
        System.out.println("Antes: a = " + a + ", b = " + b);

        int temp;
            
        temp = a;
        a = b;
        b = temp;
            
        System.out.println("Después: a = " + a + ", b = " + b);
    }
}
