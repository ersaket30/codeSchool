package design.pattern.factory;

public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Creating a circle
        Shape circle = factory.createShape("circle");
        circle.draw();

        // Creating a rectangle
        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}
