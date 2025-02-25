package ud5.rol;

import java.util.Random;

public class Troll extends Monstruo {
    public Troll() {
        super();
        Random rnd = new Random();
        this.ataque = rnd.nextInt(61) + 60;
        this.defensa = rnd.nextInt(21) + 50;
        this.velocidad = rnd.nextInt(21) + 20;
        this.puntosVida = rnd.nextInt(101) + 100;
        this.nombre = "Troll";
    }
}