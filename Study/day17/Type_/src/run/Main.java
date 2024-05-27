package run;

import binumber.BiNumber;
import mychar.MyChar;
import simplecalculator.SimpleInterestCalculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BiNumber numbers = new BiNumber(2,3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers.doubleValue();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());

        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
        BigDecimal totalSum = calculator.calculateTotalValue(5);
        System.out.println(totalSum);

        MyChar myChar = new MyChar('a');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isNumber());
        System.out.println(myChar.isAlphabet());
        myChar.printLowerCaseAlphabets();
        myChar.printUpperCaseAlphabets();

        /* 간단 if - else 문 예제 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();

        System.out.println("1 - Add\n" +
                "2 - Subtract\n" +
                "3 - Divide\n" +
                "4 - Multiply");
        int choice = scanner.nextInt();

        if (choice == 1)
            System.out.println(add(num1, num2));
        else if (choice == 2)
            System.out.println(subtract(num1, num2));
        else if (choice == 3)
            System.out.println(division(num1, num2));
        else if (choice == 4)
            System.out.println(multiple(num1, num2));
        else
            System.out.println("Invalid Operation");
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int multiple(int num1, int num2) {
        return num1 * num2;
    }

    static double division(int num1, int num2) {
        return (double)num1 / num2;
    }

    static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static boolean isWeekDay(int dayNumber) {
        return switch (dayNumber) {
            case 0 -> {
                System.out.println("Sunday is WeekDay");
                yield true;
            }
            case 1 -> {
                System.out.println("Monday is not Weekday");
                yield false;
            }
            case 2 -> {
                System.out.println("Tuesday is not Weekday");
                yield false;
            }
            case 3 -> {
                System.out.println("Wednesday is not Weekday");
                yield false;
            }
            case 4 -> {
                System.out.println("Thursday is not Weekday");
                yield false;
            }
            case 5 -> {
                System.out.println("Friday is not Weekday");
                yield false;
            }
            case 6 -> {
                System.out.println("Saturday is Weekday");
                yield true;
            }
            default -> {
                System.out.println("Invalid Option");
                yield false;
            }
        };
    }

    public static String determineNameOfMonth(int monthNumber) {
        return switch (monthNumber) {
          case 1 -> {
              yield "January";
          }
          case 2 -> {
              yield "February";
          }
          case 3 -> {
              yield "March";
          }
          default ->  {
              yield "-1";
            }
        };
    }

    public static String determineNameOfDay(int dayNumber) {
        return switch (dayNumber) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            default -> {
                yield "Invalid Option";
            }
        };
    }
}
