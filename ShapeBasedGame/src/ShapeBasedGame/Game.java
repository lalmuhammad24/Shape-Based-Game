// Game.java
package ShapeBasedGame;

import java.util.Scanner;

public class Game {

    private final Scanner sc = new Scanner(System.in);

    public Game() {
        System.out.println("== Game Has Started ==");
    }

    public void selectShape() {
        System.out.println("Press 1 ==> TwoDShape");
        System.out.println("Press 2 ==> ThreeDShape");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> handleTwoDShape();
            case 2 -> handleThreeDShape();
            default -> {
                System.out.println("Invalid choice entered!");
                selectShape();
            }
        }
    }

    private void handleTwoDShape() {
        System.out.println("You have selected TwoDShape");
        TwoDShape t1 = selectTwoDShape();
        t1.printDetails();
        t1.printArea();
        t1.printPerimeter();
    }

    private void handleThreeDShape() {
        System.out.println("You have selected ThreeDShape");
        ThreeDShape t2 = selectThreeDShape();
        t2.printDetails();
        t2.printVolume();
        t2.printLSA();
        t2.printTSA();
    }

    public TwoDShape selectTwoDShape() {
        System.out.println("Press 1 ==> Rectangle");
        System.out.println("Press 2 ==> Circle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("You have selected Rectangle");
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                return new Rectangle(l, w);
            }
            case 2 -> {
                System.out.println("You have selected Circle");
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                return new Circle(r);
            }
            default -> {
                System.out.println("Invalid choice entered!");
                return selectTwoDShape();
            }
        }
    }

    public ThreeDShape selectThreeDShape() {
        System.out.println("Press 1 ==> Cylinder");
        System.out.println("Press 2 ==> Sphere");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("You have selected Cylinder");
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                return new Cylinder(r, h);
            }
            case 2 -> {
                System.out.println("You have selected Sphere");
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                return new Sphere(r);
            }
            default -> {
                System.out.println("Invalid choice entered!");
                return selectThreeDShape();
            }
        }
    }
}
