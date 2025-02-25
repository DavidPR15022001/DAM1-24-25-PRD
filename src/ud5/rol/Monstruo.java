package ud5.rol;

import java.util.Random;

public class Monstruo {
    protected String nombre;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int puntosVida;

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public void perderVida(int dano) {
        this.puntosVida -= dano;
    }

    public int atacar(Monstruo m) {
        Random rnd = new Random();
        int dano = Math.max(0, ataque - m.defensa + rnd.nextInt(10));
        System.out.println(this.nombre + " ataca a " + m.getClass().getSimpleName() + " y le hace " + dano + " de daño.");
        m.perderVida(dano);
        return dano;
    }

    public void mostrar() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return (nombre != null ? nombre : getClass().getSimpleName()) + " (" + puntosVida + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPuntosVida() {
        return puntosVida;
    }
}
