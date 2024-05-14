package inter;

public class Dog implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("강아지가 웁니다...");
    }

    @Override
    public void sleep() {
        System.out.println("강아지가 잡니다...");
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다...");
    }
}
