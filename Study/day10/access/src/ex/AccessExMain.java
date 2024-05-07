package ex;
import ex.counter.MaxCounter;
import ex.shopping.*;

public class AccessExMain {
    public static void main(String[] args) {
        /* Q1. 최대 카운터와 캡슐화
        * MaxCounter 클래스를 만드세요.
        * 이 클래스는 최대값을 지정하고, 최대값 까지만 증가하는 기능을 제공합니다.
        * - int count : 내부에서 사용하는 숫자로 초기값은 0
        * - int max : 최대값
        * - increment() : 숫자를 하나씩 증가
        * - getCount() : 지금까지의 숫자를 확인
        *
        * 요구사항
        *   - 접근 제어자를 사용해서 데이터를 캡슐화 하세요
        *   - 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
        * */
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);

        /* Q2. 쇼핑 카트
        * Item, ShoppingCart 클래스를 완성하세요.
        *
        * 요구사항
        *   - 접근 제어자를 사용해서 데이터를 캡슐화 하세요.
        *   - 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
        *   - 장바구니에는 상품을 최대 10개만 담을 수 있습니다.
        *       - 10개 초과 등록시 : "장바구니가 가득 찼습니다" 출력
        * */
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000,4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();

    }
}
