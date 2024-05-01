package array;

public class Array_ {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성
        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        // 참조값( = 주소값)
        System.out.println(students);

        /* JAVA 변수 데이터 타입
        * 기본형(Primitive Type) : int, long, double 등과 같이 사용할 값을 직접 넣을 수 있는 데이터 타입
        * 참조형(Reference Type) : int[] students 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입
        *                         객체나 클래스를 담을 수 있는 변수들도 모두 참조형이다.
        * */

        System.out.println("학생 1의 점수 : " + students[0]);
        System.out.println("학생 2의 점수 : " + students[1]);
        System.out.println("학생 3의 점수 : " + students[2]);
        System.out.println("학생 4의 점수 : " + students[3]);
        System.out.println("학생 5의 점수 : " + students[4]);

        // 위의 print 문을 리펙토링해서 출력해보자
        for (int i = 0; i < students.length; i++)
            System.out.println("학생" + (i + 1) + "의 점수 : " + students[i]);

        // 리펙토링을 사용하면 가독성 및 코드 유지보수가 쉬워짐
        int[] people;
        people = new int[]{1,2,3,4,5}; // 배열 생성과 동시에 초기화

        int[] company = {10,20,30,40,50};
    }
}
