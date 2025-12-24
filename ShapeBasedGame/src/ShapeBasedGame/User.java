// User.java
package ShapeBasedGame;

public class User {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printUser() {
        System.out.println("User name: " + name);
        System.out.println("User age : " + age);
    }
}
