package ud4.ejercicios;

import java.util.Arrays;

import ud4.ArraysUtil;

public class E0506 {
    static int numAciertos(Integer[] apuesta, Integer[] ganadora) {
        int numAciertos = 0;

        for (int numApuesta : apuesta) 
            if (Arrays.binarySearch(ganadora, numApuesta) >= 0)            
            numAciertos++;

        return numAciertos;
    }

    public static void main(String[] args) {
        Integer[] apuesta = ArraysUtil.arrayAleatorio(6, 1, 46);
        Integer[] ganadora = ArraysUtil.arrayAleatorio(6, 1, 46);
        Arrays.sort(ganadora);

        System.out.println("Combinación Ganadora" + Arrays.toString(ganadora));
        System.out.println("Tu apuesta:\t\t" + Arrays.toString(apuesta));
    
        System.out.println("Número de aciertos: " + numAciertos(apuesta, ganadora));
    }
}
