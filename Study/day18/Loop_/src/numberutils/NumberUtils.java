package numberutils;

public class NumberUtils {
    /*
    * 코딩 예제: 숫자의 마지막 자릿수 구하기
    *
    * 이 문제에서 여러분은 주어진 정수의 마지막 자릿수를 받는 Java 클래스 NumberUtils의 구현물을 완성하게 됩니다.
    * 정수 n의 마지막 자릿수는 정수의 가장 오른쪽에 있는 숫자입니다. 예를 들어 2345의 마지막 자릿수는 5이고 90의 마지막 자릿수는 0입니다.
    * 입력된 숫자가 0이면 0의 마지막 자릿수는 0이므로 0을 리턴합니다.
    * 입력값이 음수이면 이 문제에서 음수의 마지막 자릿수는 고려하지 않을 것이므로 -1을 리턴합니다.
    *
    * 과제
    * 여러분의 과제는 NumberUtils클래스 안의 getLastDigit(int number) 메서드를 구현하는 것입니다.
    * getLastDigit(int number) – 이 메서드는 하나의 매개변수 number(정수)를 받고 그 숫자의 마지막 자릿수를 받아야 합니다.
    * 만일 입력값이 음수라면 -1을 리턴해야 합니다
    * */
    public int getLastDigit(int number) {
        // Write your code here
        if (number < 0)
            return -1;

        return number % 10;
    }



    /*
    * 코딩 예제: 숫자의 자릿수 구하기
    *
    * 이번 문제에서 여러분은 주어진 정수의 자릿수를 계산하는 Java 클래스 NumberUtils의 구현물을 완성하게 됩니다.
    * 어떤 정수의 자릿수는 그 숫자에 있는 자리의 개수입니다. 예를 들어 숫자 12345에는 5개의 자리가 있고 숫자 90에는 2개의 자리가 있습니다.
    * 만일 입력값이 0이라면 1을 리턴합니다. 0은 한 자리로 간주되기 때문입니다.
    * 이 문제에서는 음수의 자릿수는 고려하지 않을 것이기 때문에 입력값이 음수일 경우에는 -1을 리턴합니다.
    *
    * 과제
    * 여러분의 과제는 NumberUtils클래스 안의 getNumberOfDigits(int number)메서드를 구현하는 것입니다.
    * getNumberOfDigits(int number)– 이 메서드는 하나의 매개변수 number(정수)를 받고 그 숫자의 자릿수를 계산해야 합니다.
    * 입력값이 음수일 경우 -1을 리턴해야 합니다.
    *
    * 알아야 할 개념들
    * 나누기(/): 프로그래밍에서 나누기는 일반적인 수학적 나누기와 비슷합니다.
    * 만일 정수를 10으로 나누면 그 숫자의 마지막 자릿수가 제거될 것입니다.
    * 예를 들면 다음과 같습니다.
    * 12345 / 10 = 1234
    * 90 / 10 = 9
    * while 반복문: while 반복문은 주어진 조건이 충족될 때까지 반복적으로 코드 블록을 실행하기 위해 사용합니다.
    * */

