package mychar_;

public class MyChar_ {
    /*
    * 코딩 예제: char를 이용한 switch문 – 모음일까요? 아닐까요?
    *
    * 과제
    * 여러분의 과제는 isVowel(char ch) 메서드 안에서 switch문을 구현하는 것입니다.
    * 만일 문자가 모음(소문자 또는 대문자 모두 가능)이라면 switch문은 true를 리턴해야 하고, 그렇지 않으면 false를 리턴해야 합니다.
    * 모음은 'A', 'E', 'I', 'O', 'U' 및 그것들의 소문자 버전들입니다.
    * */
    public boolean isVowel(char ch) {
        return switch (ch) {
          case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {
              yield true;
          }
            default -> {
              yield false;
            }
        };
    }
}
