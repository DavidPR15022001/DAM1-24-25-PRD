package ud5.rol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.*;

public class AppCombateGrupos {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String FICHERO_JSON = "personajes.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        List<Personaje> personajes = cargarPersonajes();


        if (personajes.size() < 6) {
            System.out.println("No hay suficientes personajes para formar dos grupos.");
            return;
        }


        List<Personaje> grupo1 = elegirPersonajes("Primer grupo (3-6 personajes):", personajes);
        List<Personaje> grupo2 = elegirPersonajes("Segundo grupo (3-6 personajes):", personajes);


        combateGrupal(grupo1, grupo2);
    }


    private static List<Personaje> cargarPersonajes() {
        File archivo = new File(FICHERO_JSON);
        if (archivo.exists() && archivo.isFile()) {
            try (Reader reader = new FileReader(archivo)) {
                Personaje[] personajesArray = gson.fromJson(reader, Personaje[].class);
                return new ArrayList<>(Arrays.asList(personajesArray));
            } catch (IOException e) {
                System.out.println("Error al cargar personajes: " + e.getMessage());
            }
        }
        return new ArrayList<>();
    }


    private static List<Personaje> elegirPersonajes(String mensaje, List<Personaje> personajes) {
        List<Personaje> grupo = new ArrayList<>();
        System.out.println(mensaje);
        while (grupo.size() < 3 || grupo.size() > 6) {
            System.out.println("Elija entre 3 y 6 personajes para el grupo:");
            for (int i = 0; i < personajes.size(); i++) {
                System.out.println((i + 1) + ". " + personajes.get(i).getNombre());
            }
            System.out.print("Ingrese los números de los personajes (separados por coma): ");
            String input = scanner.nextLine();
            String[] indices = input.split(",");
            grupo.clear();

            for (String indice : indices) {
                try {
                    int index = Integer.parseInt(indice.trim()) - 1;
                    if (index >= 0 && index < personajes.size() && !grupo.contains(personajes.get(index))) {
                        grupo.add(personajes.get(index));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida.");
                }
            }

            if (grupo.size() < 3 || grupo.size() > 6) {
                System.out.println("Debe elegir entre 3 y 6 personajes.");
            }
        }
        return grupo;
    }


    private static void combateGrupal(List<Personaje> grupo1, List<Personaje> grupo2) {
        System.out.println("\n¡Comienza el combate entre los dos grupos!");


        while (!grupo1.isEmpty() && !grupo2.isEmpty()) {

            grupo1.sort(Comparator.comparingInt(Personaje::getAgilidad).reversed());
            grupo2.sort(Comparator.comparingInt(Personaje::getAgilidad).reversed());


            for (int i = 0; i < grupo1.size(); i++) {
                if (!grupo1.get(i).estaVivo()) continue;

                Personaje atacante = grupo1.get(i);
                Personaje defensor = elegirDefensor(grupo2);

                if (defensor != null) {
                    int daño = atacante.atacar(defensor);
                    System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " con " + daño + " de daño.");

                    if (!defensor.estaVivo()) {
                        System.out.println(defensor.getNombre() + " ha muerto.");
                        grupo2.remove(defensor);
                    }
                }
            }


            if (grupo2.isEmpty()) {
                System.out.println("¡El Grupo 1 ha ganado!");
                break;
            }


            for (int i = 0; i < grupo2.size(); i++) {
                if (!grupo2.get(i).estaVivo()) continue;

                Personaje atacante = grupo2.get(i);
                Personaje defensor = elegirDefensor(grupo1);

                if (defensor != null) {
                    int daño = atacante.atacar(defensor);
                    System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " con " + daño + " de daño.");

                    if (!defensor.estaVivo()) {
                        System.out.println(defensor.getNombre() + " ha muerto.");
                        grupo1.remove(defensor);
                    }
                }
            }


            if (grupo1.isEmpty()) {
                System.out.println("¡El Grupo 2 ha ganado!");
                break;
            }
        }
    }


    private static Personaje elegirDefensor(List<Personaje> grupo) {
        for (Personaje p : grupo) {
            if (p.estaVivo()) {
                return p;
            }
        }
        return null;
    }
}
