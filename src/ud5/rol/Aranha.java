package ud5.rol;

import java.util.Random;

public class Aranha extends Monstruo {
    public Aranha() {
        super();
        Random rnd = new Random();
        this.ataque = rnd.nextInt(41) + 10;
        this.defensa = rnd.nextInt(21) + 20;
        this.velocidad = rnd.nextInt(31) + 40;
        this.puntosVida = rnd.nextInt(51) + 30;
        this.nombre = "Aranha";
    }
}