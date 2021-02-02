<h1 align=center> <a href="https://github.com/shiningflash/Software-Engineering" style="color: red"> Software Engineering </a> </h1>

----------------------

<h2 align=center>  Creational Design Pattern </h2>

-------------------------

### [Singleton Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/SingletonPattern)

Singleton pattern is a `Creational design pattern` that restricts a class to instantiate only one "single" instance. This is important when exactly one instance is needed to co-ordinate actions across the system..

### [Builder Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/BuilderPattern)

Builder pattern is a `creational design pattern` that lets you construct a complex object using simple objects and using step by step approach. It solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step.

-------------------------

<h2 align=center>  Structural Design Pattern </h2>

-------------------------

### [Adapter Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/AdapterPattern)

Adapter pattern is a `structural design pattern` which basically works as wrapper, an alternative naming shared with the `Decorator Pattern`. It allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

### [Composite Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/CompositePattern)

Composite pattern is a `structural design pattern` that lets you compose objects into tree structure and then work with this structure as if they were individual objects. It bascically describes groups of objects that can be treated as the same way as a single instance of the same object type.

### [Proxy Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/ProxyPattern)

`Proxy` means 'in place of' or 'on behalf of'. Proxies are called wrappers. For example, a credit card or simply a check is a proxy for what is in our bank account.

So, proxy pattern is used for easier, safer and more convenient use of placeholder to represent something or someone else.

Proxy pattern is a `structural design pattern` that use a proxy class to wrap the subject class to have a polymorphic design so that the client class can expect the same interface for the proxy and the real subject class.

**Uses**
- To use a lightweight proxy in place of a resource intensive object until it is actually needed.
- To implement some form of intelligent verification of requests from client code in order to determine if, how and to whom the request should be forwarded to.
- To present a local representation of system that is not in the same physical or virtual spaces
- Provides powerful means of interactions
- Proxy classes are robust and can make the system more secure and less resource intensive.

### [Decorator Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/DecoratorPattern)

Decorator pattern is a `structural design pattern` allows a user to add new functionalities to an existing objects without altering its structure. This pattern creates a decorator class which wraps an original class and provides additional functionalities keeping class method signature intact.

--------------------------

<h2 align=center>  Behavioral Pattern </h2>

----------------------------

### [Observer Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/ObserverPattern)

Observer pattern is a `behavioral design pattern` which basically defines a one-to-many relationship so that when one object changes state, all the dependants are notified and updated automatically.

### [Template Method Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/TemplatePattern)

Template method pattern is a `behavioral design pattern` that allows you to define a skeleton of an algorithm in a base class and let subclasses override the steps without changing the overall algorithm's structure. So, actually template pattern is used when two or more implementations of a similar algorithm exists.

### [Chain of Responsibility Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/ChainOfResponsibilityPattern)

Chain of Responsibility is a `behavioral design pattern` that creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request.

Each receiver contains reference to another receiver. If one object can not handle the request then it passes to next receiver and so on.

### [State Pattern](https://github.com/shiningflash/Software-Engineering/tree/master/Design%20Pattern/StatePattern)

State design pattern is a `behavioral design pattern` that allows an object to change it behavior when its internal state changes.

---------------------------