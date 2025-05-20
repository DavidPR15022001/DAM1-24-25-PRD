package contornos.ud5.supermercados;

public class Proveedor {
    private int id;
    private String nombre;
    private String direccion;
    
    public Proveedor(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Proveedor [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Proveedor other = (Proveedor) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
