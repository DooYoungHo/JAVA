package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 10;

        int sum = a + b;    // 더하기
        int diff = a - b;   // 빼기
        int multi = a * b;  // 곱하기
        int div = b / a;    // 나누기
        int mod = a % b;    // 나머지

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + multi);
        System.out.println("b / a = " + div);
        System.out.println("a % b = " + mod);
    }
}
