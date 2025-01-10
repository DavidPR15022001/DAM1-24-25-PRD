package ud4.ejercicios;

public class BuscarDesde {
    /**
     * 
     * @param t
     * @param clave
     * @return
     */
    static int buscarDesde(int t[], int clave, int pos) {
        for(int i = pos; i < t.length; i++)
            if (t[i] == clave)
                return i;
        return -1;
    } 
}
