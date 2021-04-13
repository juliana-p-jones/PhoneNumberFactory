package designpatterns;

import java.util.Calendar;

public class FactoryMethodPattern {
    /* Concepts:
    Doesn't expose instantiation logic, defers to subclasses, common interface, specified by architecture implemented by use
    Examples include: Calendar, ResourceBundle, NumberFormat

    Can be thought of as the opposite of a Singleton
    Factory is responsible for lifecycle, have a common interface, concrete classes, parameterized create method
    Factory is like an abstract interface. the concrete object uses the factoryMethod() to create new objects

    Name the class as "____Factory"

    Pitfalls: complexity, creation doesn't take place in the factory class but in subclass. Refactoring

    Contrast Singleton Vs Factory:
    Singleton: returns same instance, has one constructor method with no args. no interface, no sublasses
    Factory: returns various instances with multiple constructors. Interface driven, has subclasses, adaptable to environment more easily

     Summary:
     Parameter Driven
     Solves complex creation
     complex
     Opposite of Singleton
     */



}
