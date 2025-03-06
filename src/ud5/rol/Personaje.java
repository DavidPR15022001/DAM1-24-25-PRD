package ud5.rol;

import java.util.Random;

public class Personaje {
    public enum Raza {
        HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL
    }

    private String nombre;
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private int inteligencia;
    private int intuicion;
    private int presencia;
    private int nivel;
    private int experiencia;
    private int puntosDeVida;
    private int puntosDeVidaMaximos;

    private static final Random rnd = new Random();

    public Personaje(String nombre, int constitucion) {
        this.nombre = nombre;
        this.constitucion = constitucion;
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion,
            int inteligencia, int intuicion, int presencia, int nivel, int experiencia) {
        if (fuerza < 1 || agilidad < 1 || constitucion < 1 || inteligencia < 1 ||
                intuicion < 1 || presencia < 1 || nivel < 1 || experiencia < 0) {
            throw new IllegalArgumentException("¡Personaje no válido!");
        }

        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.intuicion = intuicion;
        this.presencia = presencia;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosDeVidaMaximos = 50 + constitucion;
        this.puntosDeVida = this.puntosDeVidaMaximos;
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion,
            int inteligencia, int intuicion, int presencia) {
        this(nombre, raza, fuerza, agilidad, constitucion, inteligencia, intuicion, presencia, 1, 0);
    }

    public Personaje(String nombre, Raza raza) {
        this(nombre, raza, getRandomStat(), getRandomStat(), getRandomStat(),
                getRandomStat(), getRandomStat(), getRandomStat(), 1, 0);
    }

    public Personaje(String nombre) {
        this(nombre, Raza.HUMANO);
    }

    private static int getRandomStat() {
        return rnd.nextInt(100) + 1;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Intuición: " + intuicion);
        System.out.println("Presencia: " + presencia);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de Vida: " + puntosDeVida + "/" + puntosDeVidaMaximos);
    }

    @Override
    public String toString() {
        return nombre + " (" + puntosDeVida + "/" + puntosDeVidaMaximos + ")";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
        this.puntosDeVidaMaximos = 50 + constitucion;
        this.puntosDeVida = puntosDeVidaMaximos;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getIntuicion() {
        return intuicion;
    }

    public void setIntuicion(int intuicion) {
        this.intuicion = intuicion;
    }

    public int getPresencia() {
        return presencia;
    }

    public void setPresencia(int presencia) {
        this.presencia = presencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeVidaMaximos() {
        return puntosDeVidaMaximos;
    }

    public byte sumarExperiencia(int puntos) {
        experiencia += puntos;
        byte nivelesSubidos = 0;

        while (experiencia >= 1000) {
            experiencia -= 1000;
            nivelesSubidos++;
            subirNivel();
        }

        return nivelesSubidos;
    }

    public void subirNivel() {
        nivel++;
        fuerza = (int) (fuerza * 1.05);
        agilidad = (int) (agilidad * 1.05);
        constitucion = (int) (constitucion * 1.05);
        puntosDeVidaMaximos = 50 + constitucion;
        puntosDeVida = puntosDeVidaMaximos;
    }

    public void curar() {
        if (puntosDeVida < puntosDeVidaMaximos) {
            puntosDeVida = puntosDeVidaMaximos;
        }
    }

    public boolean perderVida(int puntos) {
        puntosDeVida -= puntos;
        if (puntosDeVida <= 0) {
            puntosDeVida = 0;
            return true;
        }
        return false;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }


    public int atacar(Personaje enemigo) {
        int ataque = fuerza + rnd.nextInt(100) + 1;
        int defensa = enemigo.agilidad + rnd.nextInt(100) + 1;
        int daño = Math.max(0, ataque - defensa);

        if (daño > enemigo.puntosDeVida) {
            daño = enemigo.puntosDeVida;
        }

        if (daño > 0) {
            enemigo.perderVida(daño);
            this.sumarExperiencia(daño);
            enemigo.sumarExperiencia(daño);
        }

        return daño;
    }


    public int atacar(Monstruo m) {
        Random rnd = new Random();
        int dano = Math.max(0, fuerza - m.getDefensa() + rnd.nextInt(10));
        System.out.println(this.nombre + " ataca a " + m.getNombre() + " y le hace " + dano + " de daño.");
        m.perderVida(dano); // El monstruo pierde vida
        return dano;
    }
    
    public int getDefensa() {
        return (fuerza + agilidad) / 2;
    }

    public static void main(String[] args) {

        try {
            Personaje p1 = new Personaje("Aragorn", Raza.HUMANO, 90, 80, 85, 70, 60, 75, 5, 1500);
            p1.mostrar();
            System.out.println(p1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Personaje p2 = new Personaje("Legolas", Raza.ELFO, 85, 95, 70, 80, 90, 85);
            p2.mostrar();
            System.out.println(p2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Personaje p3 = new Personaje("Gimli", Raza.ENANO);
            p3.mostrar();
            System.out.println(p3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Personaje p4 = new Personaje("Boromir");
            p4.mostrar();
            System.out.println(p4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
