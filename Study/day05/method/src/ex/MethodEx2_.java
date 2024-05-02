package ex;
import java.util.Scanner;

public class MethodEx2_ {
    public static void main(String[] args) {
        /* Q1. 은행 계좌 입출금
        * 사용자로부터 계속 입력을 받아 입금과 출금을 수행하는 프로그램을 작성하자.
        * 또한, 간단한 메뉴를 표시하여 어떤 동작을 할 지 선택할 수 있게 하자
        * 출금시 잔액이 부족하다면, 'x원을 출력하려 했으나 잔액이 부족합니다'가 출력되어야 합니다.
        * */
        int myMoney = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = menu(scanner);
            if (choice == 1) {
                int depositAmount = deposit(scanner);
                myMoney += depositAmount;
                System.out.println(depositAmount + "원을 입금하셨습니다. 현재 잔액 : " + myMoney);
            }
            else if (choice == 2) {
                int withdrawAmount = withdraw(scanner);

                if (myMoney < withdrawAmount) {
                    System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
                    continue;
                }
                myMoney -= withdrawAmount;
                System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + myMoney);
            }
            else if (choice == 3) {
                myMoney(myMoney);
            }
            else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("-----------------------------------------");
        System.out.println(" 1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
        System.out.println("-----------------------------------------");
        System.out.print("선택 : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static int deposit(Scanner scanner) {
        System.out.print("입금액을 입력하세요 : ");
        int money = scanner.nextInt();
        scanner.nextLine();
        return money;
    }

    public static int withdraw(Scanner scanner) {
        System.out.print("출금액을 입력하세요 : ");
        int money = scanner.nextInt();
        scanner.nextLine();
        return money;
    }

    public static void myMoney(int money) {
        System.out.println("현재 잔액 : " + money);
    }
}
