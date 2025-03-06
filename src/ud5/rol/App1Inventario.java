package ud5.rol;

public class App1Inventario {
    public static void main(String[] args) {

        Item cotaDeMalla = new Item("Cota de Malla", 10.0, 2000);
        Item espadaLarga = new Item("Espada larga", 3.0, 10000);
        Item espadonADosManos = new Item("Espadón a dos manos", 5.0, 1000);
        Item pan = new Item("Pan", 1.0, 1);
        Item agua = new Item("Agua", 2.0, 1);
        Item daga = new Item("Daga", 0.5, 200);
        Item antorcha = new Item("Antorcha", 0.75, 10);

        PersonajeEx arturo = new PersonajeEx("Arturo", 5);

        arturo.addToInventario(cotaDeMalla);
        arturo.addToInventario(espadaLarga);
        arturo.addToInventario(espadonADosManos);
        arturo.addToInventario(pan);
        arturo.addToInventario(agua);
        arturo.addToInventario(daga);
        arturo.addToInventario(antorcha);

        System.out.println("1. Inventario de personaje");
        System.out.println("===========================");
        System.out.println("\nInventario de " + arturo.getNombre() + ":");
        int index = 1;
        for (Item item : arturo.getInventario()) {
            System.out.println(index++ + ". " + item);
        }

        System.out.println("\nCarga total transportada: " + arturo.getCargaTotal() + "/" + arturo.getCargaMaxima() + " kilos");
    }
}

