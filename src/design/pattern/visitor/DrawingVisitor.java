package design.pattern.visitor;

public class DrawingVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing operation for circle");
        circle.draw();
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing operation for rectangle");
        rectangle.draw();
    }
}
