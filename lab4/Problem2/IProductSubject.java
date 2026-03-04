package lab4.Problem2;

public interface IProductSubject {
    void subscribe(IProductObserver observer);

    void unsubscribe(IProductObserver observer);

    void notifyObservers();

    void setAvailability(boolean available);

    void addSupplier(IProductObserver supplier);
    void notifySupplier();
}
