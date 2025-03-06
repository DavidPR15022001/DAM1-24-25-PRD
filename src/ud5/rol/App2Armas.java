package ud5.rol;

public class App2Armas {
    public static void main(String[] args) {

        Arma espadaLarga = new Arma("Espada larga", 3.0, 10000, 60, false);
        Arma espadonADosManos = new Arma("Espadón a dos manos", 5.0, 1000, 50, true);
        Armadura yelmoHierro = new Armadura("Yelmo de hierro", 2.0, 500, 5, Armadura.Tipo.YELMO);
        Armadura coraza = new Armadura("Coraza", 7.0, 3000, 30, Armadura.Tipo.ARMADURA);
        Armadura escudoMadera = new Armadura("Escudo de madera", 4.0, 800, 10, Armadura.Tipo.ESCUDO);

        PersonajeEx valkiria = new PersonajeEx("Valkiria", 10);
        PersonajeEx arturo = new PersonajeEx("Arturo", 8);

        valkiria.equipar(yelmoHierro);
        valkiria.equipar(coraza);
        valkiria.equipar(espadaLarga);
        valkiria.equipar(escudoMadera);

        arturo.equipar(yelmoHierro);
        arturo.equipar(coraza);
        arturo.equipar(espadonADosManos);

        System.out.println("2. Armas y Armaduras");
        System.out.println("=====================");
        valkiria.mostrarEquipo();
        System.out.println();
        arturo.mostrarEquipo();
    }
}

