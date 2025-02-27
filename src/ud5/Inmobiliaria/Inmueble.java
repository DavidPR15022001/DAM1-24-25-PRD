package ud5.Inmobiliaria;

public abstract class Inmueble {
    private String direccion;
    private int metrosCuadrados;
    private int habitaciones;
    private int baños;
    private double precioAlquiler;
    private double precioVenta;

    public Inmueble(String direccion, int metrosCuadrados, int habitaciones, int baños) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.habitaciones = habitaciones;
        this.baños = baños;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String mostrarInfoGeneral() {
        return "Inmueble en " + direccion + " (" + metrosCuadrados + " m2, " + habitaciones + " hab)";
    }

    public abstract String detalle();
}
