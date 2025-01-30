package ud4.stringsapuntes;

public class Matriculas {

    // Método para validar si una matrícula es válida
    public static boolean esMatriculaValida(String matricula) {
        if (matricula == null || matricula.length() != 7) {
            return false;
        }

        // Validar los 4 primeros caracteres sean dígitos
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }

        // Validar las 3 últimas letras
        for (int i = 4; i < 7; i++) {
            char letra = Character.toUpperCase(matricula.charAt(i));
            if (!esLetraValida(letra)) {
                return false;
            }
        }

        return true;
    }

    // Método auxiliar para validar si una letra es válida
    private static boolean esLetraValida(char letra) {
        return letra >= 'B' && letra <= 'Z' && "AEIOUÑQ".indexOf(letra) == -1;
    }

    // Método para obtener la siguiente matrícula
    public static String siguienteMatricula(String matricula) {
        if (!esMatriculaValida(matricula)) {
            throw new IllegalArgumentException("Matrícula inválida");
        }

        String digitos = matricula.substring(0, 4);
        String letras = matricula.substring(4, 7);

        digitos = incrementarDigitos(digitos);

        // Si los dígitos vuelven a 0000, incrementamos las letras
        if (digitos.equals("0000")) {
            letras = incrementarLetras(letras);
        }

        return digitos + letras;
    }

    // Método para incrementar los dígitos
    private static String incrementarDigitos(String digitos) {
        int numero = Integer.parseInt(digitos);
        numero = (numero + 1) % 10000; // Si llega a 9999, vuelve a 0
        return String.format("%04d", numero);
    }

    // Método para incrementar las letras
    private static String incrementarLetras(String letras) {
        char[] chars = letras.toCharArray();

        // Incrementar la letra más a la derecha
        for (int i = 2; i >= 0; i--) {
            chars[i] = siguienteLetra(chars[i]);

            // Si no vuelve a "B", salimos del bucle
            if (chars[i] != 'B') {
                break;
            }
        }

        return new String(chars);
    }

    // Método auxiliar para obtener la siguiente letra válida
    private static char siguienteLetra(char letra) {
        do {
            letra = (char) ((letra == 'Z') ? 'B' : letra + 1);
        } while (!esLetraValida(letra));

        return letra;
    }

    // Método para comparar matrículas
    public static int comparaMatriculas(String m1, String m2) {
        if (!esMatriculaValida(m1) || !esMatriculaValida(m2)) {
            throw new IllegalArgumentException("Una o ambas matrículas son inválidas");
        }

        // Comparar dígitos
        int digitos1 = Integer.parseInt(m1.substring(0, 4));
        int digitos2 = Integer.parseInt(m2.substring(0, 4));

        if (digitos1 != digitos2) {
            return Integer.compare(digitos1, digitos2);
        }

        // Comparar letras
        String letras1 = m1.substring(4, 7);
        String letras2 = m2.substring(4, 7);

        return letras1.compareTo(letras2);
    }

    // Método principal para pruebas
    public static void main(String[] args) {
        // Pruebas de validación
        System.out.println(esMatriculaValida("1234BCD")); // true
        System.out.println(esMatriculaValida("123AÑPQ")); // false
        System.out.println(esMatriculaValida("12345BC")); // false

        // Pruebas de siguiente matrícula
        System.out.println(siguienteMatricula("1234BCD")); // 1235BCD
        System.out.println(siguienteMatricula("9999BCD")); // 0000BCE
        System.out.println(siguienteMatricula("9999ZZZ")); // 0000BBB

        // Pruebas de comparación
        System.out.println(comparaMatriculas("1234BCD", "1234BCD")); // 0
        System.out.println(comparaMatriculas("1234BCD", "1235BCD")); // -1
        System.out.println(comparaMatriculas("1235BCD", "1234BCD")); // 1
    }
}
