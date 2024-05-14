package inter;

public class Main {

    public static void main(String[] args) {

        // 인터페이스는 생성 불가함
        Cat cat = new Cat();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(dog);
        System.out.println("========================");
        moveAnimal(cat);
        moveAnimal(dog);
        System.out.println("========================");
        sleepAnimal(cat);
        sleepAnimal(dog);
    }

    public static void soundAnimal(InterfaceAnimal inter) {
        inter.sound();
    }

    public static void moveAnimal(InterfaceAnimal inter) {
        inter.move();
    }

    public static void sleepAnimal(InterfaceAnimal inter) {
        inter.sleep();
    }
}
