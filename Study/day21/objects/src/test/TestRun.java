package test;

import test.animal.Animal;
import test.animal.Cat;
import test.animal.Dog;
import test.fly.*;

import java.awt.*;
import java.util.Objects;

public class TestRun {
    public static void main(String[] args) {

        Flyable[] flyingObjects = {new Bird(), new AeroPlane()};
        for (Flyable flyingObject : flyingObjects) flyingObject.fly();

        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) animal.bark();

    }
}
