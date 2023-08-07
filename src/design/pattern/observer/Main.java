package design.pattern.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new ConcreteObserver(subject);
        new ConcreteObserver(subject);
        new ConcreteObserver(subject);
        subject.setState(10);
        subject.setState(20);
    }
}
