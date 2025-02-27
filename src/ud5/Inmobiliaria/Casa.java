package ud5.Inmobiliaria;

public class Casa extends Inmueble {
    private int terreno;

    public Casa(String direccion, int metrosCuadrados, int habitaciones, int baños, int terreno) {
        super(direccion, metrosCuadrados, habitaciones, baños);
        this.terreno = terreno;
    }

    public int getTerreno() {
        return terreno;
    }

    public void setTerreno(int terreno) {
        this.terreno = terreno;
    }

    @Override
    public String detalle() {
        String detalle = "Casa en " + getDireccion() + ".\n" +
                getMetrosCuadrados() + " m2, " + getHabitaciones() + " hab, " +
                getBaños() + " baños, con terreno de " + terreno + " m2.";

        if (getPrecioAlquiler() > 0) {
            detalle += "\nPrecio de Alquiler: " + getPrecioAlquiler() + " €";
        }
        if (getPrecioVenta() > 0) {
            detalle += "\nPrecio de Venta: " + getPrecioVenta() + " €";
        }

        return detalle;
    }
}
