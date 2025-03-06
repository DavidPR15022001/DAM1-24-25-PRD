package ud5.rol;

public class Item {
    private String nombre;
    private double peso;
    private int precio;

    // Constructor
    public Item(String nombre, double peso, int precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Redefinición del método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Double.compare(item.peso, peso) == 0 &&
                precio == item.precio &&
                nombre.equals(item.nombre);
    }

    // Método toString para imprimir el Item de manera legible
    @Override
    public String toString() {
        return nombre + ", peso: " + peso + " kilos, precio: " + precio + " monedas";
    }
}
