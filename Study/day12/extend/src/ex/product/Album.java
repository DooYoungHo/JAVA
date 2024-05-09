package ex.product;

public class Album extends Item {

    String artist;

    public Album(String name, int price, String artist) {
        super.name = name;
        super.price = price;
        this.artist = artist;
    }

    // 오버라이딩해서 사용할 수 있음
    public void print() {
        System.out.println("이름 : " + super.name + ", 가격 : " + super.price);
        System.out.println("- 아티스트 : " + artist);
    }

    // 오버라이딩해서 사용할 수 있음
    public int getPrice() {
        return price;
    }
}
