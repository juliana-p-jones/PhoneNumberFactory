package designpatterns;

public class CommandPattern {
        /*
        Concept:
        Encapsulate request as an object
        Object-oriented callback
        Decouple sender from processor
        Often used for "undo" functionality
        Examples: java.lang.Runnable, javax.Swing.Action

        Design:
        "People argue that this breaks the principles of OOP design because
        Object per command- a command is a verb and usually objects aren't verbs but the methods inside them
        Command Interface
        Execute Method
            'Unexecute' method
            Reflection
        Command, Invoker, ConcreteCommand

        Pitfalls:
        dependence on other patterns- requires a lot of knowledge
        multiple commands
        make use of mement!os
        prototypes for copies

        Contrast Command and Strategy:
        command: objects per command, class contains the 'what', encapsulates action
        strategy: object per strategy, class contains the 'how', encapsulates algorithm

        Summary:
        Second most used pattern after singleton!

        Encapsulates each request as an object, decouples sender from processor, very few drawbacks, often ued for undo functionality





         */
}
