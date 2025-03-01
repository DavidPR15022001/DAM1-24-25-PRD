package ud5.rol;

import java.util.Random;

public class AppCombateSingular {
    public static void main(String[] args) {

        Personaje p1 = new Personaje("Aragorn", Personaje.Raza.HUMANO, 90, 80, 85, 70, 60, 75, 5, 1500);
        Personaje p2 = new Personaje("Legolas", Personaje.Raza.ELFO, 85, 95, 70, 80, 90, 85);


        System.out.println("Antes del combate:");
        p1.mostrar();
        System.out.println(p1);
        p2.mostrar();
        System.out.println(p2);


        combate(p1, p2);
    }

    public static void combate(Personaje p1, Personaje p2) {
        Random rnd = new Random();
        Personaje atacante = (p1.getAgilidad() > p2.getAgilidad()) ? p1 : p2;
        Personaje defensor = (atacante == p1) ? p2 : p1;

        System.out.println("\n¡Comienza el combate!");


        while (p1.estaVivo() && p2.estaVivo()) {
            int daño = atacante.atacar(defensor);
            System.out.println(atacante.getNombre() + "(" + atacante.getPuntosDeVida() + ") ataca a " + defensor.getNombre() + "(" + defensor.getPuntosDeVida() + ")");
            if (daño > 0) {
                System.out.println("¡El ataque tuvo éxito! " + defensor.getNombre() + " ha recibido " + daño + " puntos de daño.");
                if (!defensor.estaVivo()) {
                    System.out.println(defensor.getNombre() + " ha muerto.");
                    break;
                }
            } else {
                System.out.println("El ataque falló.");
            }


            Personaje temp = atacante;
            atacante = defensor;
            defensor = temp;


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("\n¡El combate ha terminado!");
        System.out.println("\nEstado final:");
        p1.mostrar();
        System.out.println(p1);
        p2.mostrar();
        System.out.println(p2);
    }
}
