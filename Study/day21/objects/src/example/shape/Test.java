package example.shape;

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle",5.0);
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        circle.displayInfo();
        System.out.println(circle.calculateArea());

        rectangle.displayInfo();
        System.out.println(rectangle.calculateArea());
    }
}
