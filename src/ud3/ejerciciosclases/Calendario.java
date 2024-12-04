package ud3.ejerciciosclases;

public class Calendario {
    private int anho, mes, dia;

    public Calendario(int anho, int mes, int dia) {
        if (fechaCorrecta(anho, mes, dia)) {
            this.anho = anho;
            this.mes = mes;
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("La fecha no es correcta");
        }
    }

    public void incrementarDia() {
        dia++;
        if (dia > diasMes(mes, anho)) {
            dia = 1;
            incrementarMes();
        }
    }
            
    public void incrementarMes() {
        mes++;
        if (mes > 12) {
            mes = 1;
            anho++;
        }
    }

    void incrementarAño(int cantidad) {
        anho += cantidad;
    }

    public static int diasMes(int mes, int anho) {
        if (mes < 1 || mes > 12)
            return -1;

        switch (mes) {
            case 2:
                if (esBisiesto(anho))
                    return 29;
                else
                    return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
        

    public static boolean esBisiesto(int anho) {
        return ((anho % 4 == 0) && (anho % 100 != 0) || (anho % 400 == 0));                                          
    }

    public static boolean fechaCorrecta(int anho, int mes, int dia) {
        boolean diaCorrecto, mesCorrecto, anyoCorrecto;
        anyoCorrecto = (anho > 0);
        mesCorrecto = (mes >= 1) && (mes <= 12);
        diaCorrecto = (dia >= 1 && dia <= diasMes(mes, anho));

        return diaCorrecto && mesCorrecto && anyoCorrecto;
    }    
    
}
