package dimension;

public class Dimension {

    /*
    * 코딩 예제: 인치를 객체로(피트, 인치)
    * 이 문제에서 여러분은 측정치를 피트와 인치로 나타내는 Java Dimension 클래스 구현물을 완성해야 합니다.
    * 다음은 Dimension 클래스의 기본 골격입니다.
    *
    * 과제
    * 여러분의 과제는 Dimension(int inches)생성자와 Dimension 클래스 안의 getFeet()및 getInches() 메서드를 구현하는 것입니다.
    * Dimension(int inches)- 이 생성자는 inches(정수)라는 매개변수 하나를 받고, 주어진 인치를 피트와 인치로 변환해야 합니다.
    * 입력된 인치가 0보다 작으면 피트와 인치를 -1로 설정해서 유효하지 않은 입력임을 나타내야 합니다. 1피트는 12인치와 같습니다.
    *
    * getFeet() - 이 메서드는 생성자로부터 계산한 피트를 리턴해야 합니다.
    * getInches() - 이 메서드는 나머지 인치 수(12 미만)를 생성자로부터 리턴해야 합니다.
    * */

    private int feet;
    private int inches;

    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
        if (inches < 0) {
            this.feet = -1;
            this.inches = -1;
        }
        else {
            this.feet = inches / 12;
            this.inches = inches % 12;
        }
    }

    public int getFeet() {
        // TODO: Return the value of feet.
        return this.feet;
    }

    public int getInches() {
        // TODO: Return the value of inches.
        return this.inches;
    }
}
