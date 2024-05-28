package factorial;

public class FactorialCalculator {
    /*
    * 코딩 예제: 어떤 수의 팩토리얼 계산하기
    * 이 문제에서 여러분은 주어진 수의 팩토리얼을 계산하는 Java 클래스 FactorialCalculator를 구현하게 됩니다.
    * 음수가 아닌 정수 n의 팩토리얼은 n!로 표기하고 n보다 작거나 같은 모든 양의 정수를 곱한 값입니다.
    * 다음과 같이 곱을 사용하여 팩토리얼 함수를 정의할 수 있습니다.
    *
    * n! = n * (n-1) * (n-2) * ... * 3 * 2 * 1
    *
    * 예를 들면 다음과 같습니다.
    * 4! = 4 * 3 * 2 * 1 = 24
    * 3! = 3 * 2 * 1 = 6
    * 2! = 2 * 1 = 2
    * 1! = 1
    * 0! 은 1로 정의됨
    *
    * 입력값이 음수라면 음수의 팩토리얼은 정의되어 있지 않으므로 -1을 리턴합니다.
    *
    * 과제
    *
    * 여러분의 과제는 FactorialCalculator클래스 안에 calculateFactorial(int number) 메서드를 구현하는 것입니다.
    * calculateFactorial(int number) – 이 메서드는 number(정수)라는 매개변수 하나를 받고 그 수의 팩토리얼을 계산해야 합니다.
    * 입력된 숫자가 음수라면 -1을 리턴해야 합니다.
    * */
    public int calculateFactorial(int number) {
        // Write your code here
        if (number < 0)
            return -1;

        if (number == 0)
            return 1;

        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
