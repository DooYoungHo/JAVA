package student;

public class Student {
    /*
    * 코딩 예제: 점수를 기준으로 한 A부터 F까지의 학생 학점
    * 여러분은 제공된 점수를 기준으로 학생의 학점을 계산하여 할당하는 Student 클래스의 기능을 구현하게 됩니다.
    *
    * 학생의 학점은 다음과 같은 기준에 따라 결정됩니다.
    * 학생의 점수가 0보다 낮거나 100보다 높으면 학점은 ‘X’입니다.
    * 학생의 점수가 90보다 높거나 90과 같으면 학점은 ‘A’입니다.
    * 학생의 점수가 80보다 높거나 80과 같지만 90보다 낮으면 학점은 ‘B’입니다.
    * 학생의 점수가 70보다 높거나 70과 같지만 80보다 낮으면 학점은 ‘C’입니다.
    * 학생의 점수가 60보다 높거나 60과 같지만 70보다 낮으면 학점은 ‘D’입니다.
    * 학생의 점수가 50보다 높거나 50과 같지만 60보다 낮으면 학점은 ‘E’입니다.
    * 학생의 점수가 50보다 낮으면 학점은 ‘F’입니다.
    *
    * 클래스 구조
    * 클래스 Student 는 다음이 포함되어 있습니다.
    * 타입이 int 인 인스턴스 변수 marks.
    * int 매개변수를 받아 marks 를 초기화하는 생성자.
    * 제공된 점수를 기준으로 학생의 학점을 나타내는 char 를 리턴하는 assignGrade() 메서드.
    *
    * 과제
    * 여러분의 과제는 Student 클래스 안의 Student(int marks) 생성자와 assignGrade() 메서드를 구현하는 것입니다.
    * Student(int marks) – 이 생성자는 매개변수 하나, 즉 marks(정수)를 받고 그걸 인스턴스 변수 marks에 할당할 것입니다.
    * assignGrade() – 이 메서드는 학생이 받은 성적을 기준으로 학생의 학점을 나타내는 문자를 리턴할 것입니다.
    *
    * 점수에 따른 리턴 결과는 다음과 같습니다.
    * 0보다 낮거나 100보다 높은 경우, 'X'를 리턴
    * 90보다 높거나 같은 경우, 'A'를 리턴
    * 80보다 높거나 같은 경우, 'B'를 리턴
    * 70보다 높거나 같은 경우, 'C'를 리턴
    * 60보다 높거나 같은 경우, 'D'를 리턴
    * 50보다 높거나 같은 경우, ‘E'를 리턴
    * 50보다 낮은 경우, 'F'를 리턴
    * */
    private int marks;

    public Student(int marks) {
        this.marks = marks;
    }

    public char assignGrade() {
        if (marks < 0 || marks > 100)
            return 'X';
        else if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else if (marks >= 50)
            return 'E';
        else
            return 'F';
    }
}
