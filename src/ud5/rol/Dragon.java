package ud5.rol;

import java.util.Random;

public class Dragon extends Monstruo {
    public Dragon() {
        super();
        Random rnd = new Random();
        this.ataque = rnd.nextInt(101) + 100;
        this.defensa = rnd.nextInt(41) + 60;
        this.velocidad = rnd.nextInt(41) + 80;
        this.puntosVida = rnd.nextInt(131) + 120;
        this.nombre = "Dragon";
    }
}