package ud4.arraysejercicios;

public class EjArrays13 {

    public static void main(String[] args) {
    }

    /**
     * Determina si una matriz cuadrada es diagonal.
     * @param t La matriz cuadrada a verificar.
     * @return true si la matriz es diagonal, false en caso contrario.
     */
    public static boolean esDiagonal(int[][] t) {
        int filas = t.length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < t[i].length; j++) {
                // Verificar elementos fuera de la diagonal principal
                if (i != j && t[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
