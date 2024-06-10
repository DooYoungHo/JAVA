package sets;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {

        /* HashSet = 무작위로 저장
        *  LinkedHashSet = add한 순서대로 저장
        *  TreeSet = 값이 작은것부터 왼쪽부터 저장 */

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(50);
        hashSet.add(30);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add(50);
        linkedHashSet.add(30);

        System.out.println("HashSet : " + hashSet);
        System.out.println("LinkedHashSet : " + linkedHashSet);

        List<Character> characters = List.of('A','Z','A','B','Z','F');
        Set<Character> testSet = new TreeSet<>();

        Set<Character> charSet = new TreeSet<>(characters);
        System.out.println("TreeSet : " + charSet);
    }
}
