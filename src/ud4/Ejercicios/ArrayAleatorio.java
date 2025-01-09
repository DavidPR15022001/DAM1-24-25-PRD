package ud4.ejercicios;

import java.util.Arrays;

public class ArrayAleatorio {
    public static void main(String[] args) {
        int[] t = E0501.arrayAleatorio(19, -9, 9);

        System.out.println(Arrays.toString(t));

        for (int e : t)
            System.out.print(e + " ");
        System.out.println();

        for(int i = 0; i < t.length; i++) 
            System.out.print(t[i] + " ");
        System.out.println();        
    }

}

