package ud5.mulleres;

class Sindicalista extends MullerTraballadora implements IActivista {
    private String movementoDefendido;

    public Sindicalista(String nome, String apelidos, int anoNacemento, String movementoDefendido) {
        super(nome, apelidos, anoNacemento);
        this.movementoDefendido = movementoDefendido;
    }

    @Override
    public String descricionContribucion() {
        return nome + " " + apelidos + " destacou como sindicalista defendendo: " + movementoDefendido;
    }

    @Override
    public String getCausaDefendida() {
        return movementoDefendido;
    }
}

