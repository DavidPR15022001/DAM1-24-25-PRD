package ud5.rol;

import java.util.ArrayList;
import java.util.List;

public class PersonajeEx extends Personaje {
    private int monedas;
    private List<Item> inventario;

    // Constructor
    public PersonajeEx(String nombre, int constitucion) {
        super(nombre, constitucion);
        this.monedas = 0;
        this.inventario = new ArrayList<>();
    }

    // Getters y setters
    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public List<Item> getInventario() {
        return inventario;
    }

    public void setInventario(List<Item> inventario) {
        this.inventario = inventario;
    }

    // Método para obtener la carga máxima que puede transportar
    public double getCargaMaxima() {
        return 50 + (getConstitucion() * 2);
    }

    // Método para añadir un item al inventario
    public boolean addToInventario(Item item) {
        double cargaTotal = inventario.stream().mapToDouble(Item::getPeso).sum();
        if (cargaTotal + item.getPeso() <= getCargaMaxima()) {
            inventario.add(item);
            return true;
        }
        return false;
    }

    // Método para calcular la carga total del inventario
    public double getCargaTotal() {
        return inventario.stream().mapToDouble(Item::getPeso).sum();
    }
}

