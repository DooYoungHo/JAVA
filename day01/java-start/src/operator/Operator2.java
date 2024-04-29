package operator;

public class Operator2 {

    public static void main(String[] args) {

        // 문자열 + 문자열
        String result1 = "hello" + " world";
        System.out.println(result1);

        // 문자열 + 문자열 - 2
        String s1 = "string1";
        String s2 = "string2";
        String s3 = s1 + s2;
        System.out.println(s3);

        // 문자열 + 숫자
        String n1 = "a + b = " + 10;
        System.out.println(n1);

        // 문자열 + 숫자 - 2
        int num = 15;
        String str = "a + b = ";
        String str2 = str + num;
        System.out.println(str2);
    }
}
