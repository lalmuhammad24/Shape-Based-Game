// Cylinder.java
package ShapeBasedGame;

public class Cylinder extends ThreeDShape {

    private double r;
    private double h;

    public Cylinder() {
    }

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public void printVolume() {
        double v = Math.PI * r * r * h;
        System.out.println("Volume: " + v + " cubic units");
    }

    @Override
    public void printLSA() {
        double lsa = 2 * Math.PI * r * h;
        System.out.println("Lateral surface area: " + lsa + " square units");
    }

    @Override
    public void printTSA() {
        double tsa = 2 * Math.PI * r * (r + h);
        System.out.println("Total surface area: " + tsa + " square units");
    }

    @Override
    public void printDetails() {
        System.out.println("Cylinder:");
        System.out.println("Radius: " + r + " units");
        System.out.println("Height: " + h + " units");
    }
}
