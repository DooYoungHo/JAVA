package scanner;

import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자를 입력하세요 : ");
        String str = scanner.nextLine(); // 입력을 문자열로 가져온다.
        System.out.println("입력한 문자열 : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt(); // 입력을 정수로 가져온다.
        System.out.println("입력한 정수 : " + intValue);

        System.out.print("실수를 입력하세요 : "); // 입력을 실수로 가져온다.
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);

        scanner.nextLine(); // 입력 버퍼의 '/n' 소진
        // Scanner & 반복문을 사용
        /* 사용자가 입력한 문자열을 그대로 출력하는 예제를 작성해보자
        * 사용자가 'exit' 라는 문자를 입력하면 반복문 탈출
        * 프로그램은 계속해서 실행되어야 한다.
        * */

        while (true) {
            System.out.print("문자를 입력하세요(exit = 종료) : ");
            String message = scanner.nextLine();
            if (message.equals("exit"))
                break;
            else
                System.out.println("메시지 : " + message);
        }

        /* Scanner & 반복문을 사용2
        * 첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자
        * 첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
        * */

        while (true) {
            System.out.println("두 숫자 모두 0을 입력하시면 종료됩니다.");
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0)
                break;
            else
                System.out.println("두 숫자의 합은 = " + (num1 + num2));
        }

        scanner.nextLine(); // 입력 버퍼의 '/n' 소진

        /* Scanner & 반복문을 사용3
         * 사용자 입력을 받아 그 합계를 계산하는 프로그램을 작성하자
         * 사용자는 한 번에 한 개의 정수를 입력 받을 수 있으며, 사용자가 0을 입력하면 프로그램은 종료된다.
         * 이 때, 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합을 출력해야 한다.
         * */
        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요(0입력시 종료) : ");
            int value = scanner.nextInt();
            if (value == 0){
                System.out.println("sum = " + sum);
                break;
            }
            sum = sum + value;
        }
    }
}
