package Ex;

public class LoopEx {
    public static void main(String[] args) {
        /* Q1. 처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요.
        * 이때, count 라는 변수를 사용해야 합니다.
        * while, for 2가지 버전의 정답을 만들어야 합니다.*/
        int count = 0;
        for (int i = 0; i < 10; i++){
            count += 1;
            System.out.println("-> for : " + count);
        }

        count = 0;
        while (true) {
            count += 1;
            if (count > 10) break;
            System.out.println("-> while : " + count);
        }

        /* Q2. 반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요.
        * 이때, num 이라는 변수를 사용해야 합니다.
        * while, for 2가지 버전의 정답을 만들어야 합니다. */
        int num = 0;

        for (int i = 0; i < 10; i++){
            num += 2;
            System.out.println("-> for(짝수) : " + num);
        }

        num = 0;
        count = 0;
        while (true) {
            num += 2;
            count += 1;
            if (count > 10) break;
            System.out.println("-> while(짝수) : " + num);
        }

        /* Q3. 반복문을 사용하여 1부터 max 까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요.
        * 이때, sum 이라는 변수를 사용하여 누적 합을 표현하고, i 라는 변수를 사용하여 카운트(1부터 max)를 수행해야 합니다.
        * while, for 2가지 버전의 정답을 만들어야 합니다. */
        int i = 0;
        int sum = 0;
        int max = 100;

        for (i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println("-> for(max) : " + sum);

        i = 0;
        sum = 0;
        while (i < max) {
            i++;
            sum += i;
        }
        System.out.println("-> while(max) : " + sum);

        /* Q4. 이중 for 문을 이용하여 구구단을 만들어보자 */
        for(int z = 1; z <= 9; z++)
            for(int j = 1; j <= 9; j++)
                System.out.println(z + " * " + j + " = " + z * j);

        /* Q5. 피라미드 출력
        * int row 선언 후 이 수만큼 다음과 같은 피라미드를 출력하면 된다.
        * ex) row = 5;
        * *
        * **
        * ***
        * ****
        * *****
        *  */

        int row = 5;
        for(int q = 1; q <= row; q++) {
            for (int j = 1; j <= q; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }


    }
}
