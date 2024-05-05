package ex;
import java.util.Scanner;

public class ValueEx_ {
    public static void main(String[] args) {
        /* Q1. 앞서 만들었던 "ProductOrderMain" 클래스에 있는 상품 주문 시스템을 리펙토링 하자
        * 당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
        * 먼저, 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들자
        *
        * 요구사항 : ProductOrder 클래스는 다음과 같은 필드를 참조한다.
        *   - productName : 상품명
        *   - price : 가격
        *   - quantity : 수량
        *
        * 다음으로 ProductOrderMain2 클래스 안에 Main() 메서드를 포함하여, 여러 상품의 주문 정보를
        * 배열로 관리하고, 그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자. 이 클래스에서는 다음과 같은
        * 메서드를 포함해야 합니다.
        * static ProductOrder createOrder(String productName, int price, int quantity)
        *   - ProductOrder 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 ProductOrder 를 반환해야합니다.
        * static void printOrders(ProductOrder[] orders)
        *   - 배열을 받아서 배열에 들어있는 전체 ProductOrder 의 상품명, 가격, 수량을 출력합니다.
        * static void getTotalAmount(ProductOrder[] orders)
        *   - 배열을 받아서 배열에 들어있는 전체 ProductOrder 의 총 결제 금액을 계산하고, 계산 결과를 반환합니다.
        * */
        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라", 1500, 2);

        ProductOrder[] orders = {order1, order2, order3};
        printOrders(orders);
        getTotalAmount(orders);


        /* Q2. 상품 주문 시스템 개발 - 사용자 입력
        * 앞서 만든 상품 주문 시스템을 사용자 입력 받도록 개선해보자
        * 요구사항
        *   - 주문 수량을 입력받자
        *       - 예) 입력할 주문의 개수를 입력하세요
        *   - 가격, 수량, 상품명을 입력받자
        *       - 입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요" 라는 메시지를 출력하세요
        *   - 입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int count = scanner.nextInt();
        scanner.nextLine();     // 개행 문자 초기화
        ProductOrder[] newOrders = userCreateOrder(count, scanner);
        printOrders(newOrders);
        getTotalAmount(newOrders);

    }
    // Q1 - Method
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder newOrder = new ProductOrder();
        newOrder.productName = productName;
        newOrder.price = price;
        newOrder.quantity = quantity;
        return newOrder;
    }
    // Q1 - Method
    static void printOrders(ProductOrder[] orders) {
        if (orders == null)
            System.out.println("주문 내역이 없습니다...!");
        else {
            for (ProductOrder order : orders) {
                System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            }
        }
    }
    // Q1 - Method
    static void getTotalAmount(ProductOrder[] orders) {
        int amount = 0;

        if (orders == null) {
            System.out.println("주문 내역이 없습니다...!");
        }
        else {
            for (ProductOrder order : orders)
                amount += (order.price * order.quantity);
            System.out.println("총 결제 금액 : " + amount);
        }
    }

    // Q2 - Method
    static ProductOrder[] userCreateOrder(int productCount, Scanner scanner) {
        ProductOrder[] newOrder = new ProductOrder[productCount];
        for (int i = 0; i < newOrder.length; i++) {
            newOrder[i] = new ProductOrder();
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");
            System.out.print("상품명 : ");
            newOrder[i].productName = scanner.nextLine();
            System.out.print("가격 : ");
            newOrder[i].price = scanner.nextInt();
            System.out.print("수량 : ");
            newOrder[i].quantity = scanner.nextInt();
            scanner.nextLine();
        }
        return newOrder;
    }
}
