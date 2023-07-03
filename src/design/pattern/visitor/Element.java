package design.pattern.visitor;

public interface Element {
    void accept(Visitor visitor);
}
