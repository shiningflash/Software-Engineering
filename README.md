# Software-Engineering

----------------------

## Structural Design Pattern

-------------------------

### Composite Pattern

Composite pattern is a `structural design pattern` that lets you compose objects into tree structure and then work with this structure as if they were individual objects. It bascically describes groups of objects that can be treated as the same way as a single instance of the same object type.

### Proxy Design Pattern

`Proxy` means 'in place of' or 'on behalf of'. Proxies are called wrappers. For example, a credit card or simply a check is a proxy for what is in our bank account.

So, proxy pattern is used for easier, safer and more convenient use of placeholder to represent something or someone else.

Proxy pattern is a `structural design pattern` that use a proxy class to wrap the subject class to have a polymorphic design so that the client class can expect the same interface for the proxy and the real subject class.

**Uses**
- To use a lightweight proxy in place of a resource intensive object until it is actually needed.
- To implement some form of intelligent verification of requests from client code in order to determine if, how and to whom the request should be forwarded to.
- To present a local representation of system that is not in the same physical or virtual spaces
- Provides powerful means of interactions
- Proxy classes are robust and can make the system more secure and less resource intensive.

### Decorator Pattern

Decorator pattern is a `structural design pattern` allows a user to add new functionalities to an existing objects without altering its structure. This pattern creates a decorator class which wraps an original class and provides additional functionalities keeping class method signature intact.


## Behavioral Design Pattern

----------------------------

### Template Method Pattern

Template method pattern is a `behavioral design pattern` that allows you to define a skeleton of an algorithm in a base class and let subclasses override the steps without changing the overall algorithm's structure. So, actually template pattern is used when two or more implementations of a similar algorithm exists.