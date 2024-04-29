package cond.ex;

public class CondEx2 {
    public static void main(String[] args) {
        /*Q1. 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
        * 어바웃타임 - 평점9,
        * 토이 스토리 - 평점8,
        * 고질라 - 평점7
        *
        * 평점 변수는 double rating을 사용하세요. if문을 활용해서 문제를 풀자.
        * */
        double rating = 7.1;

        if (rating <= 9) System.out.println("'어바웃타임'을 추천합니다.");
        if (rating <= 8) System.out.println("'토이 스토리'를 추천합니다.");
        if (rating <= 7) System.out.println("'고질라'를 추천합니다.");

        /*Q2. String grade라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자.
        * 각 학점은 다음과 같은 성취도를 나타낸다.
        * "A" : "탁월한 성과입니다!",
        * "B" : "좋은 성과입니다!",
        * "C" : "준수한 성과입니다!",
        * "D" : "향상이 필요합니다!",
        * "F" : "불합격입니다!",
        * "나머지" : "잘못된 학점입니다!"
        *
        * switch 문을 사용하여 문제를 해결해보자.
        * */

        String grade = "G";

        switch (grade){
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다!");
                break;
            case "F":
                System.out.println("불합격입니다!");
                break;
            default:
                System.out.println("잘못된 학점입니다!");
                break;
        }

        /*Q3. 여러분은 두 개의 정수 변수 a와 b를 가지고 있다. a의 값은 10이고, b의 값은 20이다.
        * 삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.*/

        int a = 10;
        int b = 20;
        int condOp = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + condOp + "입니다.");

        /*Q4. 정수 x가 주어지고, x가 짝수이면 "짝수"를, 홀수이면 "홀수"를 출력하는 프로그램을 작성하자.
        * 삼항 연산자를 사용해서 풀어야한다.*/

        int x = 2;
        String num = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + num);
    }
}
