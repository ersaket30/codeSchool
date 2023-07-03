package design.pattern.decorator;

/**
 * The Decorator pattern is a structural design pattern in Java that allows behavior to be
 * added to an individual object dynamically, without affecting the behavior of other objects
 * from the same class.This pattern is used to modify the functionality of an object at runtime
 * by wrapping it with another object that provides additional behavior or functionality.
 *
 * In the Decorator pattern, there are several key components:
 *
 * Component: This is the interface that defines the methods that the Decorator and
 * ConcreteComponent will implement.
 *
 * ConcreteComponent: This is the basic implementation of the Component interface.
 * It is the object that we want to add behavior to at runtime.
 *
 * Decorator: This is an abstract class that implements the Component interface
 * and has a reference to a Component object. It defines the basic interface for all
 * decorators and delegates to the wrapped object.
 *
 * ConcreteDecorator: This is the implementation of the Decorator class.
 * It adds new behavior or functionality to the wrapped object.
 *
 * Here is an example of the Decorator pattern in Java:
 */
public interface Shape {
    void draw();
}
