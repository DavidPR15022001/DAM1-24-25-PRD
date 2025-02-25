package ud5.apuntesherencia.ejemploabstractpolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

//Clase Principal
public class Polimorfismo1 {
    static Scanner sc = new Scanner(System.in);
    // ArrayList de referencias a objetos de la clase base Poligono
    static ArrayList<Poligono> poligonos = new ArrayList();

    public static void main(String[] args) {
        leerPoligonos();
        mostrarPoligonos();
    }

    // Se pide por teclado el tipo de Poligono a leer y se ejecuta el método
    // leer correspondiente
    public static void leerPoligonos() {
        int tipo;
        do {
            do {
                System.out.print("Tipo de poligono 1-> Rectangulo 2-> Triangulo 0-> FIN >>> ");
                tipo = sc.nextInt();
            } while (tipo < 0 || tipo > 2);
            if (tipo != 0) {
                switch (tipo) {
                    case 1:
                        leerRectangulo();
                        break;
                    case 2:
                        leerTriangulo();
                        break;
                }
            }
        } while (tipo != 0);
    }

    // Se crea un rectángulo y se añade al array
    public static void leerRectangulo() {
        double l1, l2;
        System.out.println("Introduzca datos del Rectángulo");
        do {
            System.out.print("Longitud del lado 1: ");
            l1 = sc.nextDouble();
        } while (l1 <= 0);
        do {
            System.out.print("Longitud del lado 2: ");
            l2 = sc.nextDouble();
        } while (l2 <= 0);
        Rectangulo r = new Rectangulo(l1, l2);
        poligonos.add(r);
        // En esta instrucción se produce una conversión implícita o upcasting
        // Se asigna una referencia de una clase derivada (Rectangulo)
        // a una referencia de la clase base (Poligono) ya que el ArrayList es
        // de tipo Poligono
    }
    // Se crea un triángulo y se añade al array
    public static void leerTriangulo() {
        double l1, l2, l3;
        System.out.println("Introduzca datos del Triangulo");
        do {
            System.out.print("Longitud del lado 1: ");
            l1 = sc.nextDouble();
        } while (l1 <= 0);
        do {
            System.out.print("Longitud del lado 2: ");
            l2 = sc.nextDouble();
        } while (l2 <= 0);
        do {
            System.out.print("Longitud del lado 3: ");
            l3 = sc.nextDouble();
        } while (l3 <= 0);
        Triangulo t = new Triangulo(l1, l2, l3);
        poligonos.add(t);
        //conversión implícita o upcasting igual que en el método anterior
    }

public static void mostrarPoligonos() {
// Se recorre el ArrayList poligonos que contiene
// referencias a Triangulos y Rectangulos.
// A p de tipo Poligono se le asignarán mediante upcasting referencias a objetos
}
}