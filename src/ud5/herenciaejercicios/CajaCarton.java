package ud5.herenciaejercicios;
public class CajaCarton extends Caja {

    // Constructor de CajaCarton: No recibe la unidad, siempre usamos CM.
    public CajaCarton(int ancho, int alto, int fondo) {
        // Llamamos al constructor de la clase base, siempre usando Unidad.CM
        super(ancho, alto, fondo, Unidad.CM);
    }

    // Sobreescribimos el método getVolumen para calcular el volumen del cartón (80% del volumen real)
    @Override
    public double getVolumen() {
        // Obtenemos el volumen real (en centímetros) de la clase base
        double volumenReal = super.getVolumen(); 
        
        // El volumen útil es el 80% del volumen real
        return volumenReal * 0.8;
    }

    // Método que calcula la superficie total de cartón utilizada para la caja
    public double getSuperficie() {
        // Calculamos la superficie total de la caja en centímetros cuadrados
        double superficie = 2 * (getAncho() * getFondo() + getAncho() * getAlto() + getFondo() * getAlto());
        return superficie;  // La superficie está en centímetros cuadrados
    }

    // Método toString para obtener una representación de la caja de cartón
    @Override
    public String toString() {
        return "CajaCarton [Ancho=" + getAncho() + ", Alto=" + getAlto() + ", Fondo=" + getFondo() 
                + ", Volumen=" + getVolumen() + " m³, Superficie=" + getSuperficie() + " cm², Etiqueta=" + getEtiqueta() + "]";
    }
}
