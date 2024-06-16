package course;

public class MyString {
    /*
    * 코딩 예제 – 16진수 문자열인지 검사하기
    * 이번 문제에서는 MyString 클래스와 String 변수 str, 그리고 isHexadecimalChar(char ch)와 isHexadecimal()이라는 2개의 메서드가 제공됩니다.
    *
    * 여러분은 이 메서드들을 완성해야 합니다.
    * 여기서 문자열은 숫자(0 ~ 9)와 문자 A ~ F(대소문자 불문)만 포함되어 있는 경우에만 유효한 16진수로 간주됩니다.
    * 문자가 유효한 16진수 문자(A ~ F 또는 a ~ f)일 경우, isHexadecimalChar(char ch) 메서드는 true를 리턴해야 하고, 그렇지 않으면 false를 리턴해야 합니다.
    * 만일 문자열 str이 유효한 16진수 문자열이면 isHexadecimal()메서드는 true를 리턴해야 하고, 그렇지 않으면 false를 리턴해야 합니다.
    *
    * 엣지 케이스
    * 문자열이 비어 있거나 null인 경우, isHexadecimal()메서드는 false 리턴해야 합니다.
    * isHexadecimalChar(char ch) 메서드는 대소문자를 모두 처리해야 합니다.
    *
    * 예시
    *
    * "123F" => true"A23g" => false.
    *
    * 참고사항
    * Character.isDigit(char ch) 메서드는 문자가 숫자인지 검사합니다.
    * String.toCharArray() 메서드는 문자열을 문자 배열로 변환합니다.
    * 관계 연산자 >= 과 <=을 사용하여 어떤 문자가 특정한 범위 안에 있는지 검사합니다.
    * ASCII에서 소문자와 대문자의 차이에 유의하십시오. ‘a’ ~ ’f’와 ‘A’ ~ ’F’는 다른 범위에 있습니다.
    * */
    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        return ( (ch >= 'a' && ch <= 'f') ||
                (ch >= 'A' && ch <= 'F') );
    }

    public boolean isHexadecimal() {
        // Write your code here
        if (this.str.isEmpty())
            return false;

        for (char ch : str.toCharArray()) {
            if (!isHexadecimalChar(ch) && !Character.isDigit(ch))
                return false;
        }

        return true;
    }



    /*
    * 코딩 예제 – 역순 단어 제조기
    * 이번 예제에서 여러분은 제공된 StringMagic 클래스 안에 reverseWordsInSentence라는 이름의 Java 메서드를 작성해야 합니다.
    * 이 메서드는 문자열 문장을 입력으로 받아서 문장 안의 모든 단어가 역순으로 변경되지만 원래의 단어 순서는 유지되는 문자열을 리턴해야 합니다.
    *
    * 엣지 케이스:
    * 입력된 문자열이 null이면 여러분의 메서드는 문자열 "INVALID"를 리턴해야 합니다.
    * 입력된 문자열이 비어 있으면(즉, ""이면) 여러분의 메서드는 빈 문자열을 리턴해야 합니다.
    * 입력 형식
    *
    * 문장으로 된 하나의 문자열.
    * 출력 형식
    * 문장의 모든 단어가 역순으로 되어 있으나 원래의 단어 순서는 유지하고 있는 문자열.

    * 예시
    * 그럼 몇 가지 예를 볼까요?
    * 예 1
    * 입력:
    * StringMagic sm = new StringMagic();
    * sm.reverseWordsInSentence("Hello World");
    * 리턴 값:
    * "olleH dlroW"
    *
    * 예 2
    * 입력:
    * StringMagic sm = new StringMagic();
    * sm.reverseWordsInSentence("");
    * 리턴 값: ""
    *
    * 예 3
    * 입력:
    * StringMagic sm = new StringMagic();
    * sm.reverseWordsInSentence(null);
    * 리턴 값:
    * "INVALID"
    *
    * 참고사항
    * 해답에서 우리는 Java 표준 라이브러리에 있는 메서드와 클래스를 몇 개 사용했습니다. 그럼 간단히 알아볼까요?
    * string.split(String regex): 이 메서드는 주어진 정규 표현식에 따라 문자열을 분할합니다.
    *
    * stringBuilder: 문자열 조작 작업을 할 때는 StringBuilder를 쓰는 것이 String을 쓰는 것보다 더 효율적입니다.
    * stringBuilder.reverse(): 이 메서드는 StringBuilder안의 문자 순서를 역순으로 바꿉니다.
    * stringBuilder.append(String str): 이 메서드는 지정된 문자열을 시퀀스에 추가합니다.
    * string.trim(): 이 메서드는 앞과 뒤의 공백을 생략한 문자열 사본을 리턴합니다.
    * 그럼 행운을 빕니다!
    * */
    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if (sentence == null)
            return "INVALID";

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if (sentence.isEmpty())
            return "";

        // TODO: Split the sentence into words using the split method.
        // Use " " as the delimiter to match space.
        String[] strArray = sentence.split(" ");

        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder magic = new StringBuilder();

        for (String str : strArray) {
            StringBuilder builder = new StringBuilder(str);
            builder.reverse();
            magic.append(builder).append(" ");
        }

        String r = magic.toString();

        return r.trim();
        // TODO: Loop through each word in the words array.

        // TODO: For each word, create a StringBuilder and reverse the word.
        // Append the reversed word, followed by a space, to the reversed sentence.

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
    }
}
