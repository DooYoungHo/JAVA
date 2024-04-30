public class While_1 {
    public static void main(String[] args) {
        int count = 0;

        count += 1;
        System.out.println("현재 숫자는 = " + count);
        count += 1;
        System.out.println("현재 숫자는 = " + count);
        count += 1;
        System.out.println("현재 숫자는 = " + count);
        count += 1;
        System.out.println("현재 숫자는 = " + count);


        // 위 문장을 반복문을 사용해서 작성한다면
        int count2 = 0;
        while (count2 < 5) {
            count2 += 1;
            System.out.println("현재 숫자는2 = " + count2);
        }

        /* Q1. 1부터 하나씩 증가하는 수를 3번 더해라 (1 - 3 더하기)
        * 1 + 2 + 3이 되어야함 */
        int count3 = 0;
        int sum = 0;
        while (count3 < 3){
            sum += count3 + 1;
            count3 += 1;
            System.out.println("sum = " + sum);
        }
    }
}