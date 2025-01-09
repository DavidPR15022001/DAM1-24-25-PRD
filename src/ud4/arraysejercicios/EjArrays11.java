package ud4.arraysejercicios;

import java.util.Scanner;

public class EjArrays11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[3][3];
        char jugadorActual = 'X';
        boolean victoria = false;

        iniciarTablero(tablero);

        System.out.println("¡Bienvenidos al Tres en Raya!");

        while (!victoria && !tableroLleno(tablero)) {
            mostrarTablero(tablero);
            System.out.println("Turno del jugador " + jugadorActual);
            leerMovimiento(tablero, jugadorActual, scanner);

            if (comprobarVictoria(tablero, jugadorActual)) {
                victoria = true;
                mostrarTablero(tablero);
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
            } else {
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }

        if (!victoria) {
            mostrarTablero(tablero);
            System.out.println("¡Es un empate!");
        }

        scanner.close();
    }

    private static void iniciarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero(char[][] tablero) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    private static void leerMovimiento(char[][] tablero, char jugador, Scanner scanner) {
        boolean movimientoValido = false;

        while (!movimientoValido) {
            System.out.print("Introduce la fila: ");
            int fila = scanner.nextInt();
            System.out.print("Introduce la columna: ");
            int columna = scanner.nextInt();

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugador;
                movimientoValido = true;
            } else {
                System.out.println("Movimiento no válido, intenta de nuevo.");
            }
        }
    }

    private static boolean comprobarVictoria(char[][] tablero, char jugador) {
        // Comprobar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        // Comprobar diagonales
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }

        return false;
    }

    private static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

