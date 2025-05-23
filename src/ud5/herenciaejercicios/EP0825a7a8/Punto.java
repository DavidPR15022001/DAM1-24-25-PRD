package ud5.herenciaejercicios.EP0825a7a8;

public class Punto {
    int x, y;

    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(x-otroPunto.x, 2) + Math.pow(y-otroPunto.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto other = (Punto) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }


}