    /**
     * This method calculates and returns the number of digits in a given integer.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
     * @param number: an integer
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
    public int getNumberOfDigits(int number) {
        // Write your code here
        if (number < 0)
            return -1;

        int result = 0;

        do {
            result++;
            number /= 10;
        } while (number != 0);

        return result;
    }


    /*
    * 코딩 예제: 숫자의 자릿수 합계 계산하기
    *
    * 이번 예제에는 미완성된 Java 클래스 NumberUtils가 주어져 있습니다.
    * 이 클래스에는 지금 구현되지 않은 상태인 getSumOfDigits(int number)라는 메서드가 하나 있습니다.
    *
    * 여러분의 과제는 그 메서드의 구현을 완료하는 것입니다. 그 메서드는 다음과 같은 동작을 수행해야 합니다.
    * 주어진 숫자가 음수이면 메서드는 -1을 리턴해야 합니다. 음수의 자릿수 합계는 정의되지 않기 때문입니다.
    * 만일 주어진 숫자가 0이라면 메서드는 0을 리턴해야 합니다. 0의 자릿수 합계는 0이기 때문입니다.
    *
    * 주어진 숫자가 양의 정수인 경우, 메서드는 그것의 자릿수를 합산하여 리턴해야 합니다.
    *
    * 결론적으로 말하자면, getSumOfDigits메서드는 모든 정수 입력값을 처리할 수 있어야 하고,
    * 자릿수들의 합계를 리턴할 수 있어야 합니다(또는 음수인 경우 -1을 리턴). 이 메서드는 0이 유효한 입력값임을 고려해야 하고,
    * 그 경우에 0을 리턴해야 합니다. 0 의 자릿수 합계는 0이기 때문입니다.
    *
    *
    * 예시
    * 문제 설명을 더 잘 이해하기 위해 몇 가지 예를 들어보겠습니다.
    *
    * 예 1:
    * 주어진 숫자가 1234라고 가정합니다.
    * 그 숫자의 자릿수 합계는 1 + 2 + 3 + 4 = 10입니다.
    * 그러므로 만일 입력값이 1234라면 getSumOfDigits메서드는 10을 리턴해야 합니다.
    *
    * 예 2:
    * 주어진 숫자가 0이라고 가정합니다.
    * 0의 자릿수 합계는 0입니다.
    * 그러므로 만일 입력값이 0이면 getSumOfDigits메서드는 0을 리턴해야 합니다.
    *
    * 예 3:
    * 주어진 숫자가 -1234라고 가정합니다.
    * 음수의 자릿수 합계는 정의되지 않았습니다.
    * 그러므로 만일 입력값이 -1234라면 getSumOfDigits메서드는 -1을 리턴해야 합니다.
    *
    * 예 4:
    * 주어진 숫자가 999라고 가정합니다.
    * 999의 자릿수 합계는 9 + 9 + 9 = 27입니다.
    * 그러므로 만일 입력값이 999라면 getSumOfDigits메서드는 27을 리턴해야 합니다.
    *
    * 과제
    * 여러분의 과제는 NumberUtils 클래스 안에서 getSumOfDigits(int number) 메서드를 구현하는 것입니다.
    * getSumOfDigits(int number) – 이 메서드는 하나의 매개변수 number(정수)를 받고 그 숫자의 자릿수 합계를 리턴해야 합니다.
    * 만일 입력값이 음수라면 -1을 리턴해야 합니다. 만일 입력값이 0이라면 0을 리턴해야 합니다.
    * */
    public int getSumOfDigits(int number) {
        // Write your code here
        if (number < 0)
            return -1;

        int sum = 0;
        while (number > 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }



    /*
    * 코딩 예제: 숫자 역순으로 만들기
    *
    * 이번 예제에서 여러분은 NumberUtils클래스 안에서 reverseNumber메서드를 완성해야 합니다.
    * 이 메서드는 정수를 입력값으로 받고 그 숫자의 역순 숫자를 리턴합니다. 예를 들어 입력값이 123이면 이 메서드는 321을 리턴하게 됩니다.
    *
    * 이 메서드는 다음과 같은 두 가지 엣지 케이스를 처리합니다.
    * 입력값이 0일 경우, 0을 거꾸로 하면 0이므로 메서드는 0을 리턴합니다.
    * 입력값이 음수일 경우, 음수의 역순 숫자는 정의되지 않으므로 메서드는 -1을 리턴합니다.
    *
    * 예시
    * reverseNumber(123)은 321을 리턴해야 합니다.
    * reverseNumber(5497)은 7945를 리턴해야 합니다.
    * reverseNumber(-456)은 -1을 리턴해야 합니다. 음수의 역순 숫자는 정의되지 않기 때문입니다.
    * reverseNumber(0)은 0을 리턴해야 합니다. 0의 역순 숫자는 0이기 때문입니다.
    *
    * 해답의 단서
    * 숫자를 역순으로 만들기 위해 여러분은 반복적으로 마지막 자릿수를 추출하고 그걸 역순 숫자에 추가할 수 있습니다.
    * 여러분은 나머지 연산자 %를 써서 마지막 자릿수를 얻고(예, number % 10를 쓰면 마지막 자릿수가 나옵니다)
    * 정수 나누기 / 를 사용하여 그 숫자의 마지막 자릿수를 제거할 수 있습니다(예, number /= 10).
    * */

    /**
     * This method reverses a given integer and returns the reversed number.
     * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
     * If the number is zero, it returns 0 as the reverse of 0 is 0.
     * @param number: an integer
     * @return reversed number, or -1 if number is negative, or 0 if number is zero.
     */
    public int reverseNumber(int number) {
        // TODO: Write your code here
        if (number < 0)
            return -1;

        if (number == 0)
            return 0;

//        String reverseNum = "";
//        while (number > 0) {
//            reverseNum += Integer.toString(number % 10);
//            number /= 10;
//        }
//
//        return Integer.parseInt(reverseNum);

        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }
}
