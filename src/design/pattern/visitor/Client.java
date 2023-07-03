package design.pattern.visitor;

public class Client {
    public static void main(String[] args) {
        Element[] elements = {new Circle(), new Rectangle()};
        Visitor visitor = new DrawingVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
