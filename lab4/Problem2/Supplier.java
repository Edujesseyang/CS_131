package lab4.Problem2;

public class Supplier implements IProductObserver {
    private String supplierName;

    public Supplier(String name) {
        this.supplierName = name;
    }

    @Override
    public void update(String productName, boolean isAvailable) {
        if (!isAvailable) {
            System.out.println("Hi,  " + supplierName + "we need more " + productName + "! Harry! ");
        }
    }

    @Override
    public String getName() {
        return supplierName;
    }
}
