import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 입력받은 대소문자 변환 문제 */
        /* 메서드를 이용한 풀이법 */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String answer = "";

        for (int i = 0; i < name.length(); i++) {
            char a = name.charAt(i);
            if (Character.isUpperCase(a))
                answer += Character.toLowerCase(a);
            else
                answer += Character.toUpperCase(a);
        }
        System.out.println(answer);

        /* ASCII 코드를 이용한 풀이법 */
        char[] ans = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if ('a' <= ans[i] && ans[i] <= 'z') {
                ans[i] = (char)('A' + ans[i] - 'a');
            }
            else ans[i] = (char)('a' + ans[i] - 'a');
        }
        System.out.println(ans);
    }
}