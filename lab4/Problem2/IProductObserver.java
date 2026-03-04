package lab4.Problem2;

public interface IProductObserver {
    void update(String productName, boolean isAvailable);
    String getName();
}
