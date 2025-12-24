// Driver.java
package ShapeBasedGame;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game g = new Game();

        char c;
        do {
            g.selectShape();
            System.out.println();
            System.out.print("Press Y/y to continue, any other key to exit: ");
            c = sc.next().charAt(0);
        } while (c == 'Y' || c == 'y');

        System.out.println("|| === Thank You === || Game Ends === ||");
        sc.close();
    }
}
