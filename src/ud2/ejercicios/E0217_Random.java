package ud2.ejercicios;

public class E0217_Random {
    public static void main(String[] args) {
        int MAX = 99;
        int MIN = 1;
        Math.random();
        double n = Math.random() * MAX;
        int n2 = (int) (Math.random() * MAX);
        int n3 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        for (int i = 0; i < 100000; i++) {
            int num = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println(num);
            if (num > MAX)
                System.out.println("Número demasiado alto");
            if (num < MIN)
                System.out.println("Número demasiado bajo");
            if (num == 1)
                System.out.println("UNOOOO");
            if (num == 99)
                System.out.println("NOVENTA Y NUEVE");

        }
    }
}
