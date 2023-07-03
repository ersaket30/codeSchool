package design.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);
        ConcreteObserver observer3 = new ConcreteObserver(subject);
        subject.setState(10);
        subject.setState(20);
    }
}
