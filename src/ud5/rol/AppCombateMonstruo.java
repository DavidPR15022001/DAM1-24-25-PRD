package ud5.rol;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class AppCombateMonstruo {

    public static void main(String[] args) {
        
        List<Personaje> personajes = leerPersonajesDesdeJSON();
        List<Monstruo> monstruos = leerMonstruosDesdeJSON();
        
        if (personajes.isEmpty() || monstruos.isEmpty()) {
            System.out.println("No hay personajes o monstruos disponibles para el combate.");
            return;
        }

        Personaje personaje = seleccionarPersonajeAleatorio(personajes);
        Monstruo monstruo = seleccionarMonstruoAleatorio(monstruos);

        System.out.println("Combate iniciado entre " + personaje.getNombre() + " y " + monstruo.getNombre() + ":");
        
        while (personaje.estaVivo() && monstruo.estaVivo()) {

            personaje.atacar(monstruo);

            if (!monstruo.estaVivo()) {
                System.out.println(monstruo.getNombre() + " ha sido derrotado.");
                break;
            }

            monstruo.atacar(personaje);

            if (!personaje.estaVivo()) {
                System.out.println(personaje.getNombre() + " ha sido derrotado.");
                break;
            }
        }

        if (personaje.estaVivo()) {
            System.out.println(personaje.getNombre() + " ha ganado el combate!");
        } else {
            System.out.println(monstruo.getNombre() + " ha ganado el combate!");
        }
    }

    public static List<Personaje> leerPersonajesDesdeJSON() {
        try (FileReader reader = new FileReader("personajes.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Personaje>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Monstruo> leerMonstruosDesdeJSON() {
        try (FileReader reader = new FileReader("monstruos.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Monstruo>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Personaje seleccionarPersonajeAleatorio(List<Personaje> personajes) {
        Random rnd = new Random();
        return personajes.get(rnd.nextInt(personajes.size()));
    }

    public static Monstruo seleccionarMonstruoAleatorio(List<Monstruo> monstruos) {
        Random rnd = new Random();
        return monstruos.get(rnd.nextInt(monstruos.size()));
    }
}
