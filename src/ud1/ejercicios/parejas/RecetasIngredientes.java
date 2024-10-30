package ud1.ejercicios.parejas;

import java.util.Scanner;

public class RecetasIngredientes {
    public static void main(String[] args) {

        String recetaURL = "https://www.abc.es/recetasderechupete/compota-de-manzana-casera/12509/";
        int personasOriginales = 6;
        double manzanasOriginal = 1.5;
        double aguaOriginal = 200;
        double azucarOriginal = 100;
        double limonOriginal = 1;

        double precioManzanaPorKg = 1.69;
        double precioAzucarPorKg = 1.09;
        double precioAguaPorL = 1;
        double precioLimónPorUnidad = 0.30;

        System.out.println("Compota de Manzana Casera");
        System.out.println("URL de la receta: " + recetaURL);
        System.out.println("Para " + personasOriginales + " personas se necesita:");
        System.out.printf("- Manzanas: %.2f kg\n", manzanasOriginal);
        System.out.printf("- Agua: %.2f ml\n", aguaOriginal);
        System.out.printf("- Azúcar: %.2f g\n", azucarOriginal);
        System.out.printf("- Limón: %.2f unidades\n", limonOriginal);
        
        System.out.println("Otros ingredientes opcionales: canela, vainilla (al gusto).");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de personas para adaptar la receta: ");
        int personasSolicitadas = scanner.nextInt();

        double manzanasAdaptadas = (manzanasOriginal / personasOriginales) * personasSolicitadas;
        double aguaAdaptada = (aguaOriginal / personasOriginales) * personasSolicitadas;
        double azucarAdaptada = (azucarOriginal / personasOriginales) * personasSolicitadas;
        double limonAdaptado = (limonOriginal / personasOriginales) * personasSolicitadas;

        System.out.printf("Para %d personas se necesita:\n", personasSolicitadas);
        System.out.printf("- Manzanas: %.2f kg\n", manzanasAdaptadas);
        System.out.printf("- Agua: %.2f ml\n", aguaAdaptada);
        System.out.printf("- Azúcar: %.2f g\n", azucarAdaptada);
        System.out.printf("- Limón: %.2f unidades\n", limonAdaptado);

        double costoManzanas = manzanasAdaptadas * precioManzanaPorKg;
        double costoAzucar = (azucarAdaptada / 1000) * precioAzucarPorKg;
        double costoAgua = (aguaAdaptada / 1000) * precioAguaPorL;
        double costoLimon = limonAdaptado * precioLimónPorUnidad;

        double costoTotal = costoManzanas + costoAzucar + costoAgua + costoLimon;

        System.out.printf("Costo de ingredientes:\n");
        System.out.printf("- Manzanas: %.2f euros\n", costoManzanas);
        System.out.printf("- Azúcar: %.2f euros\n", costoAzucar);
        System.out.printf("- Agua: %.2f euros\n", costoAgua);
        System.out.printf("- Limón: %.2f euros\n", costoLimon);
        System.out.printf("Costo total: %.2f euros\n", costoTotal);
        
        System.out.println("Recomendación: Puedes reducir la cantidad de azúcar para hacer la receta más saludable.");

        scanner.close();
    }
}
