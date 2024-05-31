package nummagic;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    /*
     * 코딩 예제: 숫자의 약수를 ArrayList에 리턴하기
     * 여러분의 과제는 NumberMagic 클래스 안에서 Java 메서드 determineAllFactors(int number)를 완성하는 것입니다.
     * 이 메서드는 정수 number를 받고, 그 number의 모든 약수가 담긴 List<Integer>를 리턴해야 합니다.
     *
     * 이 메서드는 다음과 같이 작동해야 합니다.
     * 입력 인수인 정수 number를 받습니다. 이 인수는 여러분이 모든 약수를 구할 숫자를 나타냅니다.
     * 이 메서드는 number의 모든 약수를 계산해야 합니다. 약수는 다른 수로 나누어 떨어질 수 있는 정수를 가리킵니다.
     * 다시 말하자면 만일 number를 다른 숫자(가령 divisor)로 나머지 연산을 한 결과가 0과 같으면 divisor는 number의 약수입니다.
     * 이 메서드는 그러한 약수들을 List<Integer> 형태로 리턴해야 합니다.
     * 이 리스트에는 number의 약수인 모든 양수와 1, 그리고 number자체가 포함되어야 합니다.
     * 엣지 케이스에 주의하세요. 만일 number가 0 또는 음수라면 이 메서드는 빈 리스트를 리턴해야 합니다.
     *
     * */
    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {

        // TODO: Write your code here
        if (number <= 0)
            return new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                arrayList.add(i);
        }

        return arrayList;
    }


    /*
    * 코딩 예제: 지정된 한계 안에서 주어진 숫자의 배수들이 담긴 ArrayList 리턴하기
    * 여러분에게는 일부 완성된 NumberMagic 클래스가 제공되어 있습니다.
    *
    * 그 클래스에는 지정된 한계 안에서 주어진 숫자의 배수들로 된 리스트를 리턴하는
    * determineMultiples(int number, int limit) 메서드가 포함되어 있습니다.
    *
    * 여러분의 과제는 그 메서드의 구현을 완료하는 것입니다.
    *
    * 메서드의 시그니처는 다음과 같습니다.
    * public List<Integer> determineMultiples(int number, int limit
    *
    * 입력
    * 메서드는 정수 인수 2개를 받습니다.
    * number : 배수를 구할 숫자
    * limit : 배수의 상방 한계
    *
    * 출력
    * 메서드는 limit 미만에서 주어진 number의 모든 배수가 포함된 List<Integer>를 리턴해야 합니다.
    * 만일 number또는 limit가 0보다 작거나 같다면 메서드는 빈 리스트를 리턴해야 합니다.
    *
    * 예시
    * 예 1
    * number를 3으로, limit를 20으로 넣습니다. 리턴된 리스트는 [3, 6, 9, 12, 15, 18]이어야 합니다.
    *
    * 예 2
    * number를 5로, limit를 1로 넣습니다. 메서드는 빈 리스트 []를 리턴해야 합니다.
    * */


    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     *
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {

        // TODO: Write your code here
        if (number <= 0 || limit <= 0)
            return new ArrayList<>();

        if (number > limit)
            return new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; number * i < limit; i++) {
            arrayList.add(number * i);
        }

        return arrayList;
    }
}
