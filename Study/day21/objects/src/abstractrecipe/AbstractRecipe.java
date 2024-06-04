package abstractrecipe;

public abstract class AbstractRecipe {
    // prepare
    // recipe
    // cleanup
    public void execute() {
        getReady();
        doTheDishes();
        cleanUp();
    }

    abstract void getReady();
    abstract void doTheDishes();
    abstract void cleanUp();

}
