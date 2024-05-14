package test;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal[] animals = {dog, cat};      // 부모 클래스는 자식 클래스를 담을 수 있다.

        for (Animal a : animals)
            a.animalSound();
    }
}
