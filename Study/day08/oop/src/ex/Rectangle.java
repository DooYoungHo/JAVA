package ex;

public class Rectangle {
    int width;
    int height;
    int area = 0;

    Rectangle(int width, int height) {
        this.width = width;
        this. height = height;
    }
    // 넓이
    int calculateArea() {
        area = (width * height);
        return area;
    }
    // 둘레 길이
    int calculatePerimeter() {
        return 2 * (width + height);
    }
    // 정사각형 여부
    boolean isSquare() {
        return width == height;
    }
}
