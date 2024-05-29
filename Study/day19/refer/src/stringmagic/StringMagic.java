package stringmagic;

public class StringMagic {
    /*
    * 코딩 예제: 문자열의 대문자 개수 세기
    * 여러분의 과제는 countUppercaseLetters라는 이름의 Java 메서드를 완성하는 것입니다.
    * 이 메서드는 문자열을 입력값으로 받아서 그 문자열에 있는 대문자의 개수를 리턴합니다. 이 메서드는 StringMagic클래스의 일부분입니다.
    *
    * 잊지 말고 다음과 같은 엣지 케이스를 고려하시기 바랍니다.
    * 문자열이 비어 있을 경우, 메서드는 0을 리턴해야 합니다.
    *
    * 문자열에 대문자가 없을 경우에도 메서드는 0을 리턴해야 합니다.
    * */

    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        if (str.isEmpty())
            return 0;

        int upperCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                upperCase++;
        }

        return upperCase;
    }





    /*
    * 코딩 예제: 문자열에 2개의 연속된 동일한 문자가 있는지 검사하기
    *
    * 여러분의 과제는 StringMagic클래스 안에서 hasConsecutiveDuplicates메서드를 완성하는 것입니다.
    * 이 메서드는 주어진 문자열에 2개의 연속된 동일한 문자가 있는지 검사해야 합니다.
    *
    * 이 메서드의 시그니처는 다음과 같습니다.
    *
    * public boolean hasConsecutiveDuplicates(String str) 여기에서
    * str은 길이가 n인 문자열입니다(0 ≤ n ≤ 1000). 이 문자열에는 프린트 가능한 ASCII 문자가 포함되어 있을 수 있습니다.
    * 이 메서드는 문자열에 2개의 연속된 동일한 문자가 있는 경우에는 true를, 그렇지 않은 경우에는 false를 리턴해야 합니다.
    *
    * 예시
    *
    * 다음은 hasConsecutiveDuplicates 메서드의 동작을 보여주는 몇 가지 예입니다.
    * 가령 문자열 “Hello”가 있다면 문자 ‘l’이 2개 연속 있으므로 여러분의 메서드는 true를 리턴해야 합니다.
    * 가령 문자열 “World”가 있다면 2개의 연속된 동일한 문자가 없으므로 여러분의 메서드는 false를 리턴해야 합니다.
    * 가령 비어 있는 문자열 ""가 있다면, 여러분의 메서드는 false를 리턴해야 합니다.
    * 가령 단일 문자 "H"로 된 문자열이 있다면 여러분의 메서드는 false를 리턴해야 합니다.
    * 다수의 동일한 문자가 있는 문자열 "HHH"가 있다면 연속된 문자 ‘H’가 여럿 있으므로 여러분의 메서드는 true를 리턴해야 합니다.
    * */

    public boolean hasConsecutiveDuplicates(String str) {
        // TODO: Write your code here
        if (str.isEmpty())
            return false;

        char duple;

        for (int i = 0; i < str.length(); i++) {
            if ( i == (str.length() - 1))
                return false;
            else {
                duple = str.charAt(i);
                if (duple == str.charAt(i + 1))
                    return true;
            }
        }

        return false;
    }




    /*
    * 코딩 예제: 문자열의 가장 오른쪽에 있는 숫자 구하기
    *
    * 여러분의 과제는 StringMagic클래스 안에서 getRightmostDigit메서드를 완성하는 것입니다.
    * 이 메서드는 문자열을 인수로 받고 문자열의 가장 오른쪽에 있는 숫자를 리턴해야 합니다.
    *
    * 지침
    * getRightmostDigit메서드는 문자열 str을 인수로 받습니다.
    * 이 문자열에는 숫자, 글자, 특수문자 등 모든 문자가 담길 수 있습니다.
    * 여러분의 과제는 문자열을 오른쪽부터 왼쪽으로 반복하여 각 문자를 검사하여 그것이 숫자인지 확인하는 것입니다.
    * 숫자를 만나면 즉시 그것을 정수로서 리턴해야 합니다.
    * 숫자는 문자열에서 문자로 표현되어 있으므로 그것을 리턴하기 전에 정수로 변환해야 한다는 점에 주의하시기 바랍니다.
    *
    * 문자열에 있는 모든 문자를 검사했지만 숫자를 찾지 못했다면 -1을 리턴해야 합니다.
    * 엣지 케이스: 문자열이 비어 있는 경우에도 -1을 리턴해야 합니다.
    *
    * Java의 Character클래스에 있는 유용한 메서드를 몇 개 소개해 드립니다.
    * Character.isDigit(c): 이 메서드는 문자 c를 인수로 받아서 만일 c가 숫자(0~9)이면 true를 리턴하고 그렇지 않으면 false를 리턴합니다.
    * Character.getNumericValue(c): 이 메서드는 문자 c를 인수로 받고 만일 그것이 숫자이면 c의 숫자 값을 리턴합니다.
    * 만일 c가 숫자가 아니면 이 메서드는 숫자가 아닌 값을 리턴합니다(우리는 숫자에만 관심이 있으므로 그 값은 이 문제에서 무시할 수 있습니다).
    *
    * 예시
    * 다음은 이 문제를 설명하기 위한 몇 가지 예입니다.
    * 만일 입력 문자열이 "I bought 5 apples, 4 bananas, and 3 oranges"라면 메서드는 3을 리턴해야 합니다.
    * 왜냐면 3은 문자열의 맨 오른쪽에 있는 숫자이기 때문입니다.
    * 만일 입력 문자열이 "There are no numbers in this string"이라면 메서드는 -1을 리턴해야 합니다. 왜냐면 문자열에 숫자가 없기 때문입니다.
    *
    * */
    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {
        // TODO: Write your code here
        if (str.isEmpty())
            return -1;

        int num = -1;
        /* 반대로 생각하면 오른쪽부터 순회 하면서 처음 나오는 숫자가 있으면 return 해주면 된다.
        즉, for loop 다 돌 필요가 없다는 것이다..
         */
        for (int i = 0; i < str.length(); i++) {
            char getNum = str.charAt(i);
            if (Character.isDigit(getNum)) {
                num = Character.getNumericValue(getNum);
            }
        }

        return num;
    }




    /*
    * 코딩 예제: 가장 긴 단어 검색기
    * findLongestWord메서드가 포함된 미완성인 StringMagic클래스가 제공되어 있습니다.
    * 여러분의 과제는 그 메서드를 완성하는 것입니다.
    *
    * 메서드는 주어진 문장에서 가장 긴 단어를 찾아야 합니다.
    * 문장을 문자열로 받아 가장 긴 단어를 문자열 출력값으로서 리턴해야 합니다.
    *
    * 문장이 비어 있을 경우, 메서드는 빈 문자열을 리턴해야 합니다.
    *
    * 다음은 메서드의 시그니처입니다.
    * public String findLongestWord(String sentence)
    * 예 1: "A quick brown fox jumps over the lazy dog"라는 문장을 보면 "quick"이 길이가 5로서 가장 긴 단어입니다.
    * 예 2: "Java is an object oriented programming language"라는 문장에서는 함수가 "programming"을 리턴해야 합니다.
    *
    * 참고
    * 문장이 비어 있거나 맨 앞 또는 맨 뒤에 공백이 있는 엣지 케이스를 꼭 처리하시기 바랍니다.
    *
    * 행운을 빕니다!
    * */
    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {
        // TODO: Write your code here
        String returnValue = "";

        if (sentence.isEmpty())
            return returnValue;

        sentence = sentence.trim();

        String[] splitString = sentence.split(" ");
        returnValue = splitString[0];

        for (int i = 0; i <= splitString.length - 1; i++) {
            if (splitString[i].length() > returnValue.length())
                returnValue = splitString[i];
        }

        return returnValue;
    }
}
