// Sphere.java
package ShapeBasedGame;

public class Sphere extends ThreeDShape {

    private double r;

    public Sphere() {
    }

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public void printVolume() {
        double v = (4.0 / 3.0) * Math.PI * r * r * r;
        System.out.println("Volume: " + v + " cubic units");
    }

    @Override
    public void printLSA() {
        // For sphere, LSA = TSA
        double sa = 4 * Math.PI * r * r;
        System.out.println("Curved surface area: " + sa + " square units");
    }

    @Override
    public void printTSA() {
        double sa = 4 * Math.PI * r * r;
        System.out.println("Total surface area: " + sa + " square units");
    }

    @Override
    public void printDetails() {
        System.out.println("Sphere:");
        System.out.println("Radius: " + r + " units");
    }
}
