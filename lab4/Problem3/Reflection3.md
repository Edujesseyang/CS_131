## Reflection for Problem 3
#### Q1:
- We can move those "default" parameter to the builder, and only leave those minimal necessary parameters with `WebServer`.
To make the build easier. 
- The builder doesn't hold on any `WebServer` and the director doesn't hold any `WebBuilder` nor `WebServer`. They are weak
coupling.

#### Q2:
- Builder return itself is for let user get the object itself after a method has been called. So, It gives users the 
ability of using chaining method calls. To avoid so many of parameters pass to a single method.
