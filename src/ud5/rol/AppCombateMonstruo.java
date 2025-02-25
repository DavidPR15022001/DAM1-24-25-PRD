package ud5.rol;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class AppCombateMonstruo {

    public static void main(String[] args) {
        // Leer los personajes y monstruos desde los archivos JSON
        List<Personaje> personajes = leerPersonajesDesdeJSON();
        List<Monstruo> monstruos = leerMonstruosDesdeJSON();
        
        // Si no hay personajes o monstruos, no continuar
        if (personajes.isEmpty() || monstruos.isEmpty()) {
            System.out.println("No hay personajes o monstruos disponibles para el combate.");
            return;
        }

        // Seleccionar un personaje y un monstruo aleatorio
        Personaje personaje = seleccionarPersonajeAleatorio(personajes);
        Monstruo monstruo = seleccionarMonstruoAleatorio(monstruos);

        // Mostrar el inicio del combate
        System.out.println("Combate iniciado entre " + personaje.getNombre() + " y " + monstruo.getNombre() + ":");
        
        // Combatir hasta que uno de los dos caiga
        while (personaje.estaVivo() && monstruo.estaVivo()) {
            // El personaje ataca al monstruo
            personaje.atacar(monstruo);
            // Verificar si el monstruo sigue vivo
            if (!monstruo.estaVivo()) {
                System.out.println(monstruo.getNombre() + " ha sido derrotado.");
                break;
            }

            // El monstruo ataca al personaje
            monstruo.atacar(personaje);
            // Verificar si el personaje sigue vivo
            if (!personaje.estaVivo()) {
                System.out.println(personaje.getNombre() + " ha sido derrotado.");
                break;
            }
        }

        // Mostrar el resultado final
        if (personaje.estaVivo()) {
            System.out.println(personaje.getNombre() + " ha ganado el combate!");
        } else {
            System.out.println(monstruo.getNombre() + " ha ganado el combate!");
        }
    }

    // Método para leer los personajes desde un archivo JSON
    public static List<Personaje> leerPersonajesDesdeJSON() {
        try (FileReader reader = new FileReader("personajes.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Personaje>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para leer los monstruos desde un archivo JSON
    public static List<Monstruo> leerMonstruosDesdeJSON() {
        try (FileReader reader = new FileReader("monstruos.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Monstruo>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para seleccionar un personaje aleatorio
    public static Personaje seleccionarPersonajeAleatorio(List<Personaje> personajes) {
        Random rnd = new Random();
        return personajes.get(rnd.nextInt(personajes.size()));
    }

    // Método para seleccionar un monstruo aleatorio
    public static Monstruo seleccionarMonstruoAleatorio(List<Monstruo> monstruos) {
        Random rnd = new Random();
        return monstruos.get(rnd.nextInt(monstruos.size()));
    }
}
