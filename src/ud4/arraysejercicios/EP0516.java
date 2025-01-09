package ud4.arraysejercicios;

public class EP0516 {

    // Función que determina si es posible viajar desde el lugar X al lugar Y
    public static boolean esPosibleViajar(boolean[][] mapa, int lugarInicio, int lugarDestino) {
        // Creamos un array para marcar los lugares ya visitados
        boolean[] visitados = new boolean[mapa.length];
        
        // Llamamos a la función recursiva para verificar la posibilidad de viajar
        return viajar(mapa, lugarInicio, lugarDestino, visitados);
    }

    // Función recursiva para explorar todos los lugares conectados
    private static boolean viajar(boolean[][] mapa, int lugarActual, int lugarDestino, boolean[] visitados) {
        // Si ya hemos visitado este lugar, lo devolvemos como falso
        if (visitados[lugarActual]) {
            return false;
        }

        // Marcamos el lugar como visitado
        visitados[lugarActual] = true;

        // Si el lugar actual es el destino, hemos encontrado un camino
        if (lugarActual == lugarDestino) {
            return true;
        }

        // Recursivamente exploramos los lugares conectados al lugar actual
        for (int i = 0; i < mapa.length; i++) {
            if (mapa[lugarActual][i]) { // Si hay conexión de lugarActual a lugar i
                if (viajar(mapa, i, lugarDestino, visitados)) {
                    return true; // Si encontramos un camino, lo retornamos como verdadero
                }
            }
        }

        // Si no encontramos un camino, devolvemos falso
        return false;
    }

    public static void main(String[] args) {
        // Ejemplo de mapa con lugares conectados
        boolean[][] mapa = {
            {false, true, false, false},  // Lugar 0
            {false, false, true, true},   // Lugar 1
            {false, false, false, true},  // Lugar 2
            {false, false, false, false}  // Lugar 3
        };

        // Ejemplo de uso de la función
        int lugarInicio = 0;
        int lugarDestino = 3;

        if (esPosibleViajar(mapa, lugarInicio, lugarDestino)) {
            System.out.println("Es posible viajar desde el lugar " + lugarInicio + " hasta el lugar " + lugarDestino);
        } else {
            System.out.println("No es posible viajar desde el lugar " + lugarInicio + " hasta el lugar " + lugarDestino);
        }
    }
}
