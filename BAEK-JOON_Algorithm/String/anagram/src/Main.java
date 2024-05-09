import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* [1919] 애너그램 만들기
        * 두 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때, 그러한 두 단어를 서로 애너그램 관계에 있다고 한다.
        * 두 개의 영어 단어가 주어졌을 때,
        * 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 최소 개수의 문자 수를 구하는 프로그램을 작성하시오.
        * */
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int[] countA = new int[26];
        int[] countB = new int[26];

        for (int i = 0; i < str1.length(); i++)
            countA[str1.charAt(i) - 'a']++;
        for (int i = 0; i < str2.length(); i++)
            countB[str2.charAt(i) - 'a']++;

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            if (countA[i] > countB[i])
                ans += (countA[i] - countB[i]);
            else if (countB[i] > countA[i])
                ans += (countB[i] - countA[i]);
        }

        System.out.println(ans);

        /* 함수 및 절대값 활용 */
    }
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - 'a']++;

        return count;
    }
}