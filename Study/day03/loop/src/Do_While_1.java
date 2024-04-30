public class Do_While_1 {
    public static void main(String[] args) {
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는 :" + i);
            i++;
        }
        // 위의 조건은 while 조건이 false 이기 때문에 루프 자체를 돌지 않는다.

        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);

        // do - while 은 while 조건을 타지 않아도 do 구문을 최소 한 번을 실행

        /*Q1. 1부터 시작해서 숫자를 계속 누적해 더하다가 합계까 10보다 처음으로 큰 값은 얼마인가?
        * 1 + 2 + 3 ... 계속 더하다 처음으로 합이 10보다 더 큰 경우를 찾으면 된다. */

        int sum = 0;
        while (true) {
            sum += 1;
            if (sum > 10) break;
        }
        System.out.println("합이 10보다 큰 첫 값 : " + sum);
    }
}
