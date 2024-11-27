package ud3.apuntes;

public class CuentaCorriente {
    String dni;
    String nombre;
    private double saldo;


    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    CuentaCorriente(String dni, String nombre) {
        this(dni, nombre, 0);
    }
    
    public CuentaCorriente(String dni, double saldo) {
        this(dni, null, saldo);
    }


    public boolean sacarDinero(double importe) {
        if (saldo >= importe)  {
            saldo -= importe;
            return true;
        } else {
            return false;
        }
    }

    public void ingresarDinero(double importe) {
        saldo += importe;
    }

    public void mostrarInformacion(){
        System.out.println("CUENTA CORRIENTE: ");
        System.out.println("- Titular: " + nombre + " (DNI = " + dni + ")");
        System.out.println("- Saldo: " + saldo + " euros");
    }    

}
