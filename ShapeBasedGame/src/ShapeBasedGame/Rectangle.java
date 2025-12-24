// Rectangle.java
package ShapeBasedGame;

public class Rectangle extends TwoDShape {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void printDetails() {
        System.out.println("Rectangle:");
        System.out.println("Length: " + length + " units");
        System.out.println("Width : " + width + " units");
    }

    @Override
    public void printArea() {
        double area = length * width;
        System.out.println("Area: " + area + " square units");
    }

    @Override
    public void printPerimeter() {
        double peri = 2 * (length + width);
        System.out.println("Perimeter: " + peri + " units");
    }
}
