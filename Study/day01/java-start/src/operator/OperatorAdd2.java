package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // 전위 증감 연산자 ( a의 값을 먼저 증가 시키고, 그 결과를 b에 대입)
        b = ++a;
        /*
        * a = a + 1;
        * b = a;
        * 순서로 진행되는 것
        * */
        System.out.println("a = " + a + ", b = " + b);

        b = 0;
        a = 10;
        // 후위 증감 연산자 ( a의 현재 값을 b에 먼저 대입하고, 그 후 a값을 증가)
        b = a++;
        /*
        * b = a;
        * a = a + 1;
        * 순서로 진행되는것
        * */
        System.out.println("a = "+ a + ", b = " + b);
    }
}
