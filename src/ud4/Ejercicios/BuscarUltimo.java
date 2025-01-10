package ud4.ejercicios;

public class BuscarUltimo {
    /**
     * 
     * @param t
     * @param clave
     * @return
     */
    static int buscarUltimo(int t[], int clave) {
        for(int i = t.length - 1; i >= 0; i--)
            if (t[i] == clave)
                return i;
        return -1;
    }
}
