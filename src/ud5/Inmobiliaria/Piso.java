package ud5.Inmobiliaria;

public class Piso extends Inmueble {
    private int planta;

    public Piso(String direccion, int metrosCuadrados, int habitaciones, int baños, int planta) {
        super(direccion, metrosCuadrados, habitaciones, baños);
        this.planta = planta;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    @Override
    public String detalle() {
        String detalle = "Piso en " + getDireccion() + ".\n" +
                getMetrosCuadrados() + " m2, " + getHabitaciones() + " hab, " +
                getBaños() + " baños, " + planta + "ª planta.";

        if (getPrecioAlquiler() > 0) {
            detalle += "\nPrecio de Alquiler: " + getPrecioAlquiler() + " €";
        }
        if (getPrecioVenta() > 0) {
            detalle += "\nPrecio de Venta: " + getPrecioVenta() + " €";
        }

        return detalle;
    }
}
