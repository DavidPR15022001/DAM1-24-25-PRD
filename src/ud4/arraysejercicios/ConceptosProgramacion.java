package ud4.arraysejercicios;

public class ConceptosProgramacion {

    public static void main(String[] args) {

        String conceptos[] = { "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto"
        };

        for (int i = 0; i < 100; i++) {
            System.out.println(fraseAleatoria(conceptos));
        }
    }

    static String fraseAleatoria(String[] t) {
        return (t[(int) (Math.random() * t.length)]);
    }

}
