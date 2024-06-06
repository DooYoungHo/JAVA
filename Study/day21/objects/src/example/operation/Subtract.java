package example.operation;

public class Subtract implements Operation {

    @Override
    public int perform(int x, int y) {
        return x - y;
    }
}
