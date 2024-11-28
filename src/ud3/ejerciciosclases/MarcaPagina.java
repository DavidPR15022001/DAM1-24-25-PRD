package ud3.ejerciciosclases;

public class MarcaPagina {
    int pagina;
    String libro;

    public void incrementarPagina() {
        pagina++;
    }
    
    public int getPagina() {
        return this.pagina;
    }

    public void reiniciarLibro () {
        pagina = 0;
    }
}
