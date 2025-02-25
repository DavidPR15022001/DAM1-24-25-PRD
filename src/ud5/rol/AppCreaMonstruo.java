package ud5.rol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppCreaMonstruo {

    public static void main(String[] args) {
        
        List<Monstruo> monstruos = new ArrayList<>();
        
        monstruos.add(new Orco());
        monstruos.add(new Aranha());
        monstruos.add(new Troll());
        monstruos.add(new Dragon());
        
        guardarMonstruosEnJSON(monstruos);
        
        List<Monstruo> monstruosLeidos = leerMonstruosDesdeJSON();
        
        System.out.println("Monstruos leídos desde el archivo:");
        for (Monstruo m : monstruosLeidos) {
            m.mostrar();
        }
    }

    public static void guardarMonstruosEnJSON(List<Monstruo> monstruos) {
        try (Writer writer = new FileWriter("monstruos.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(monstruos, writer);
            System.out.println("Monstruos guardados en el archivo monstruos.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Monstruo> leerMonstruosDesdeJSON() {
        try (Reader reader = new FileReader("monstruos.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, new TypeToken<List<Monstruo>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
