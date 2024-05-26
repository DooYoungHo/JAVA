package square;

public class Square {
    /*
    * 코딩 예제: Square 클래스 만들기
    * 이번 예제에서 여러분은 Square 라는 이름의 Java 클래스를 구현합니다.
    * 이 클래스는 기하학적 도형인 정사각형을 모델링하는 클래스입니다.
    *
    * 객체 Square는 정사각형의 한 변의 길이를 나타내는 프라이빗 인스턴스 변수인 side(타입은 int)를 갖습니다.
    * Square 클래스에는 정수 인수를 받는 생성자를 갖습니다. 그 인수를 이용하여 side 속성을 초기화해야 합니다.
    *
    * 이 클래스는 다음과 같은 2개의 메서드도 갖습니다.
    * calculateArea():이 메서드는 정사각형의 면적을 계산하여 리턴합니다.
    * 정사각형의 면적은 “변의 길이 * 변의 길이”라는 공식으로 주어집니다.
    * 그러나 실제 세계에서 정사각형의 한 변의 길이가 0이나 음수일 수 없습니다.
    * 그러므로 만일 side가 0보다 작거나 같으면 이 메서드는 -1을 리턴하여 유효하지 않은 값임을 나타내야 합니다.
    *
    * calculatePerimeter(): 이 메서드는 정사각형의 둘레를 계산하여 리턴합니다.
    * 정사각형의 둘레의 길이는 “4 * 변의 길이”라는 공식으로 주어집니다.
    * 위와 유사하게 만일 side가 0보다 작거나 같으면 이 메서드는 -1을 리턴하여 유효하지 않은 값임을 나타내야 합니다.
    *
    * 여러분의 과제는 생성자와 이 2개의 메서드의 구현을 완료하는 것입니다.
    *
    * 지침
    * 생성자 Square 구현. 이 생성자는 정수 인수를 받고 속성 side를 그 인수 값으로 초기화해야 합니다.
    * calculateArea() 메서드 구현. 만일 속성 side가 0보다 작거나 같으면 -1을 리턴합니다.
    * 그렇지 않으면 공식(변의 길이 * 변의 길이)을 사용하여 정사각형의 면적을 계산하여 리턴합니다.
    *
    * calculatePerimeter() 메서드 구현. 만일 속성 side가 0보다 작거나 같다면 -1을 리턴합니다.
    * 그렇지 않다면 공식(4 * 변의 길이)을 이용하여 정사각형의 둘레를 계산하여 리턴합니다.
    * */
    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        if (side <= 0) {
            return -1;
        }
        else {
            return side * side;
        }
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        if (side <= 0) {
            return -1;
        }
        else {
            return 4 * side;
        }
    }
}
