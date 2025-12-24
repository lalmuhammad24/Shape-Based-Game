package exceptionHandling;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            Register.checkEligiblity(age);
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Program ends.");
        sc.close();
    }
}
