package sumofsquares;

public class SumOfSquares {

    public static long calculateSumOfSquares(int n) {
        // write your code here
        if (n < 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }

        return sum;
    }

    public static void main(String[] args) {

        /*
        * 코딩 예제: 첫 숫자 N개의 제곱의 합
        * 정수 n이 제공되어 있습니다.
        * 여러분의 과제는 클래스 SumOfSquares에서 메서드 calculateSumOfSquares를 구현해서
        * n (포함)까지 양의 정수의 제곱의 합계를 리턴하는 것입니다.
        *
        * 예를 들어, 만일 n = 3이라면 메서드는 합계 1^2 + 2^2 + 3^2 = 14를 리턴해야 합니다.
        * 만일 n이 0보다 작다면 메서드는 -1을 리턴해야 합니다.
        *
        * 지침
        * 제공된 미완성인 코드 안에는 SumOfSquares라는 클래스와 메서드 시그니처 public long calculateSumOfSquares(int n)이 있습니다.
        * 이 메서드를 완성하여 n까지 모든 양수의 제곱의 합을 계산합니다. 만일 n이 0보다 작다면 -1을 리턴합니다.
        * 코드에서 아무것도 프린트하지 마십시오. 메서드는 합계 또는 -1을 리턴해야 합니다.
        * */

        long result = calculateSumOfSquares(10);
    }
}
