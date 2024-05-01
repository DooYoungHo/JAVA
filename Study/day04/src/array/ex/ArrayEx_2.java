package array.ex;
import java.util.Scanner;

public class ArrayEx_2 {
    public static void main(String[] args) {
        /* Q1. 사용자로부터 N개의 정수를 입력받아 배열에 저장한 후, 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자 */
        Scanner scanner = new Scanner(System.in);   // 스캐너 객체 가져오기
        int max = 0;    // 가장 큰 수 초기화
        int min = 0;    // 가장 작은 수 초기화
        int count = 0;  // N개의 정수 입력받을 값
        int[] arr;      // 배열 초기화

        System.out.print("입력받을 숫자의 개수를 구하세요 : ");
        count = scanner.nextInt();  // 입력받을 수 count에 저장
        arr = new int[count];   // 입력받을 수 만큼 배열 초기화
        System.out.println(count + "개의 정수를 입력하세요 : ");

        // 정수 입력받고 가장 큰 값과 가장 작은 값 찾기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();     // 숫자 입력받기

            if (arr[i] > max)       // 가장 큰 정수 구하기
                max = arr[i];

            if (min > arr[i] || i == 0)     // 가장 작은 수 구하기
                min = arr[i];
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);

        scanner.nextLine(); // 개행 문자 초기화

        /* Q2. 사용자로부터 4명의 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 구성하자.
        * 2차원 배열을 사용하자.
        * */
        int[][] subject = new int[4][3];    // 4명의 row, 3개의 column -> 2차원 배열 생성
        int studentTotal = 0;   // 점수 합계
        double studentAvg = 0;  // 점수 평균
        String[] sub = {"국어", "영어", "수학"};  // 강의에서 제시한 문제해결

        // 점수 입력받기
        for (int i = 0; i < subject.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");

            for (int j = 0; j < subject[i].length; j++) {
                // 국어 점수 입력
                if (j == 0) {
                    System.out.print("국어 점수 : ");
                    subject[i][j] = scanner.nextInt();
                }
                else if (j == 1) {
                    System.out.print("영어 점수 : ");
                    subject[i][j] = scanner.nextInt();
                }
                else if (j == 2) {
                    System.out.print("수학 점수 : ");
                    subject[i][j] = scanner.nextInt();
                }

                // 강의에서 해결한 방법
                // System.out.print(sub[j] + "점수 : ");
                // subject[i][j] = scanner.nextInt();
                // if 문 없이 훨씬 간결하고 가독성이 좋다. 앞으로 많이 발전해야겠다.
            }
        }

        // 학생별로 합계 및 평균 출력하기
        for (int i = 0; i < subject.length; i++) {
            studentTotal = 0;
            studentAvg = 0;

            for (int j = 0; j < subject[i].length; j++) {
                studentTotal += subject[i][j];      // 합계 구하기
            }
            studentAvg = (double) studentTotal / subject[i].length;     // 평균 구하기
            System.out.println((i + 1) + "번 학생의 총점 : " + studentTotal + ", 평균 : " + studentAvg);
        }
    }
}
