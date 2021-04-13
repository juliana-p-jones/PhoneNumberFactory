package designpatterns;

public class AbstractFactoryPattern {
    /*
    Factory of factories
    Factory of related objects
    Common Interface
    Defer to Subclasses
    Ex. DocumentBuilder, Frameworks

    Design:
    group factories together. the factory is responsible for lifecycle. Common interface, has a parameterized create method
    AbstractFactory is an interface designed that ConcreteFactory should implement from

    Pitfalls:
    Complexity
    Runtime switch
    Pattern within a patter
    Problem Specific
    Starts as a factory

    Contrasting Factory and AbstractFactory:
    Factory returns various instances, with multiple constructors. It is interface driven and adaptable to the environment more easily.
    AbstractFactory is implemented with a factory. It hides the factory, abstracts the environment, and is built through composition.
    Fact

    Summary:
    it is a group of similar factories, its complex and there is heavy abstraction. It is a framework pattern, built as a part of larger framework of the code.
     */
}
