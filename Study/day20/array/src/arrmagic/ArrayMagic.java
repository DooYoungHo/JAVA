package arrmagic;

public class ArrayMagic {

    /*
    * 코딩 예제: 두 번째로 큰 요소 찾기
    *
    * 이번 프로그래밍 챌린지에서는 ArrayMagic 클래스 안의
    * findSecondLargestElement(int[] array)라는 미완성된 Java 메서드가 제공되어 있습니다.
    *
    * 이 메서드는 정수 배열을 받아서 그 배열에서 두 번째로 큰 요소를 리턴합니다.
    *
    * 배열에 있는 고유한 요소가 2개보다 적으면 메서드는 -1을 리턴해야 합니다.
    * 예를 들어 만일 모든 요소가 같거나 배열에 요소가 1개만 있어서 두 번째로 큰 요소가 없으면 메서드는 -1을 리턴해야 합니다.
    *
    * 지침
    * 먼저 findSecondLargestElement(int[] array) 메서드의 기존 구조를 이해합니다.
    * 이 메서드는 정수 배열을 인수로서 받고 리턴 타입이 정수인 것을 알 수 있습니다.
    *
    * 배열에서 두 번째로 큰 숫자를 구하는 논리를 구현해야 합니다.
    * 만일 두 번째로 큰 숫자가 없다면 -1을 리턴합니다(예를 들어 모든 요소가 같거나 배열에 있는 요소가 2개 미만인 경우).
    * 구분되는 요소가 2개 이상 있다면 여러분은 두 번째로 큰 요소를 찾아야 합니다.
    * 그렇게 하려면 배열을 반복하고 각각의 요소를 현재의 가장 큰 요소 및 두 번째로 큰 요소와 비교합니다.
    * 잊지 말고 그 2개의 추적 변수를 적절히 초기화하십시오.
    *
    * 마지막으로 두 번째로 큰 요소를 리턴하거나 두 번째로 큰 요소가 없다면 -1을 리턴합니다.
    * 다음과 같은 엣지 케이스를 고려하십시오.
    * 예를 들어, 배열의 모든 요소가 같다면 어떻게 될까요?
    * 배열에 요소가 2개 미만이라면 어떻게 될까요?
    * */

    /**
     * This method finds and returns the second largest element in the given array.
     *
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */

    public static int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        //1, 2, 3, 4, 5
        //1, 2, 4, 3, 5
        if (array.length < 2)
            return -1;

        int max = array[0];
        int secondMax = -1;

        for (int value : array) {
            if (value > max) {
                secondMax = max;
                max = value;
            }
            else if (value > secondMax &&
                        value != max) {
                secondMax = value;
            }
        }

