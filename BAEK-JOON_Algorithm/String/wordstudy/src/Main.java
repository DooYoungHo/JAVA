import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* [1157] 단어 공부
        * 알파벳 대소문자로 된 단어가 주어지면,
        * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
        * */
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.nextLine();
        int[] alphabetCount = new int[26];

        for (int i = 0; i < alphabet.length(); i++) {
            char alpha = alphabet.charAt(i);
            if ('A' <= alpha && alpha <= 'Z')
                alphabetCount[alpha - 'A']++;
            else
                alphabetCount[alpha - 'a']++;
        }

        // 최대 등장 횟수를 저장할 변수
        int maxCount = 0;
        // 가장 많이 등장한 알파벳을 저장할 변수
        char mostFrequent = '?';

        for (int i = 0; i < 26; i++) {
            if (maxCount < alphabetCount[i]) {
                maxCount = alphabetCount[i];
                mostFrequent = (char) (i + 'A'); // 해당 알파벳의 대문자로 저장
            } else if (maxCount == alphabetCount[i]) {
                mostFrequent = '?'; // 최대 등장 횟수가 같은 알파벳이 둘 이상인 경우 '?'로 설정
            }
        }

        System.out.println(mostFrequent);
    }
}