package design.pattern.observer;

/**
 * Observer pattern is a behavioral design pattern that allows one or more objects (observers)
 * to be notified automatically of changes in the state of another object (the subject) in a loosely
 * coupled way. In Java, the Observer pattern is commonly used in the implementation of event
 * handling systems.
 *
 * The basic components of the Observer pattern in Java are:
 *
 * Subject: This is the object that is being observed. It maintains a list of its observers
 * and provides methods to add and remove observers.
 *
 * Observer: This is the interface that defines the method(s) that will be called when the state
 * of the subject changes.
 *
 * ConcreteSubject: This is the implementation of the subject. It maintains its own state and
 * notifies its observers when its state changes.
 *
 * ConcreteObserver: This is the implementation of the observer. It registers with the subject to
 * receive notifications and provides an implementation of the observer method(s) that are called
 * when the subject's state changes.
 */
public interface Observer {
    public void update();
}
