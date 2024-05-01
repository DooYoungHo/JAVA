package scanner.ex;
import java.util.Scanner;

public class ScannerEx_1 {
    public static void main(String[] args) {
        /* Q1. 이름, 나이 입력받고 출력하기
        * 사용자로부터 입력받은 이름과 나이를 출력하세요.
        * 출력 형태는 "당신의 이름은 [이름]이고, 나이는 [나이]살 입니다." 이어야 합니다.
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("당신의 나이를 입력하세요 : ");
        int age = scanner.nextInt();
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");

        scanner.nextLine();

        /* Q2. 사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
         * ex) 하나의 정수를 입력하세요 : x
         *     입력한 숫자 x는 (홀,짝)수 입니다.
         * */
        System.out.print("하나의 정수를 입력하세요 : ");
        int number = scanner.nextInt();
        if (number % 2 == 0)
            System.out.println("입력한 숫자 " + number + "는 짝수입니다.");
        else
            System.out.println("입력한 숫자 " + number + "는 홀수입니다.");

        scanner.nextLine();

        /* Q3. 사용자로부터 음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity)을 입력받아, 주문한 음식의 총 가격을 계산하고
         * 출력하는 프로그램을 작성하세요.
         * 음식의 총 가격을 계산하세요. 총 가격은 음식의 가격과 수량을 곱한 값이며, 이를 totalPrice 라고 칭합니다.
         * 주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식이름][수량]개를 주문하셨습니다. 총 가격은 [총 가격]원 입니다." 이어야 합니다.
         * */
        System.out.print("음식 이름을 입력해주세요 : ");
        String foodName = scanner.nextLine();
        System.out.print("음식의 가격을 입력해주세요 : ");
        int foodPrice = scanner.nextInt();
        System.out.print("음식의 수량을 입력해주세요 : ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = (foodPrice * foodQuantity);
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다.");

        scanner.nextLine();

        /* Q4. 사용자로부터 하나의 정수 n을 입력받고, n의 구구단을 출력하세요. */
        System.out.print("구구단의 단 수를 입력해주세요 : ");
        int multiplication = scanner.nextInt();

        for (int i = multiplication; i <= multiplication; i++)
            for (int j = 1; j <= 9; j++)
                System.out.println(i + " * " + j + " = " + i * j);
    }
}
