package ud5.rol;

public class Armadura extends Item {
    private int defensa;
    private Tipo tipo;

    public enum Tipo {
        YELMO,
        ARMADURA,
        ESCUDO
    }

    public Armadura(String nombre, double peso, int precio, int defensa, Tipo tipo) {
        super(nombre, peso, precio);
        this.defensa = defensa;
        this.tipo = tipo;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " (+ " + defensa + " defensa)";
    }
}

