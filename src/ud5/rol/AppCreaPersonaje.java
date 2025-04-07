package ud5.rol;

import java.util.Arrays;
import java.util.Scanner;

import ud5.rol.Personaje.Raza;

public class AppCreaPersonaje {
    public static void main(String[] args) throws Exception {
        System.out.println("JUEGO DE ROL: Creación de Personaje");

        Personaje p = Util.importarJson();
        if (p != null) {
            System.out.println("Personaje cargado actualmente:");
            p.mostrar();
            // Quieres sobreescribirlo?
        } else {
            p = crearPersonaje();
        }

        // Mostrar el personaje
        p.mostrar();
        System.out.println(p);
        // Opcional: guardar en fichero de texto JSON.        
        Util.exportarJson(p);
       

        // Personaje aragorn = new Personaje("Aragorn", "fassadad", 98, 87, 67,15,
        // 15785, 150);

    }

    static Personaje crearPersonaje() {
        String nombre = null;
        Raza raza = null;
        int nivel = 0, exp = 0, fuerza = 0, agilidad = 0, constitucion = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cómo quieres crear el personaje? ");
        System.out.println("1.- Indicar sólo el nombre");
        System.out.println("2.- Indicar el nombre y la raza");
        System.out.println("3.- Indicar el nombre, la raza y los atributos físicos");
        System.out.println("4.- Indicar todos los atributos");
        int opcion = sc.nextInt();
        sc.nextLine(); // captura el [ENTER] de la entrada anterior

        int puntosVida = -1;

        // switch para solicitar los atributos
        switch (opcion) {
            case 4:
                System.out.print("Nivel: ");
                nivel = sc.nextInt();
                System.out.print("Experiencia: ");
                exp = sc.nextInt();
                System.out.print("Puntos de vida: ");
                puntosVida = sc.nextInt();
            case 3:
                System.out.print("Fuerza: ");
                fuerza = sc.nextInt();
                System.out.print("Agilidad: ");
                agilidad = sc.nextInt();
                System.out.print("Constitución: ");
                constitucion = sc.nextInt();
                if (puntosVida == -1) {
                    puntosVida = constitucion + Personaje.PUNTOS_VIDA_BASE;
                }
            case 2:
                try {
                    System.out.println("Raza: ");
                    raza = Raza.valueOf(sc.nextLine().toUpperCase());

                } catch (Exception e) {
                    System.out.println(
                            "Error!! La raza debe ser una de las siguientes: " + Arrays.toString(Raza.values()));

                }
            case 1:
                System.out.println("Nombre: ");
                nombre = sc.nextLine();
        }
        sc.close();

        // switch para crear el personaje
        Personaje p = null;
        switch (opcion) {
            case 1:
                p = new Personaje(nombre);
                break;
            case 2:
                p = new Personaje(nombre, raza);
                break;
            case 3:
                p = new Personaje(nombre, raza, fuerza, agilidad, constitucion);
                break;
            case 4:
                p = new Personaje(nombre, raza, fuerza, agilidad, constitucion, nivel, exp, puntosVida);
                break;
        }
        return p;
    }
}
