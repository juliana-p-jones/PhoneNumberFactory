package designpatterns;

public class Singleton {
    /*
    Concepts:
    Only one instance is created
    Guarantees control of a resource
    Lazily Loaded
    Examples: Runtime, Logger, Graphic Managers, and Spring Beans

    Design:
    Class is responsible for lifecycle
    Static in nature
    nees to be thread safe
    private instance and private constructor
    no parameters!!!

    Lazily Loaded:
    Lazily loaded means that you set the instance equal to null.
    This way when the program runs, it isn't automatically
    creating new instances and slowing down run time-
    instead it will create the instance when it is called using
    an if statement.

    Threadsafe:
    add keyword "volatile" to the private static field of instance.
    then, add "throw new RuntimeException("use getInstance() method to create")
    below the if statement.
    Thennnnn in the getInstance() method, below if add
    "synchronized(Singleton.class){
    if instance == null){
    instance = new Singleton()}
    }"

    Pitfalls:
    Often overused...
        this can slow the program down
        Difficult to unit test
        If not careful, not thread-safe
        Sometimes confused for Factory

    Contrast Singleton and Factory:
    Singleton returns the same instance, has one constructor method with no args. No interface
    Factory returns various instances, has multiple constructors, is interface driven, and is adaptable to the environment more easily

    Summary:
    guarantee one instance, is easy to implement, solves a well defined problem, just don't abuse the pattern
     */
}
