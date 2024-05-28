package run;

import mynumber.MyNumber;
import numberplayer.NumberPlayer;
import numberutils.NumberUtils;

public class Run {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(6);
        int sum = number.sumUptoN();
        int sumOfDivisors = number.sumOfDivisors();

        System.out.println(number.isPrime());
        System.out.println("합계 : " + sum);
        System.out.println("약수 합계 : " + sumOfDivisors);
        number.printANumberTriangle();

        NumberPlayer player = new NumberPlayer(30);
        player.printSquaresUptoLimit();
        player.printCubesUptoLimit();

        NumberUtils utils = new NumberUtils();

        System.out.println(utils.getLastDigit(1234));
        System.out.println(utils.getLastDigit(90));
        System.out.println();

        System.out.println(utils.getNumberOfDigits(12345));
        System.out.println(utils.getNumberOfDigits(0));
        System.out.println();

        System.out.println(utils.getSumOfDigits(123));   // Output: 6
        System.out.println(utils.getSumOfDigits(90));    // Output: 9
        System.out.println(utils.getSumOfDigits(5));     // Output: 5
        System.out.println(utils.getSumOfDigits(0));     // Output: 0
        System.out.println(utils.getSumOfDigits(-67));   // Output: -1
        System.out.println();

        System.out.println(utils.reverseNumber(12345));
    }
}
