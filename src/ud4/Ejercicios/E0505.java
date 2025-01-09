package ud4.ejercicios;
import java.util.Arrays;
import java.util.Random;
public class E0505 {
    static int[] rellenaPares(int longitud, int fin) {
        int[] t = new int[longitud];

        for(int i = 0; i < t.length; i++) {
            Random rnd = new Random();
            t[i] = rnd.nextInt(fin - 2) + 2;
        }
        return t;
    }
    public static void main(String[] args) {
        int[] t = rellenaPares(10,20);
        System.out.println(Arrays.toString(t));
    }
}

