package cond;

public class CondOp1 {
    public static void main(String[] args) {
        // if문을 사용할 때 다음과 같이 단순히 참과 거짓에 따라 특정값을 구하는 경우가 있음
        int age = 27;
        String status;

        if (age >= 18) status = "성인";
        else status = "미성년자";

        System.out.println("age = " + age + ", status = " + status);

        // 위 코드를 삼항 연산자를 사용했을 때
        String status2 = (age>=18) ? "성인" : "미성년자";
        System.out.println("age = " + age + ", status2 = " + status2);
    }
}
