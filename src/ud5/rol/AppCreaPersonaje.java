package ud5.rol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppCreaPersonaje {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String FICHERO_JSON = "personajes.json";

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File archivo = new File(FICHERO_JSON);
        Personaje personaje = null;
        boolean ejecutar = true;

        // Cargar personajes guardados si existen
        List<Personaje> personajesGuardados = cargarPersonajes(archivo, gson);

        while (ejecutar) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    // Crear nuevo personaje
                    personaje = crearPersonaje();
                    personajesGuardados.add(personaje); // Añadir personaje a la lista
                    break;
                case 2:
                    // Editar personaje existente
                    if (personajesGuardados.size() > 0) {
                        editarPersonaje(personajesGuardados, gson);
                    } else {
                        System.out.println("No hay personajes guardados.");
                    }
                    break;
                case 3:
                    // Ver personajes
                    verPersonajes(personajesGuardados);
                    break;
                case 4:
                    // Guardar personajes en archivo
                    guardarPersonajes(personajesGuardados, archivo, gson);
                    break;
                case 5:
                    // Salir
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Crear personaje");
        System.out.println("2. Editar personaje");
        System.out.println("3. Ver personajes");
        System.out.println("4. Guardar personajes");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Obtener opción de menú
    private static int obtenerOpcion() {
        int opcion = -1;
        try {
            opcion = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida.");
        }
        return opcion;
    }

    // Crear un personaje
    private static Personaje crearPersonaje() {
        System.out.println("\nCrear un nuevo personaje:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Elija la raza:");
        for (Personaje.Raza raza : Personaje.Raza.values()) {
            System.out.println(raza.ordinal() + 1 + ". " + raza);
        }
        int razaSeleccionada = Integer.parseInt(scanner.nextLine()) - 1;
        Personaje.Raza raza = Personaje.Raza.values()[razaSeleccionada];

        System.out.print("Fuerza: ");
        int fuerza = Integer.parseInt(scanner.nextLine());
        System.out.print("Agilidad: ");
        int agilidad = Integer.parseInt(scanner.nextLine());
        System.out.print("Constitución: ");
        int constitucion = Integer.parseInt(scanner.nextLine());
        System.out.print("Inteligencia: ");
        int inteligencia = Integer.parseInt(scanner.nextLine());
        System.out.print("Intuición: ");
        int intuicion = Integer.parseInt(scanner.nextLine());
        System.out.print("Presencia: ");
        int presencia = Integer.parseInt(scanner.nextLine());

        return new Personaje(nombre, raza, fuerza, agilidad, constitucion, inteligencia, intuicion, presencia);
    }

    // Editar un personaje existente
    private static void editarPersonaje(List<Personaje> personajesGuardados, Gson gson) {
        System.out.println("\nSeleccione el personaje a editar:");
        for (int i = 0; i < personajesGuardados.size(); i++) {
            System.out.println(i + 1 + ". " + personajesGuardados.get(i).getNombre());
        }
        int seleccion = Integer.parseInt(scanner.nextLine()) - 1;
        if (seleccion >= 0 && seleccion < personajesGuardados.size()) {
            Personaje personaje = personajesGuardados.get(seleccion);
            System.out.println("Editando a " + personaje.getNombre());
            System.out.println("1. Cambiar fuerza");
            System.out.println("2. Cambiar agilidad");
            System.out.println("3. Cambiar constitución");
            System.out.println("4. Cambiar inteligencia");
            System.out.println("5. Cambiar intuición");
            System.out.println("6. Cambiar presencia");
            System.out.println("7. Volver");
            System.out.print("Seleccione una opción: ");
            int opcionEdicion = Integer.parseInt(scanner.nextLine());

            switch (opcionEdicion) {
                case 1:
                    System.out.print("Nueva fuerza: ");
                    personaje.setFuerza(Integer.parseInt(scanner.nextLine()));
                    break;
                case 2:
                    System.out.print("Nueva agilidad: ");
                    personaje.setAgilidad(Integer.parseInt(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Nueva constitución: ");
                    personaje.setConstitucion(Integer.parseInt(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Nueva inteligencia: ");
                    personaje.setInteligencia(Integer.parseInt(scanner.nextLine()));
                    break;
                case 5:
                    System.out.print("Nueva intuición: ");
                    personaje.setIntuicion(Integer.parseInt(scanner.nextLine()));
                    break;
                case 6:
                    System.out.print("Nueva presencia: ");
                    personaje.setPresencia(Integer.parseInt(scanner.nextLine()));
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            System.out.println("Personaje editado.");
        }
    }

    // Ver personajes guardados
    private static void verPersonajes(List<Personaje> personajesGuardados) {
        if (!personajesGuardados.isEmpty()) {
            System.out.println("\nPersonajes guardados:");
            for (Personaje p : personajesGuardados) {
                p.mostrar();
                System.out.println("---------------------------");
            }
        } else {
            System.out.println("No hay personajes guardados.");
        }
    }

    // Cargar personajes desde archivo JSON
    private static List<Personaje> cargarPersonajes(File archivo, Gson gson) {
        if (archivo.exists() && archivo.isFile()) {
            try (Reader reader = new FileReader(archivo)) {
                Personaje[] personajesArray = gson.fromJson(reader, Personaje[].class);
                // Convertimos el array a una lista
                if (personajesArray != null) {
                    List<Personaje> personajesList = new ArrayList<>();
                    for (Personaje p : personajesArray) {
                        personajesList.add(p);
                    }
                    return personajesList;
                }
            } catch (IOException e) {
                System.out.println("Error al cargar personajes: " + e.getMessage());
            }
        }
        return new ArrayList<>();  // No hay personajes guardados
    }

    // Guardar personajes en archivo JSON
    private static void guardarPersonajes(List<Personaje> personajes, File archivo, Gson gson) {
        try (Writer writer = new FileWriter(archivo)) {
            // Convertir la lista de personajes a un array
            Personaje[] personajesArray = personajes.toArray(new Personaje[0]);
            gson.toJson(personajesArray, writer);
            System.out.println("Personajes guardados.");
        } catch (IOException e) {
            System.out.println("Error al guardar personajes: " + e.getMessage());
        }
    }
}
