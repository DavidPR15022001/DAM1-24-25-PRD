package ud5.rol;

import java.util.Random;

public class Orco extends Monstruo {
    public Orco() {
        super();
        Random rnd = new Random();
        this.ataque = rnd.nextInt(51) + 30;
        this.defensa = rnd.nextInt(21) + 30;
        this.velocidad = rnd.nextInt(31) + 30;
        this.puntosVida = rnd.nextInt(71) + 30;
        this.nombre = "Orco";
    }
}