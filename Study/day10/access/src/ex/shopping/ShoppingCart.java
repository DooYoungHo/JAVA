package ex.shopping;

public class ShoppingCart {

    private Item[] items;
    private int totalAmount = 0;
    private int cartCount = 0;

    // 카트에 10개 담을 수 있는 생성자
    public ShoppingCart() {
        items = new Item[10];
    }
    // 카트 담기
    public void addItem(Item item) {
        if (cartCount == 10)
            System.out.println("장바구니가 가득 찼습니다...!");
        else {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    cartCount++;
                    items[i] = item;
                    return;
                }
            }
        }
    }
    // 현재 아이템 보여주기
    public void displayItems() {
        for (int i = 0; i < cartCount; i++) {
            totalAmount += (items[i].quantity * items[i].price);
            System.out.println("상품명 : " + items[i].product + ", 합계 : " + (items[i].quantity * items[i].price));
        }
        System.out.println("전체 가격 합 : " + totalAmount);
    }
    // private calculate 메서드를 추가해서 내부에서만 사용할 수 있게 코딩했으면 더욱 좋았을 듯!
    // 메서드의 각 기능은 너무 여러기능이 아닌 각 기능을 충분히 이행 할 수 있어야함!
    // private int calculateTotalPrice()
}
