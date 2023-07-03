package design.pattern.visitor;

public class Circle implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void draw() {
        System.out.println("Drawing a circle");
    }
}
