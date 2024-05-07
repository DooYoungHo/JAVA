package ex.shopping;

public class Item {
    String product;
    int price;
    int quantity;

    public Item(String product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    // 또한 이 클래스도 필드값은 특별한 사유가 있지 않는 한 private 을 사용해야함
    // 그러기 때문에 다른 곳에서 가져다 쓰기 위해 getName 등 메서드를 작성해주면 좋았을 듯!
    // public String getProductName() , public int getTotalPrice() 이렇게!
}
