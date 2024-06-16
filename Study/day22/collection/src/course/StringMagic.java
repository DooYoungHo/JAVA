package course;

import java.util.*;

public class StringMagic {
    /*
    * 코딩 예제 – 애너그램 검사기
    * 여러분에게는 2개의 문자열 str1과 str2가 주어져 있습니다. 여러분의 과제는 str1과 str2가 서로 애너그램인지 판정하는 것입니다.
    * 애너그램이란 단어나 문구의 글자를 재배열하여 만들어진 단어나 문구를 가리킵니다. 일반적으로는 원래의 글자를 정확히 한 번 사용합니다.
    * 예를 들어 단어 “listen”은 “silent”의 애너그램이고 “hello”는 “olelh”의 애너그램입니다.
    *
    * 여러분은 StringMagic클래스의 areAnagrams(String str1, String str2) 메서드를 구현해야 합니다.
    * 이 메서드는 만일 str1과 str2가 서로 애너그램이면 true를 리턴하고, 그렇지 않으면 false를 리턴합니다.
    *
    * 엣지 케이스:
    * 비교할 때 대소문자는 가리지 않습니다. 즉 “Listen”과 “Silent”는 애너그램으로 간주해야 합니다.
    * str1또는 str2가 null이라면 메서드는 false를 리턴해야 합니다.
    * str1과 str2의 길이가 같지 않아도 메서드는 false를 리턴해야 합니다.
    *
    * 입력 형식
    * 이 메서드는 2개의 매개변수를 받습니다.
    * str1- String
    * str2- String
    *
    * 출력 형식
    *
    * 이 메서드는 다음을 리턴해야 합니다.
    *
    * true- str1과 str2가 애너그램인 경우.
    * false- str1과 str2가 애너그램이 아닌 경우.
    *
    * 지침
    *
    * 두 문자열이 애너그램인지 검사하기 위해
    * 문자열들을 소문자로 변환합니다.
    * 문자열들의 길이가 다른지 검사하여 만일 그렇다면 false를 리턴합니다.
    * 문자열들을 문자 배열로 변환합니다.
    * 문자 배열을 정렬합니다.
    * 정렬된 배열이 같으면 true를 리턴합니다. 그렇지 않으면 false를 리턴합니다.
    *
    * Java 라이브러리 메서드
    *
    * 도움이 되는 메서드 몇 개를 소개해 드립니다.
    * string.toLowerCase() – 문자열에 있는 모든 문자를 소문자로 변환합니다.
    * string.toCharArray() – 문자열을 새로운 문자 배열로 변환합니다.
    * Arrays.sort(charArray) – 지정된 배열을 숫자 오름차순으로 정렬합니다.
    * Arrays.equals(charArray1, charArray2) –지정된 두 문자 배열이 서로 같으면 true를 리턴합니다.
    * 이 문제를 푸는 데 이 메서드들이 아주 유용하고, 여러분의 구현물에서 사용하시기를 권해 드립니다.
    * */
    public boolean areAnagrams(String str1, String str2) {
        // Write your code here
        // Null 검사
        if (str1 == null || str2 == null) {
            return false;
        }

        // 문자열 길이 검사
        if (str1.length() != str2.length()) {
            return false;
        }

        // 문자열을 소문자로 변환
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // 문자열을 문자 배열로 변환
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // 문자 배열을 정렬
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // 정렬된 배열이 같은지 검사
        return Arrays.equals(charArray1, charArray2);
    }
}
