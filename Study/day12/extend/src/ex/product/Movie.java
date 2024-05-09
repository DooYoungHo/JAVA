package ex.product;

public class Movie extends Item {

    String director;
    String actor;

    public Movie(String name, int price, String director, String actor) {
        super.name = name;
        super.price = price;
        this.director = director;
        this.actor = actor;
    }

    // 오버라이딩해서 사용할 수 있음
    public void print() {
        System.out.println("이름 : " + super.name + ", 가격 : " + super.price);
        System.out.println("- 감독 : " + director + ", 배우 : " + actor);
    }

    // 오버라이딩해서 사용할 수 있음
    public int getPrice() {
        return price;
    }
}
