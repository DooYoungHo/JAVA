package binumber;

public class BiNumber {
    /*
    * 코딩 예제: 어떤 수의 최소공배수(LCM)
    * BiNumber 클래스와 2개의 정수 속성 number1및 number2가 있습니다.
    * 여러분의 과제는 BiNumber클래스 안에서 calculateLCM() 메서드를 완성하는 것입니다.
    *
    * calculateLCM() 메서드는 number1과 number2의 최소공배수(LCM)를 계산하여 리턴해야 합니다.
    * 음수의 최소공배수는 정의되지 않으므로 number1또는 number2가 음수라면 메서드는 -1을 리턴해야 합니다.
    * 0과 다른 숫자의 최소공배수는 0이므로 number1또는 number2가 0이라면 메서드는 0을 리턴해야 합니다.
    *
    * 수학식
    * 두 정수 a와 b의 최소공배수(LCM)는 a와 b 모두에 의해 나누어 떨어지는 가장 작은 양의 정수입니다.
    * 다른 말로 하자면 a와 b의 LCM은 a와 b의 가장 작은 배수입니다.
    *
    * 예시: a가 6이고 b가 8이라면 6과 8의 LCM은 24입니다. 왜냐면 24는 6과 8의 배수인 가장 작은 숫자이기 때문입니다.
    *
    * 다른 예
    * number1이 5이고 number2가 10일 때 calculateLCM()를 호출하면 10이 리턴되어야 합니다.
    * number1이 0이고 number2가 5일 때 calculateLCM()를 호출하면 0이 리턴되어야 합니다.
    * number1이 -2이고 number2가 5일 때 calculateLCM()를 호출하면 -1이 리턴되어야 합니다.
    *
    * 논리
    * a와 b의 LCM은 언제나 a와 b의 배수입니다.
    * 먼저 a와 b의 최댓값을 구하는 방법이 있습니다. 그걸 max라고 합니다.
    * 만일 max가 a와 b로 나누어 떨어지면 max는 LCM입니다.
    * 그렇지 않을 경우, 우리는 while 반복문을 사용하여 max의 배수가 a와 b에 의해 모두 나누어 떨어지는지 검사할 수 있습니다.
    *
    * 단계별 예시
    * 다음은 단계별 예시입니다.
    * number1= 5, number2= 10일 경우:
    * number1과 number2의 최댓값은 10입니다. 그러므로 lcm = 10부터 시작합니다.
    * 10은 5와 10으로 모두 나누어 떨어지므로 lcm = 10은 5와 10의 LCM입니다.
    *
    * number1= 6, number2= 8인 경우:
    * number1과 number2의 최댓값은 8입니다. 그러므로 lcm = 8부터 시작합니다.
    * 8은 6으로 나누어 떨어지지 않습니다.
    *
    * lcm을 8(max)만큼 증가시켜 lcm = 16을 얻습니다.
    * 16은 6과 8로 나누어 떨어지지 않습니다. 그러므로 lcm을 8만큼 증가시켜 lcm = 24를 얻습니다.
    * 24는 6과 8로 모두 나누어 떨어지므로 lcm = 24가 6과 8의 LCM입니다.
    * */
    private int number1;
    private int number2;

    /**
     * Constructor that initializes the two numbers.
     * @param number1: The first number.
     * @param number2: The second number.
     */
    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * Getter for the first number.
     * @return the first number.
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * Getter for the second number.
     * @return the second number.
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Calculates and returns the least common multiple (LCM) of the two numbers.
     * If either number is negative, returns -1 as the LCM for negative numbers is undefined.
     * If either number is zero, returns 0 as the LCM of 0 and any other number is 0.
     * @return LCM of the two numbers, or -1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateLCM() {
        // TODO: Write your code here
        if (number1 < 0 || number2 < 0)
            return -1;

        if (number1 == 0 || number2 == 0)
            return 0;

        int max = 0;
        int multiple = 1;
        while (true) {
            /* max 값 구하기 */
            if (number1 > number2) {
                max = number1;
                if ((max * multiple) % number2 == 0)
                    return max * multiple;
                multiple++;
            }
            else {
                max = number2;
                if ((max * multiple) % number1 == 0)
                    return max * multiple;
                multiple++;
            }
        }
    }





