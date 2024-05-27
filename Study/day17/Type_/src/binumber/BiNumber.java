package binumber;

public class BiNumber {

    private int number1;
    private int number2;

    public BiNumber(int a1, int a2) {
        this.number1 = a1;
        this.number2 = a2;
    }

    public int getNumber1() {
        return number1;
    }


    public int getNumber2() {
        return number2;
    }

    public int add() {
        return this.number1 + this.number2;
    }

    public int multiply() {
        return this.number1 * this.number2;
    }

    public void doubleValue() {
        number1 = number1 * 2;
        number2 = number2 * 2;
    }
}
