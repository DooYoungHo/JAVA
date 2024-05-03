package ex;

public class ClassEx_ {

    public static void main(String[] args) {
        /* Q1. MovieReview 클래스를 생성해서 영화 리뷰 정보를 관리해보자 */
        MovieReview movie = new MovieReview("전우", "정말 재밌습니다.");
        MovieReview movie2 = new MovieReview("범죄도시4", "장이수 없는 범죄도시는 생각하기도 싫습니다!");

        /* Q2. MovieReview 클래스 객체에 배열을 도입하고 출력할 때 for 루프를 활용하자 */
        MovieReview[] movies = new MovieReview[]{movie, movie2};
        for (MovieReview m : movies) {
            System.out.println("제목 : " + m.title + " 리뷰 : " + m.review);
        }

        /* Q3. 상품 주문 시스템 개발
        * 당신은 온라인 상점의 주문 관리 시스템을 만드려고 한다.
        * 먼저, 상품 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자
        *
        * 요구 사항
        * 1. ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
        *   - 상품명 (ProductName)
        *   - 가격 (Price)
        *   - 주문 수량 (Quantity)
        * 2. 여러 상품의 주문 정보를 배열로 관리하고, 그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자
        * */
        ProductOrder order1 = new ProductOrder("사과",2000,3);
        ProductOrder order2 = new ProductOrder("파인애플", 3000,5);
        ProductOrder order3 = new ProductOrder("당근", 5000, 10);

        ProductOrder[] orders = {order1, order2, order3};

        int allPrice = 0;
        for (ProductOrder p : orders) {
            System.out.println("상품 : " + p.productName + ", 가격 : " + p.price + ", 수량 : " + p.quantity);
            allPrice += (p.price * p.quantity);
        }
        System.out.println("총 결제 금액 : " + allPrice);
    }
}
