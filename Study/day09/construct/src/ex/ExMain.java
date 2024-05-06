package ex;

public class ExMain {
    public static void main(String[] args) {
        /* Q1. Book & 생성자
        * Book 클래스를 완성하세요.
        * */
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
        book3.displayInfo();
    }
}
