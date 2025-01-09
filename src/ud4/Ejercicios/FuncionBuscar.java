package ud4.ejercicios;

public class FuncionBuscar {
    /**
     * 
     * @param t
     * @param clave
     * @return
     */
    static int buscar(int t[], int clave) {
        for(int i = 0; i < t.length; i++)
            if (t[i] == clave)
                return i;
        return -1;
    }
    

} 