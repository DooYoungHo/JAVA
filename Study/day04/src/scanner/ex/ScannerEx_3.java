package scanner.ex;
import java.util.Scanner;

public class ScannerEx_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Q1. 사용자로부터 이름과 나이를 반복해서 입력받고,
        * 입력받은 이름과 나이를 출력하는 프로그램을 작성해 보세요.
        * '종료'를 입력하면 프로그램은 종료되어야 합니다. */
        while (true) {
            System.out.print("이름을 입력하세요('종료'를 입력하면 종료) : ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();

            scanner.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);
        }

        /* Q2. 상품의 가격 계산
        * 사용자로부터 상품의 가격(Price)과 수량(Quantity)를 입력받아 총 비용을 출력하는 프로그램을 작성하세요.
        * 가격과 수량을 입력받은 후에는 이들의 곱을 출력하세요. 출력 형태는 "총 비용 : [곱한 형태]"이어야 합니다.
        * -1을 입력하여 가격 종료를 합니다.
        * */
        while (true) {
            System.out.print("상품의 가격을 입력하세요(-1을 입력하면 종료) : ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요 : ");
            int quantity = scanner.nextInt();

            scanner.nextLine();
            System.out.println("총 비용 : " + (price * quantity));
        }
    }
}
