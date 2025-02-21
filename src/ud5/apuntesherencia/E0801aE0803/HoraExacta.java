package ud5.apuntesherencia.E0801aE0803;

public class HoraExacta extends Hora{
    byte segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (!setSegundo(segundo)) {
            throw new IllegalArgumentException("El segundo debe estar entre 0 y 60");
        }
    }

    boolean setSegundo(int valor) {
        if (valor >= 0 && valor < 60) {
            segundo = (byte)valor;
            return true;
        } else
            return false;
    }
    
    
    void inc(){
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            super.inc();
        }
    }


    @Override
    public String toString() {
        return String.format ("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public static void main(String[] args) {
        HoraExacta h = new HoraExacta(8,10,0);
        
    }

    public byte getSegundo() {
        return segundo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return hora == that.hora && minuto == that.minuto && segundo == that.segundo;
    }
    
}

