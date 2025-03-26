package contornos.ud3;

public class DiscountSystem {
    public static double applyDiscount(double amount, boolean isLoyalCustomer) {
        if (amount < 0) {
            throw new IllegalArgumentException("O importe non pode ser negativo");
        }

        double discount = 0.0;

        if (amount >= 50 && amount <= 100) {
            discount = 0.05;
        } else if (amount >= 100) {
            discount = 0.10;
        }

        if (isLoyalCustomer && amount >= 200) {
            discount += 0.05;
        }

        double finalAmount = amount - (amount * discount);

        return finalAmount;
    }
}

// Se corrigió if (amount > 100) que dice si es mayor que 100 por if (amount >= 100) para que sea si es mayor o igual que 100
// Se corrigió discount -= 0.05; que decrementa el descuento por discount += 0.05; para que incremente el descuento