    /*
    * 코딩 예제: 어떤 수의 최대공약수(GCD)
    * 이번 과제에서 여러분에게는 두 정수의 최대공약수(GCD)를 계산하는 미완성인 Java 프로그램 BiNumber가 주어져 있습니다.
    * 두 수의 최대공약수는 그 두 수를 나머지 없이 나누는 가장 큰 수입니다.
    *
    * BiNumber클래스는 2개의 정수를 나타내는 2개의 프라이빗 필드 number1과 number2와 함께 이미 정의되어 있습니다.
    * 새로운 BiNumber를 생성하는 생성자와 number1과 number2의 게터 메서드들도 제공되어 있습니다.
    * 여러분의 과제는 number1과 number2의 GCD를 리턴하는 calculateGCD() 메서드를 완성하는 것입니다.
    *
    * 최대공약수(GCD)란 무엇일까요?
    * 두 수의 GCD는 다음과 같이 해서 구할 수 있습니다.
    * 각각의 수의 모든 약수들로 이루어진 리스트를 만듭니다.
    * 두 리스트에 모두 나온 가장 큰 수를 구합니다.
    * 예를 들어 48과 18의 GCD를 구하려고 한다면
    * 48의 약수는 1, 2, 3, 4, 6, 8, 12, 16, 24, 48입니다.
    * 18의 약수는 1, 2, 3, 6, 9, 18입니다.
    *
    * 공통 약수(공약수)는 1, 2, 3, 6입니다.
    * 그러므로 최대공약수(GCD)는 6입니다.
    * 위와 비슷하게, 20과 15의 GCD는 다음과 같이 구할 수 있습니다.
    * 20의 약수는 1, 2, 4, 5, 10, 20입니다.
    * 15의 약수는 1, 3, 5, 15입니다.
    * 공통 약수(공약수)는 1, 5입니다.
    * 그러므로 최대공약수(GCD)는 5입니다.
    *
    *
    * 구현 가이드
    * calculateGCD() 메서드는 먼저 엣지 케이스를 처리해야 합니다.
    * 만일 number1또는 number2가 0이라면 메서드는 즉시 0을 리턴해야 합니다. 0과 다른 수의 GCD는 0이기 때문입니다.
    * 만일 number1또는 number2가 음수라면 메서드는 즉시 1을 리턴해야 합니다. 음수의 GCD는 1이기 때문입니다.
    * 만일 number1과 number2가 같다면 메서드는 즉시 number1(또는 number2)를 리턴해야 합니다. 두 같은 수의 GCD는 그 숫자 자체이기 때문입니다.
    * 다음으로, GCD를 구하기 위한 논리를 구현합니다. 가장 쉬운 방법은 두 수 중 작은 수를 찾는 것입니다.
    * 작은 수로부터 1까지 반복하면서 각각의 수가 number1과 number2모두의 약수인지 검사합니다. 이 기준을 충족하는 첫 번째 수가 GCD입니다.
    * 마지막으로 메서드는 GCD를 리턴해야 합니다.
    * */

    /**
     * Calculates and returns the greatest common divisor (GCD) of the two numbers.
     * Edge case: If either number is negative, returns 1 as the GCD for negative numbers is 1.
     * Edge case: If either number is zero, returns 0 as the GCD of 0 and any other number is 0.
     * Edge case: If two numbers are equal, returns the number as the GCD of two equal numbers is the number itself.
     * @return GCD of the two numbers, or 1 if either number is negative, or 0 if either number is zero.
     */
    public int calculateGCD() {
        // Write your code here
        if (number1 < 0 || number2 < 0)
            return 1;

        if (number1 == 0 || number2 == 0)
            return 0;

        if (number1 == number2)
            return number1;

        int min = Math.min(number1, number2);
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
            if (number1 % i == 0 && number2 % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
