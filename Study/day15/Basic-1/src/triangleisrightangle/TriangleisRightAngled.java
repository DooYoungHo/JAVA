package triangleisrightangle;

public class TriangleisRightAngled {

    public static boolean isRightAngled(int side1, int side2, int side3) {
        // write your code
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            return false;

        // 변들의 모든 조합을 검사해야한다.
        boolean result1 = (side1 * side1) + (side2 * side2) == (side3 * side3);
        boolean result2 = (side2 * side2) + (side3 * side3) == (side1 * side1);
        boolean result3 = (side1 * side1) + (side3 * side3) == (side2 * side2);

        if (result1 || result2 || result3)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        /*
        * 코딩 예제: 직각삼각형일까요?
        * 미완성인 메서드 sRightAngled(int side1, int side2, int side3)이 있는 클래스 TriangleValidator가 제공되어 있습니다.
        * 이 메서드는 삼각형의 변의 길이를 나타내는 3개의 정수 값을 받아야 합니다.
        * 여러분의 과제는 메서드를 완성하여 주어진 변들로 된 삼각형이 직각삼각형인지 판정하는 것입니다.
        * 메서드는 만일 삼각형이 직각삼각형이면 true를, 그렇지 않으면 false를 리턴해야 합니다.
        * 직각삼각형에서 빗변(직각 반대쪽에 있는 변)의 길이의 제곱은 다른 두 변의 길이의 제곱들을 합한 값과 같습니다.
        * 이는 피타고라스의 정리로 알려져 있습니다.
        * 어느 한 변의 길이가 음수라면 유효한 삼각형으로 간주되지 않습니다.
        *
        * 지침
        * TriangleValidator클래스부터 시작합니다. 이 클래스 안에 메서드 isRightAngled(int side1, int side2, int side3)이 있습니다.
        * 여러분의 첫 번째 과제는 변의 길이를 검증하는 것입니다. 어느 한 변의 길이가 0보다 작거나 같으면 false를 리턴합니다.
        * 다음으로 피타고라스의 정리를 적용하여 삼각형이 직각삼각형인지 판정합니다. 변들의 모든 조합을 검사해야 한다는 점을 잊지 마세요.
        * 어떤 변들의 조합에 피타고라스의 정리가 적용되면, true를 리턴합니다. 이는 그 삼각형이 직각삼각형이라는 의미입니다.
        * 만일 피타고라스의 정리가 어떤 변들의 조합에 적용되지 않으면, false를 리턴합니다. 이는 그 삼각형이 직각삼각형이 아니라는 의미입니다.
        * */

        boolean result = isRightAngled(10,20,30);
        System.out.println(result);
    }
}
