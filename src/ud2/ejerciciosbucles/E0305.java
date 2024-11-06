package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0305 {
    public static void main(String[] args) {
        final int NUM_MAXIMO = 100;
        int operando1;
        int operando2;
        int numUsuario;
        int numAciertos = 0;
        boolean falloUsuario = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULO MENTAL: SUMAS");

        do {

            operando1 = (int) (Math.random() * NUM_MAXIMO + 1);
            operando2 = (int) (Math.random() * NUM_MAXIMO + 1);

            System.out.print(operando1 + " + " + operando2 + " = ? ");
            numUsuario = sc.nextInt();

            if (numUsuario == operando1 + operando2) {
                numAciertos++;
            } else {
                System.out.println("Error! El resultado era " + (operando1 + operando2));
                falloUsuario = true;
            }
        } while (!falloUsuario);

        System.out.println("Has conseguido " + numAciertos + " aciertos.");

        sc.close();
    }
}
