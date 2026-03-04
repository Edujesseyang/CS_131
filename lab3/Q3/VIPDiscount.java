package lab3.Q3;

public class VIPDiscount implements IDiscountStrategy{
    private final double VIP_DISCOUNT_RATE = 0.8;
    @Override
    public double applyDiscount(double amount) {
        return amount * VIP_DISCOUNT_RATE;
    }
}
