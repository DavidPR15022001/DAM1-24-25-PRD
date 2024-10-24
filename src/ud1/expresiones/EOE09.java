package ud1.expresiones;

import java.time.LocalDate;

public class EOE09 {
    public static void main(String[] args) {
        int n = 623;
        char a = '9';
        int n2 = 43;

        System.out.println("Construir expresiones algorítmicas\n");

        int v6 = (n % 10) + (n / 10 % 10) + (n / 100);
        System.out.println("6: (" + n + ") " + v6);

        boolean v10 = n / 100 % 2 == 1;
        System.out.println("10: (" + n + ") " + v10);

        boolean v12 = a >= 'A' && a <= 'Z';
        System.out.println("12: (" + a + ") " + v12);

        boolean v16 = !(a >= 'A' && a <= 'Z') && !(a >= 'a' && a <= 'z');
        System.out.println("16: (" + a + ") " + v16);

        int mes = 11;
        boolean v23 = mes == 4 || mes == 6 || mes == 9 || mes == 11;
        System.out.println("23: (" + mes + ") " + v23);

        int dn = 3;
        int mn = 10;
        int an = 2000;
        int da = LocalDate.now().getDayOfMonth();
        int ma = LocalDate.now().getMonthValue();
        int aa = LocalDate.now().getYear();
        boolean v28 = (aa > an + 18) || (aa - an == 18 && ma > mn) || (aa - an == 18 && ma == mn && da >= dn);
        System.out.println("28: Mayor de edad? " + v28);

        int n5 = 12321;
        boolean v31 = n5 % 10 == n5 / 10000 && n5 / 10 % 10 == n5 / 1000 % 10;
        System.out.println("31: (" + n5 + ") " + v31);

        boolean v36 = (n2 % 10) == (n2 / 10);
        System.out.println("36: (" + n2 + ") " + v36);
    }
}
