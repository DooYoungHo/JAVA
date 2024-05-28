package mynumber;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 2)
            return false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public int sumUptoN() {

        int resultSum = 0;

        for (int i = 1; i <= number; i++)
            resultSum += i;

        return resultSum;
    }

    public int sumOfDivisors() {

        int resultSum = 0;

        if (number <= 2) {
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                resultSum += i;
        }
        return resultSum;
    }

    public void printANumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
