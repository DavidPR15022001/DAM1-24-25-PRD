package ud3.prdexamen;

public class CocheCarreras {
    private String nombre;
    private double velocidadMaxima;
    private int turbos;
    private double autonomia;
    private double autonomiaRestante;
    private int turbosRestantes;
    private double distanciaRecorrida = 0;

    CocheCarreras (String nombre, double velocidadMaxima, int turbos, double autonomia, double distanciaRecorrida) {
    
    }
    public String getNombre() {
        return nombre;
    }
    public double getAutonomiaRestante() {
        return autonomiaRestante;
    }
    public int getTurbosRestantes() {
        return turbosRestantes;
    }
    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
    public double getVelocidadMaxima() {
        if (velocidadMaxima >=1 || velocidadMaxima <= 100) 
        return velocidadMaxima;
        return velocidadMaxima; 
    }
    public double getAutonomia() {
        if (autonomia < 0)
        return autonomia;
        return autonomia;
    }
    }
