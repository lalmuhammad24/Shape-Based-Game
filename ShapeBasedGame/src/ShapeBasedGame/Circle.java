// Circle.java
package ShapeBasedGame;

public class Circle extends TwoDShape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printDetails() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius + " units");
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area + " square units");
    }

    @Override
    public void printPerimeter() {
        double peri = 2 * Math.PI * radius;
        System.out.println("Circumference: " + peri + " units");
    }
}
