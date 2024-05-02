package ex;

public class MethodEx_ {
    public static void main(String[] args) {
        /* Q1. 아래의 코드를 메서드를 이용하여 리펙토링 해보자 */
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a + b+ c;
        double average = sum / 3.0;
        System.out.println("평균값 : " + average);

        int x = 15;
        int y = 20;
        int z = 25;

        sum = x + y + z;
        average = sum / 3.0;
        System.out.println("평균값 : " + average);

        double cal = calculateAverage(10,20,30);

        /* Q2. 아래 반복해서 메시지를 출력하는 기능을 메서드로 구현하라 */
        String name = "Hello my name is Youngho";

        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(name);
        }

        repeatMessage(name, 3);

        /* Q3. 입출금 리펙토링
        * 아래는 입금과 출금을 나타내는 코드이다. 입금(deposit)과 출금(withdraw)을 메서드로 만들어서 리펙토링 해보자
        * */
        int balance = 1000;

        // 입금 500;
        int depositAmount = 500;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액 : " + balance + "원");

        // 출금 500;
        int withdrawAmount = 200;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        }
        else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        System.out.println("최종 잔액 : " + balance + "원");

        balance = 3500;
        balance = deposit(balance,3000);
        balance = withdraw(balance, 6500);
        System.out.println("최종 잔액 : " + balance + "원");
    }

    /* Q1. 메서드 */
    public static double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값 : " + average);
        return average;
    }

    /* Q2. 메서드 */
    public static void repeatMessage(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    /* Q3. 메서드 - deposit */
    public static int deposit(int money, int depositAmount) {
        int amount = money + depositAmount;
        System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액 : " + amount + "원");
        return amount;
    }
    /* Q3. 메서드 - withdraw */
    public static int withdraw(int money, int withdrawAmount) {
        if (money >= withdrawAmount) {
            money -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + money + "원");
        }
        else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return money;
    }
}
