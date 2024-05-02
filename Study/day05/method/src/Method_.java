public class Method_ {
    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println(a + " + " + b + " 연산 수행...");
        int sum1 = a + b;
        System.out.println("결과1 출력 : " + sum1);


        // 계산 2
        int c = 3;
        int d = 4;
        System.out.println(c + " + " + d + " 연산 수행...");
        int sum2 = c + d;
        System.out.println("결과1 출력 : " + sum2);

        // 위와 같이 비슷한 코드를 주구장창 복사 붙여넣기 해가며 쓸 수 없는 노릇이다.
        // 이를 위해 함수 '메소드'를 이용해서 작성한다.

        /* 메소드 오버로딩 규칙
           - 메서드의 이름이 같아도 파라미터(매개변수)의 타입이 다르거나, 순서가 다르면 가능
           - 참고로 return 타입은 인정하지 않음
         */
        add(3,10);
        add(10,20);
        add(10,20,30);
        int n = add(10,20,30,40);
        System.out.println("결과 출력 : " + n);
    }

    public static void add(int a, int b) {
        int sum = 0;
        System.out.println(a + " + " + b + " 연산 수행...");
        sum = a + b;
        System.out.println("결과 출력 : " + sum);
    }
    // @메소드 오버로딩
    public static void add(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        System.out.println("결과 출 력 : " + sum);
    }
    // @메소드 오버로딩
    public static int add(int a, int b, int c, int d) {
        int sum = 0;
        sum = a + b + c + d;
        return sum;
    }

}
