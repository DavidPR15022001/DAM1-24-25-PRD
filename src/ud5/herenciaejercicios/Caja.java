package ud5.herenciaejercicios;

public class Caja {
    protected double ancho;
    protected double alto;
    protected double fondo;
    protected String etiqueta;
    
    public enum Unidad {
        CM, M
    }

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        if (unidad == Unidad.CM) {
            this.ancho = ancho / 100.0;
            this.alto = alto / 100.0;
            this.fondo = fondo / 100.0;
        } else {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
        }
        this.etiqueta = "";
    }

    public double getVolumen() {
        return ancho * alto * fondo;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        } else {
            this.etiqueta = etiqueta.substring(0, 30);
        }
    }

    @Override
    public String toString() {
        return "Caja [Ancho=" + ancho + " m, Alto=" + alto + " m, Fondo=" + fondo + " m, Volumen=" + getVolumen() + " m³, Etiqueta='" + etiqueta + "']";
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getFondo() {
        return fondo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    
}

