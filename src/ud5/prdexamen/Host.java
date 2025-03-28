package ud5.prdexamen;

import java.util.Arrays;

public class Host {

    // Tu código aquí

    String nombre;
    String ip;
    String mac;
    String mascaraDeRed;
    String puertaDeEnlace;
    String servidoresDNS;
    
    public Host(String nombre, String ip, String mac) {
        this.nombre = nombre;
        this.ip = ip;
        this.mac = mac;
    }

    public void Host (String mascaraDeRed, String puertaDeEnlace, String servidoresDNS) {
        this.mascaraDeRed = ("255.255.0.0");
        this.puertaDeEnlace = ("192.168.0.11");
        this.servidoresDNS = ("192.168.0.9");
    }

    public void validarNombre() {
    if (nombre == null) {
        throw new IllegalArgumentException ("El nombre no puede ser nulo");
        }
    }

    @Override
    public boolean equals(Object h) {
        Host otroHost = (Host) h;
        boolean iguales = false;
        if (this.mac.equals(otroHost.mac)) {
            iguales = true;
        }
            return iguales;
    }

    @Override
    public String toString() {
        return nombre + "(" + ip + mac + ")";
    }

    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103};
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}
