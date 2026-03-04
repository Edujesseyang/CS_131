package lab4.Problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product implements IProductSubject {
    private List<IProductObserver> observerList;
    private List<IProductObserver> suppliers;
    private String productName;
    private boolean inStock;

    public Product(String productName) {
        this.productName = productName;
        this.observerList = new ArrayList<>();
        this.inStock = false;
        // default supplier
        this.suppliers = new ArrayList<>();
    }



    @Override
    public void setAvailability(boolean available) {
        this.inStock = available;
        if(inStock) {
            System.out.println("\n[Store update] " + productName + " availability change to : " + available);
            notifyObservers();
        } else {
            System.out.println("\n{Store update] "+ productName + " is out of stack, noticing suppliers to restore.");
            notifyObservers();
        }
    }

    @Override
    public void addSupplier(IProductObserver supplier) {
        if(!suppliers.contains(supplier)){
            suppliers.add(supplier);
        }
    }

    @Override
    public void notifySupplier() {
        for(IProductObserver supplier : suppliers){
            supplier.update(productName, inStock);
        }
    }


    @Override
    public void subscribe(IProductObserver observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
            System.out.println("Customer " + observer.getName() +" has subscribed for " + productName + " updates.");
        }
    }

    @Override
    public void unsubscribe(IProductObserver observer) {
        if (observerList.remove(observer)) {
            System.out.println("Customer " + observer.getName() + " has unsubscribed for " + productName + " updates.");
        } else {
            System.out.println("Customer " + observer.getName() +" has not subscribed yet.");
        }
    }

    @Override
    public void notifyObservers() {
        for (IProductObserver ob : observerList) {
            ob.update(productName, inStock);
        }
    }
}
