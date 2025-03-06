package ud5.rol;

import java.util.ArrayList;
import java.util.List;

public class PersonajeEx extends Personaje {
    private int monedas;
    private List<Item> inventario;
    private Item itemManoIzq;
    private Item itemManoDch;
    private Armadura armaduraCabeza;
    private Armadura armaduraCuerpo;

    public PersonajeEx(String nombre, int constitucion) {
        super(nombre, constitucion);
        this.monedas = 0;
        this.inventario = new ArrayList<>();
        this.itemManoIzq = null;
        this.itemManoDch = null;
        this.armaduraCabeza = null;
        this.armaduraCuerpo = null;
    }

    public boolean equipar(Item item) {
        if (item instanceof Arma) {
            Arma arma = (Arma) item;
            if (arma.isDosManos()) {

                if (itemManoIzq == null && itemManoDch == null) {
                    itemManoIzq = item;
                    itemManoDch = item;
                    return true;
                }
            } else {

                if (itemManoIzq == null) {
                    itemManoIzq = item;
                    return true;
                } else if (itemManoDch == null) {
                    itemManoDch = item;
                    return true;
                }
            }
        } else if (item instanceof Armadura) {
            Armadura armadura = (Armadura) item;
            if (armadura.getTipo() == Armadura.Tipo.YELMO) {

                if (armaduraCabeza == null) {
                    armaduraCabeza = armadura;
                    return true;
                }
            } else if (armadura.getTipo() == Armadura.Tipo.ARMADURA) {

                if (armaduraCuerpo == null) {
                    armaduraCuerpo = armadura;
                    return true;
                }
            } else if (armadura.getTipo() == Armadura.Tipo.ESCUDO) {

                if (itemManoIzq == null) {
                    itemManoIzq = armadura;
                    return true;
                } else if (itemManoDch == null) {
                    itemManoDch = armadura;
                    return true;
                }
            }
        }
        return false;
    }


    public void mostrarEquipo() {
        System.out.println("Equipo de combate de " + getNombre() + ":");

        if (armaduraCabeza != null) {
            System.out.println("- " + armaduraCabeza);
        }
        if (armaduraCuerpo != null) {
            System.out.println("- " + armaduraCuerpo);
        }
        if (itemManoIzq != null) {
            System.out.println("- " + itemManoIzq);
        }
        if (itemManoDch != null) {
            System.out.println("- " + itemManoDch);
        }
    }


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

    public double getCargaMaxima() {
        return 50 + (getConstitucion() * 2);
    }

    public boolean addToInventario(Item item) {
        double cargaTotal = inventario.stream().mapToDouble(Item::getPeso).sum();
        if (cargaTotal + item.getPeso() <= getCargaMaxima()) {
            inventario.add(item);
            return true;
        }
        return false;
    }

    public double getCargaTotal() {
        return inventario.stream().mapToDouble(Item::getPeso).sum();
    }
}
