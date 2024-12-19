package ud2.practicas;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Supermercado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar;

        do {
            double totalCompra = realizarCompra(sc);
            procesarPago(sc, totalCompra);
            continuar = deseaContinuar(sc);
        } while (continuar);

        System.out.println("Gracias por usar nuestro sistema. ¡Hasta luego!");
    }

    public static double realizarCompra(Scanner scanner) {
        double total = 0;
        while (true) {
            try {
                System.out.print("Introduce el precio del producto (0 o negativo para finalizar): ");
                double precio = Double.parseDouble(scanner.nextLine());
                if (precio <= 0) break;

                System.out.print("Introduce la cantidad de unidades: ");
                int cantidad = Integer.parseInt(scanner.nextLine());
                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser un número entero positivo.");
                    continue;
                }

                total += precio * cantidad;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número válido.");
            }
        }
        System.out.printf("El total de la compra es: %.2f €\n", total);
        return total;
    }

    public static void procesarPago(Scanner scanner, double totalCompra) {
        while (true) {
            System.out.print("Elige el medio de pago (tarjeta/efectivo): ");
            String metodoPago = scanner.nextLine().trim().toLowerCase();

            if (metodoPago.equals("tarjeta")) {
                System.out.println("Pago realizado con tarjeta. Gracias por su compra.");
                break;
            } else if (metodoPago.equals("efectivo")) {
                procesarPagoEfectivo(scanner, totalCompra);
                break;
            } else {
                System.out.println("Opción inválida. Por favor, elige 'tarjeta' o 'efectivo'.");
            }
        }
    }

    public static void procesarPagoEfectivo(Scanner scanner, double totalCompra) {
        while (true) {
            try {
                System.out.print("Introduce el importe pagado: ");
                double importePagado = Double.parseDouble(scanner.nextLine());

                if (importePagado < totalCompra) {
                    System.out.println("El importe pagado es insuficiente. Por favor, introduce una cantidad mayor o igual al total.");
                    continue;
                }

                double cambio = importePagado - totalCompra;
                System.out.printf("Cambio a devolver: %.2f €\n", cambio);
                desglosarCambio(cambio);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, introduce un número válido.");
            }
        }
    }

    public static void desglosarCambio(double cambio) {
        int[] billetes = {50, 20, 10, 5};
        int[] monedas = {2, 1};
        int[] centimos = {50, 20, 10, 5, 2, 1};

        int cambioEntero = (int) cambio;
        int cambioCentimos = (int) Math.round((cambio - cambioEntero) * 100);

        System.out.println("Desglose del cambio:");

        for (int billete : billetes) {
            int cantidad = cambioEntero / billete;
            if (cantidad > 0) {
                System.out.printf("%d billetes de %d €\n", cantidad, billete);
                cambioEntero %= billete;
            }
        }

        for (int moneda : monedas) {
            int cantidad = cambioEntero / moneda;
            if (cantidad > 0) {
                System.out.printf("%d monedas de %d €\n", cantidad, moneda);
                cambioEntero %= moneda;
            }
        }

        for (int centimo : centimos) {
            int cantidad = cambioCentimos / centimo;
            if (cantidad > 0) {
                System.out.printf("%d monedas de %d céntimos\n", cantidad, centimo);
                cambioCentimos %= centimo;
            }
        }
    }

    public static boolean deseaContinuar(Scanner scanner) {
        while (true) {
            System.out.print("¿Desea realizar otra compra? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("s")) return true;
            if (respuesta.equals("n")) return false;
            System.out.println("Opción inválida. Por favor, responde 's' o 'n'.");
        }
    }

    @Test
    void testDeseaContinuar() {
        
    }

    @Test
    void testDesglosarCambio() {
        
    }

    @Test
    void testMain() {
        
    }

    @Test
    void testProcesarPago() {
        
    }

    @Test
    void testProcesarPagoEfectivo() {
        
    }

    @Test
    void testRealizarCompra() {
        
    }
    
}

