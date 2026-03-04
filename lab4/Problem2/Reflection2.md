## Reflection for Problem 2

The observer pattern in this scenario, basically is treating a 'customer' as an 'observer'. The subject class `Product` 
and the observer class `Customer` will not depend on each other. The relationship between them is only about that the 
`Customer` class maintaining an `ArrayList` that contain a list of customers. That is weak coupling. They do not directly 
depends on each other. 
If we want to add a `Supplier` class into the `Product` class to let the 'Supplier' know if the product needed to be ordered.
We can add another `ArrayList` into the `Product` class that maintain some of the supplier.

I have added `Supplier` class that implement `IProductObserver` to demonstrate the question above.