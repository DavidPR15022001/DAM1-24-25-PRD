package ud2.ejercicios;

import java.util.Scanner;

public class E0207 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres números:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        System.out.print("Números ordenados de mayor a menor: ");

        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println(b + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + c + " " + a);
                }
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
