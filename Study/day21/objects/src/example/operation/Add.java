package example.operation;

public class Add implements Operation {

    @Override
    public int perform(int x, int y) {
        return x + y;
    }
}
