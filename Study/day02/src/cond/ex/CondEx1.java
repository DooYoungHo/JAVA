package cond.ex;

public class CondEx1 {
    public static void main(String[] args) {
        /*Q1. 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다
        * 90점 이상 : "A",
        * 80점 이상 90점 미만 : "B",
        * 70점 이상 80점 미만 : "C",
        * 60점 이상 70점 미만 : "D",
        * 60점 미만 : "F"
        *
        * 점수는 변수(int score)로 저장하고, 해당 변수를 기반으로 학점을 출력하자
        * */
        int score = 90;

        if (score >= 90) System.out.println("학점은 A 입니다.");
        else if (80 <= score && score < 90) System.out.println("학점은 B 입니다");
        else if (70 <= score && score < 80) System.out.println("학점은 C 입니다");
        else if (60 <= score && score < 70) System.out.println("학점은 D 입니다");
        else System.out.println("학점은 F 입니다");

        /*Q2. 주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성하자. 다음과 같은 기준을 따른다
        * 거리가 1km 이하이면 : "도보",
        * 거리가 10km 이하이면 : "자전거",
        * 거리가 100km 이하이면 : "자동차",
        * 거리가 100km 초과이면 : "비행기"
        *
        * 거리는 변수(int distance)로 저장하고, 해당 변수를 기반으로 운송 수단을 출력하자.
        * */
        int distance = 100;

        if (distance <= 1) System.out.println("도보를 이용하세요");
        else if (distance <= 10) System.out.println("자전거를 이용하세요");
        else if (distance <= 100) System.out.println("자동차를 이용하세요");
        else System.out.println("비행기를 이용하세요");

        /*Q3. 특정 금액을 미국 달러에서 한국 원으로 변환하는 프로그램을 작성하자.
        * 환율은 1달러당 1300원으로 가정한다. 다음과 같은 기준을 따른다
        * 달러가 0미만이면 : "잘못된 금액입니다",
        * 달러가 0일 때 : "환전할 금액이 없습니다",
        * 달러가 0초과일 때 : "환전 금액은 (계산된 원화 금액)입니다",
        *
        * 금액은 변수(int dollar)로 저장하고, 해당 변수를 기반으로 한국 원으로의 환전 금액을 출력하자
        * */
        int dollar = 10;

        if (dollar < 0) System.out.println("잘못된 금액입니다.");
        else if (dollar == 0) System.out.println("환전할 금액이 없습니다.");
        else System.out.println("환전 금액은 " + (dollar * 1300) + "원 입니다.");
    }
}
