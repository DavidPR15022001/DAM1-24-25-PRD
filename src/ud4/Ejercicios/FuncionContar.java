package ud4.ejercicios;

public class FuncionContar {
    static int contar(int t[], int clave) {
        int contar = 0;

        for (int i = 0; i < t.length; i++)
            if (t[i] == clave)
                contar++;

        return contar;
    }   
}