        return secondMax;
    }




    /*
    * 코딩 예제: 배열이 정렬되어 있는지 검사하기
    * 여러분에게 ArrayMagic 클래스 안의 미완성된 Java 메서드인 isSorted()가 제공됩니다.
    *
    * 그 메서드는 정수 배열을 입력값으로 받고 만일 배열이 오름차순으로 정렬되어 있다면 true를 리턴하고 그렇지 않다면 false를 리턴할 것입니다.
    * 그 메서드는 다음과 같은 엣지 케이스를 처리해야 합니다.
    *
    * 배열이 비어 있거나 요소가 하나만 있다면 그런 배열들은 정렬된 것으로 간주되므로 메서드는 true를 리턴해야 합니다.
    * 배열에 음수와 0이 포함될 수 있습니다.
    * 배열에 중복된 요소들이 포함될 수 있습니다.
    *
    * 예시
    * 배열 [1, 2, 3, 4, 5]를 예로 들어 살펴볼까요?
    * 이 배열을 우리의 isSorted() 메서드에 제공하면 배열이 오름차순으로 정렬되어 있으므로 true를 리턴해야 합니다.
    * 이제 요소가 [5, 4, 3, 2, 1]인 배열을 생각해 보겠습니다.
    * 이 배열의 요소들은 내림차순입니다.
    * 그러므로 만일 우리가 이 배열을 우리의 isSorted() 메서드에 제공하면 false를 리턴해야 합니다.
    * */
    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public static boolean isSorted(int[] array) {
        // TODO: Write code here
        if (array.length <= 1)
            return true;

        int sorted = array[0];

        for (int i = 1; i < array.length; i++) {
            if (sorted <= array[i])
                sorted = array[i];
            else
                return false;
        }

        return true;
    }




    /*
    * 코딩 예제: 배열 역순으로 바꾸기
    * 이번 과제에서 여러분의 목표는 Java 클래스 ArrayMagic안의 reverseArray(int[] array) 메서드를 완성하는 것입니다.
    * 이 메서드는 정수로 된 배열을 받고, 입력된 배열이 담겨 있으나 순서가 역순인 배열을 리턴해야 합니다.
    *
    * 지침
    * 여러분의 과제는 reverseArray메서드를 구현하는 것입니다. 그러려면 다음을 해야 합니다.
    * 포인터 2개를 정의합니다.
    * 이름을 각각 start와 end라고 합니다. start포인터는 배열의 첫 번째 요소를 지시해야 하고 end포인터는 마지막 요소를 지시해야 합니다.
    *
    * 역순으로 된 요소들을 저장하기 위해 새로운 배열을 만듭니다. 그 배열을 reversedArray라고 할 수 있습니다.
    * 양쪽 끝(start및 end)에서 시작하여 중간으로 이동하면서 입력된 배열을 반복합니다.
    * 입력된 배열의 end인덱스에서 요소를 reversedArray의 start인덱스에 복사해 넣습니다.
    * 입력된 배열의 start 인덱스에서 요소를 복사하여 reversedArray의 end인덱스에 넣습니다.
    * 배열의 끝을 향해start포인터를 한 단계 이동합니다.
    * 배열의 시작을 향해 end포인터를 한 단계 이동합니다.
    * 입력된 배열의 모든 요소가 처리되면 reversedArray에는 입력된 배열의 요소들이 역순으로 담겨 있을 것입니다.
    * 이때 메서드는 reversedArray를 리턴해야 합니다.
    *
    * 엣지 케이스
    *
    * reversedArray 메서드는 몇 가지 엣지 케이스를 처리할 수 있어야 합니다.
    * 입력된 배열이 비어 있으면(즉 배열의 길이가 0이면) 메서드는 빈 배열을 리턴해야 합니다.
    * 입력된 배열에 요소가 하나뿐이면 메서드는 다시 그 배열을 리턴해야 합니다.
    *
    * 예시
    *
    * 그럼 몇 가지 예를 통해 reversedArray메서드가 어떻게 작동해야 하는지 보여 드리겠습니다.
    * 예 1:
    * 입력: [1, 2, 3, 4]
    * 출력: [4, 3, 2, 1]
    * 설명: 입력된 배열에 4개의 요소가 있습니다. 역순 배열에는 그 요소들이 역순으로 담겨 있어야 합니다.
    *
    * 예 2:
    * 입력: [5, -10, 15, -20]
    * 출력: [-20, 15, -10, 5]
    * 설명: 입력된 배열에는 양수와 음수가 포함된 4개의 요소가 있습니다. 역순 배열에는 그 요소들이 역순으로 담겨 있어야 합니다.
    *
    * 예 3:
    * 입력: [100, 200, 300, 400, 500]
    * 출력: [500, 400, 300, 200, 100]
    * 설명: 입력된 배열에는 5개의 요소가 있습니다. 역순 배열에는 그 요소들이 역순으로 담겨 있어야 합니다.
    *
    * 그럼 행운을 빕니다!
    * */

    /**
     * This method reverses an array.
     *
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {

        // TODO: Write your code here
        if (array.length == 0)
            return new int[]{};

        if (array.length == 1)
            return array;

        int[] reverseArr = new int[array.length];
        int idx = 0;

        for (int i = (array.length - 1); i >= 0; i--) {
            reverseArr[idx++] = array[i];
        }

        return reverseArr;
    }
}
