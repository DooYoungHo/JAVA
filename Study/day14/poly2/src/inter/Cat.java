package inter;

public class Cat implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("냐옹이가 웁니다...");
    }

    @Override
    public void sleep() {
        System.out.println("냐옹이가 잠을 잡니다...");
    }

    @Override
    public void move() {
        System.out.println("나옹이가 움직입니다...");
    }
}
