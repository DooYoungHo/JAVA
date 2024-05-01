package scanner.ex;
import java.util.Scanner;

public class ScannerEx_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Q1. 사용자로부터 여러 개의 숫자를 입력받고, 그 숫자들의 합과 평균을 계산하는 프로그램을 작성하세요.
        * 사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 종료합니다.
        * 모든 숫자의 입력이 끝난 후에는, sum 과 average 를 출력하세요. 평균은 소숫점 아래까지 계산하여야 합니다.
        * */
        int sum = 0;
        int count = 0;
        double average = 0.0;

        while (true) {
            System.out.print("숫자를 입력하세요. 중단하고 싶으시면 -1을 입력해주세요 : ");
            int intValue = scanner.nextInt();

            if (intValue == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += intValue;
            count++;
        }
        average = (double) sum / count;

        System.out.println("SUM = " + sum + ", AVERAGE = " + average);

        /* Q2. 상품 구매
        * 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요.
        * 사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램은 언제든지 종료 할 수 있어야 합니다.
        * 사용자에게 다음 세 가지 옵션을 제공해야 합니다.
        * - 1: 상품 입력
        * - 2: 결제
        * - 3: 프로그램 종료
        * 옵션은 정수로 받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
        * 상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력 받으세요.
        * 결제 옵션을 선택하면, 총 비용을 출력하고, 총 비용을 0으로 초기화 하세요. (사용자가 총 비용을 확인하고, 결제를 확인했다고 가정)
        * 프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다" 라는 메시지를 출력하고, 프로그램을 종료하세요.
        * 위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요." 라는 메시지를 출력해주세요.
        * */

        int totalPrice = 0;
        while (true) {
            int optionPrice = 0;
            System.out.println("옵션을 선택하세요. 1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (option == 1) {
                System.out.print("상품명을 입력하세요 : ");
                String product = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                int price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                int num = scanner.nextInt();
                optionPrice += (price * num);
                totalPrice += optionPrice;
                System.out.println("상품명 : " + product + ", 가격 : " + price + ", 수량 : " + num + ", 합계 : " + optionPrice);
            }
            else if (option == 2) {
                System.out.println("총 비용 : " + totalPrice);
                totalPrice = 0;
            }
            else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
