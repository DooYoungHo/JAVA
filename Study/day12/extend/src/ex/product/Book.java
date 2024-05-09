package ex.product;

public class Book extends Item {

    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn) {
        super.name = name;
        super.price = price;
        this.author = author;
        this.isbn = isbn;
    }
    // 오버라이딩해서 사용할 수 있음
    public void print() {
        System.out.println("이름 : " + super.name + ", 가격 : " + super.price);
        System.out.println("- 저자 : " + author + ", isbn : " + isbn);
    }

    // 오버라이딩해서 사용할 수 있음
    public int getPrice() {
        return super.price;
    }
}
