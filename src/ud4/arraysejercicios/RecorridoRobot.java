package ud4.arraysejercicios;

public class RecorridoRobot {
    public static void main(String[] args) {
        String[] mapa = {
                "  Z       ",
                " *        ",
                "  *  *    ",
                "          ",
                " A        "
        };
        System.out.println(recorridoRobot(mapa, "AALARAARAA"));
        System.out.println(recorridoRobot(mapa, "RAALAAAALA"));
        System.out.println(recorridoRobot(mapa, "ARALA"));
        System.out.println(recorridoRobot(mapa, "LAA"));
    }

    static boolean recorridoRobot(String[] mapa, String instrucciones) {
        int orientacion = 0; // 0=arriba, 1=derecha, 2=abajo, 3=izquierda
        int filaRobot = 0, colRobot = 0;

        // buscarSalida
        for (int i = 0; i < mapa.length; i++)
            if (mapa[i].indexOf('A') != -1) {
                filaRobot = i;
                colRobot = mapa[i].indexOf('A');
            }

        for (int i = 0; i < instrucciones.length(); i++) {
            switch(instrucciones.charAt(i)) {
                case 'A':
                    switch (orientacion) {
                        case 0:
                            if (filaRobot == 0)
                                return false; // Se sale del mapa por arriba
                            filaRobot--; break;
                        case 1:
                            if (colRobot == mapa[0].length() - 1)
                            return false; // Se sale del mapa por la derecha
                            colRobot++; break;
                        case 2:
                            if(filaRobot == mapa.length - 1)
                                return false; // Se sale del mapa por abajo
                            filaRobot++; break;
                        case 3:
                            if(colRobot == 0)
                                return false; // Se sale del mapa por la izquierda
                            colRobot--; break;
                    }

                    if (mapa[filaRobot].charAt(colRobot) == '*')
                        return false; // Pisó una mina

                    break; // Avanzar
                case 'R': orientacion = orientacion == 3 ? 0 : orientacion + 1; break;// Giro a la derecha
                case 'L': orientacion = orientacion == 0 ? 3 : orientacion - 1; break; // Giro a la izquierda
            }
        }

        if (mapa[filaRobot].charAt(colRobot) == 'Z')
            return true;
        else
            return false;
    }
}
