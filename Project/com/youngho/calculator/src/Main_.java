import java.util.Scanner;

public class Main_ {

    public static void main(String[] args) {

        /* 미니 계산기를 만들어보자
        * 요구사항
        * - 입력은 문자열로 입력을 받고, 사칙연산 '+', '-', '*', '/' 만이 가능해야 한다.
        * - '=' 문자가 들어오기 전까지 계산은 계속되야 하며, 이상한 문자는 버려야한다.
        * - 나눗셈 표현 시 소수점 한 자리까지만 표현을 해준다.
        * - 맨 처음 사칙연산이 들어오면 기본 값 0과 계산이 된다.
        * - 문자는 숫자든 사칙연산이든 둘 중 하나만 입력할 수 있다.
        * - 값은 문자 입력이 들어오면 계속해서 작성해주어야 한다.
        * - 'exit' 문자를 받으면 계산기가 종료된다.
        * */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("계산을 해주세요! : ");
            String operation = scanner.next();

            if (operation.equals("exit"))
                break;

            Calculator.run(operation);
        }
    }
}
