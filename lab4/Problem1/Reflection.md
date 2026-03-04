## Reflection

We are basically add a dependency `MediaAdapter` to the class `AudoPlayer`. And solved the problem that `AudioPlayer` 
can only take `Mp3` type. In the further, we can only modify the `MediaAdapter` class in case of adding new supported type. 

Advantages:
- We hide the details of how adapter works, and client does not have to `new` an adapter by themselves to use it. 
- The parameter type is only `String` now, the client does not have to pass in an "Playee" kind of object to the `MediaPlayer`. 
String parameter can indicate the behaviors.

Disadvantages:
- In this implementation, `MediaAdapter` actually serve as a 'factory' and 'adapter'. Violating the single responsible 
principle. 
To solve the problem. I added a `MediaFactory` class that only work for `new` the instance that required. For decoupling
the adaption and creation of the adapter. And demonstrating my understanding about Factory Pattern  as well.
