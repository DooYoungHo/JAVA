package abstractrecipe;

public class Recipe1 extends AbstractRecipe {

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDishes() {
        System.out.println("do the dishes");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean the utensils");
    }
}
