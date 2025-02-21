package ud5.apuntesherencia.E0801aE0803;

public class Hora {
    byte hora;
    byte minuto;

    public Hora(int hora, int minuto) {
        if (!setHora(hora)){
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        this.hora = (byte)hora;
        if (!setMinuto(minuto)){
            throw new IllegalArgumentException("El minuto debe estar entre 0 y 59");
        }
        this.minuto = (byte)minuto;
    }

    void inc() {
        minuto ++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    boolean setMinuto(int valor) {
        if (valor >= 0 && valor < 60) {
            minuto = (byte)valor;
            return true;
        } else
            return false;
    }

    boolean setHora(int valor) {
        if (valor >= 0 && valor < 23) {
            minuto = (byte)valor;
            return true;
        } else
            return false;
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d", hora, minuto);
    }

    public static void main(String[] args) {
        Hora hora = new Hora(8, 10);
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        hora.setMinuto(59);
        System.out.println(hora);
    }
}
