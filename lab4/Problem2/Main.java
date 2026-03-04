package lab4.Problem2;

public class Main {
    public static void main(String[] args) {
        IProductObserver jesse = new Customer("Jesse");
        IProductObserver chloe = new Customer("Chloe");
        IProductSubject iphone16 = new Product("IPhone16");

        iphone16.subscribe(jesse);
        iphone16.subscribe(chloe);
        iphone16.setAvailability(true);

        iphone16.unsubscribe(jesse);
        iphone16.setAvailability(false);
    }
}
