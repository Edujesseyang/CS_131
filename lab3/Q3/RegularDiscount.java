package lab3.Q3;

public class RegularDiscount implements IDiscountStrategy{
    private final double DISCOUNT_RATE = 0.9;


    public RegularDiscount(){
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * DISCOUNT_RATE;
    }
}
