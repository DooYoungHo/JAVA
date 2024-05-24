package trianglevalidator;

public class TriangleValidator {

    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {

        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0)
            return false;

        int triangleSum = angle1 + angle2 + angle3;

        if (triangleSum == 180)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        /*
        * 코딩 예제: 유효한 삼각형인지 확인
        *
        * 삼각형의 각도를 나타내는 3개의 입력값이 주어져 있습니다.
        * 여러분은 TriangleValidator 라는 클래스 안에 있는 isValidTriangle(int angle1, int angle2, int angle3)라는 메서드를 완성해야 합니다.
        * 이 메서드는 주어진 각도들이 유효한 삼각형을 형성하면 true를, 그렇지 않으면 false 를 리턴해야 합니다.
        *
        * 유효한 삼각형이 되기 위한 조건은 다음과 같습니다.
        * 모든 각도가 양의 정수여야 합니다.
        * 모든 각도의 합이 정확히 180이어야 합니다.
        *
        * 템플릿을 사용하여, 주어진 isValidTriangle 클래스 안에 isValidTriangle 메서드를 완성하십시오
        *
        * 세부정보
        * 입력된 각도 중에 양수가 아닌 값(즉 0보다 작거나 같은 수)이 있으면 반드시 false를 리턴합니다.
        * 각도의 합을 계산하고 180과 같은지 검사합니다.
        * 모든 조건이 충족되었으면 true를 리턴하고, 그렇지 않으면 false를 리턴합니다.
        * */

        boolean result = isValidTriangle(70, 60, 100);
    }
}
