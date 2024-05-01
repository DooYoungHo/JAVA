package scanner.ex;
import java.util.Scanner;

public class ScannerEx_2 {
    public static void main(String[] args) {

        /* Q1. 변수 값 교환
        * 변수 a와 b를 사용자로부터 입력받아 값을 서로 바꾸어라. */
        Scanner scanner = new Scanner(System.in);

        int temp = 0;

        System.out.print("첫 번째 수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("두 번째 수를 입력하세요 : ");
        int b = scanner.nextInt();

        System.out.println("a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);

        scanner.nextLine();

        /* Q2. 사이 숫자
        * 사용자로부터 2개의 숫자를 입력받아, 이 두 정수 사이의 모든 수를 출력하는 프로그램을 작성해라.
        * 첫 번째 숫자는 num1 이어야합니다.
        * 두 번째 숫자는 num2 이어야합니다.
        * 만약 num1 > num2 라면 두 숫자를 교환해서 풀어주세요.
        * */

        System.out.print("Q2. 첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("Q2. 두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp2 = 0;

            temp2 = num1;
            num1 = num2;
            num2 = temp2;
        }

        for (int i = num1; i <= num2; i++){
            System.out.print(i + " ");
        }
        System.out.println();


    }
}
