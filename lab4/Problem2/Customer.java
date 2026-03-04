package lab4.Problem2;

public class Customer implements IProductObserver {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String productName, boolean isAvailable) {
        if(isAvailable){
            System.out.println("Hello, " + customerName +", " + productName + " is now available!");
        } else {
            System.out.println("Hello, " + customerName +", " + productName + " is out of stock!");
        }
    }

    @Override
    public String getName() {
        return customerName;
    }
}
