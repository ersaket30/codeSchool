package design.pattern.observer;

public class ConcreteObserver implements Observer {
    private int observerState;
    private Subject subject;

    public ConcreteObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        observerState = subject.getState();
        System.out.println("Observer state updated to " + observerState);
    }
}