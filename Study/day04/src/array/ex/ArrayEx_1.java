package array.ex;
import java.util.Scanner;

public class ArrayEx_1 {
    public static void main(String[] args) {
        /* Q1. 아래의 코드를 배열을 사용하여 간략화하자 */
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;

        int total = student1 + student2 + student3 + student4 + student5;
        double average = (double) total / 5;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);

        // 배열을 사용한 경우
        int intTotal = 0;      // 합계 초기화
        double subAverage = 0.0;    // 평균 초기화
        int[] students = {90, 80, 70, 60, 50};       // 배열 생성 및 초기화
        // for each 를 이용한 합계 구하기
        for (int student : students) {
            intTotal += student;
        }
        subAverage = intTotal / students.length;        // 평균 구하기 ( 합계 / 길이 )
        System.out.println("점수 총합 : " + intTotal);      // 합계 출력
        System.out.println("점수 평균 : " + subAverage);    // 평균 출력

        /* Q2. 배열의 입력과 출력
        * 사용자에게 5개의 정수를 입력받아 배열에 저장하고, 입력 순서대로 출력하자.
        * 출력 시 출력 포맷은 1, 2, 3, 4, 5와 같이 , 쉼표를 사용해 구분하고, 마지막에는 쉼표를 넣지 않는다.
        * */
        Scanner scanner = new Scanner(System.in);   // 스캐너 객체 생성
        int[] array = new int[5];     // 배열 5개 초기화
        System.out.println("5개의 정수를 입력하세요 : ");

        // array 배열에 입력받은 값 넣기
        for (int i = 0; i < array.length; i++){
            int num = scanner.nextInt();
            array[i] = num;
        }

        // 문자 출력하기
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        scanner.nextLine();     // 개행 문자 초기화

        /* Q3. 배열의 역순 출력
        * 사용자에게 5개의 정수를 입력받아 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
        * 출력 시 포맷은 5, 4, 3, 2, 1과 같이 , 쉼표를 사용해 구분하고 마지막에는 쉼표를 넣지 않는다.
        * */
        int[] numbers = new int[5];     // 배열 초기화
        System.out.println("5개의 정수를 입력하세요 : ");

        // 사용자에게 5개의 정수 입력받기
        for (int i = 0; i < numbers.length; i++ ) {
            numbers[i] = scanner.nextInt();
        }

        // 역순으로 문자열 출력
        for (int i = (numbers.length - 1); i >= 0; i--) {
            if (i == 0 ) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();
        scanner.nextLine(); // 개행문자 초기화

        /* Q4. 합계와 평균
        * 사용자에게 5개의 정수를 입력받아 합계와 평균을 구하라 */
        int sum = 0;    // 합계 초기화
        double avr = 0;     // 평균 초기화
        int[] count = new int[5];   // 배열 초기화
        System.out.println("5개의 정수를 입력하세요 : ");

        // 사용자에게 5개 정수 입력받고 합계 구하기
        for (int i = 0; i < count.length; i++) {
            count[i] = scanner.nextInt();
            sum += count[i];
        }
        avr = (double) sum / count.length;  // 평균 구하기

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avr);

        /* Q5. 이전 문제인 Q4에서 입력받을 숫자의 개수를 입력받도록 개선하자.
        * */
        avr = 0.0;  // 값 초기화
        sum = 0;    // 값 초기화

        System.out.println("입력받을 숫자의 개수를 입력하세요 : ");
        int arrCnt = scanner.nextInt();    // 입력받을 숫자의 개수
        count = new int[arrCnt];   // 배열 재 초기화
        // 사용자에게 입력받을 숫자의 개수 입력받고 합계 구하기
        for (int i = 0; i < arrCnt; i++) {
            count[i] = scanner.nextInt();
            sum += count[i];
        }
        avr = (double) sum / count.length;  // 평균 구하기

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + avr);

    }
}
