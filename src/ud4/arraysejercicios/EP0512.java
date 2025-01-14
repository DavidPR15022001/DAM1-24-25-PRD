package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Random;

public class EP0512 {
    public static void desordenar(int t[]) {
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            int nuevaPosicion = rnd.nextInt(t.length);
            if (i != nuevaPosicion) {
                int aux = t[i];
                t[i] = t[nuevaPosicion];
                t[nuevaPosicion] = aux;
            }
        }
        
    }

    
    public static void main(String[] args) {
        int[] array = arrayAleatorio(6,1,10);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        desordenar(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] arrayAleatorio(int n, int rndInicio, int rndFin) {
        int[] t = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            t[i] = rnd.nextInt(rndFin - rndInicio + 1) + rndInicio;
        }
        return t;
    }
}
