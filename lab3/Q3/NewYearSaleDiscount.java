package lab3.Q3;

public class NewYearSaleDiscount implements IDiscountStrategy{
    private final double NEW_YEAR_SALE_RATE = 0.5;
    @Override
    public double applyDiscount(double amount) {
        return amount * NEW_YEAR_SALE_RATE;
    }
}
