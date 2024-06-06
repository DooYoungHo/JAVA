package test.fly;

public class AeroPlane implements Flyable {
    @Override
    public void fly() {
        System.out.println("With fuel...");
    }
}
