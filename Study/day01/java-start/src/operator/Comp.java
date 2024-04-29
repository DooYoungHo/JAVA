package operator;

public class Comp {

    public static void main(String[] args) {

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result = str1.equals(str2);
        boolean result2 = str1.equals("문자열1");

        System.out.println(result);
        System.out.println(result2);
        // ; 자동완성 = ctrl + shift + Enter
    }
}
