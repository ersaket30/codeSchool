package design.pattern.strategy;

/**
 * The Strategy pattern is a behavioral design pattern in Java that defines a family of algorithms, encapsulates each one as an object, and makes them interchangeable. The Strategy pattern lets the algorithm vary independently from clients that use it.
 *
 * The Strategy pattern has the following components:
 *
 * Context: This is a class that contains a reference to a Strategy object and can invoke its algorithm.
 *
 * Strategy: This is an interface that declares an algorithm to be implemented by concrete strategies.
 *
 * ConcreteStrategy: This is a class that implements the Strategy interface and provides a concrete implementation of the algorithm.
 */
public interface SortingStrategy {
    void sort(int[] array);
}
