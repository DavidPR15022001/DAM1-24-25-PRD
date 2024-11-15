package ud2.ejerciciosbucles;

public class NumerosEnTexto {
    public static void main(String[] args) {
        System.out.println(numeroATexto(26));
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + " - " + numeroATexto(i));
        }
    }

    private static String numeroATexto(int i) {
        if (i < 1 || i > 99)
            return "";

        String numeroATexto = "";

        int decenas = i / 10; // Obtengo las decenas: entre 0 y 9
        int unidades = i % 10;
        
        switch (decenas) {
            case 0: numeroATexto = numero1CifraATexto(i); break;
            case 1: 
                switch (i) {
                    case 10: numeroATexto = "diez"; break;
                    case 11: numeroATexto = "once"; break;
                    case 12: numeroATexto = "doce"; break;
                    case 13: numeroATexto = "trece"; break;
                    case 14: numeroATexto = "catorce"; break;
                    case 15: numeroATexto = "quince"; break;
                    case 16, 17, 18, 19: numeroATexto = "dieci" + numero1CifraATexto(unidades); break;                   
                } 
                break;
            case 2: 
                if (unidades == 0)
                    numeroATexto = "veinte";
                else
                    numeroATexto = "veinti" + numero1CifraATexto(unidades);
                break;
            case 3: numeroATexto = "treinta"; break;
            case 4: numeroATexto = "cuarenta"; break;
            case 5: numeroATexto = "cincuenta"; break;
            case 6: numeroATexto = "sesenta"; break;
            case 7: numeroATexto = "setenta"; break;
            case 8: numeroATexto = "ochenta"; break;
            case 9: numeroATexto = "noventa"; break;
            default:
                break;
        }
        if (decenas >= 3 && decenas <= 9)
            if (unidades != 0)
                numeroATexto += " y " + numero1CifraATexto(unidades);

        return numeroATexto;
    }

    
    public static String numero1CifraATexto(int i) {
        String strUnidades = "";
        switch(i) {
            case 1: strUnidades = "uno"; break;
            case 2: strUnidades = "dos"; break;
            case 3: strUnidades = "tres"; break;
            case 4: strUnidades = "cuatro"; break;
            case 5: strUnidades = "cinco"; break;
            case 6: strUnidades = "seis"; break;
            case 7: strUnidades = "siete"; break;
            case 8: strUnidades = "ocho"; break;
            case 9: strUnidades = "nueve"; break;            
        }
        return strUnidades;                    
    }
}
