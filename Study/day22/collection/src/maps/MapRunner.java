package maps;

import com.sun.source.tree.Tree;

import java.util.*;

public class MapRunner {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("A",100);
        hashMap.put("B",70);
        hashMap.put("F",60);
        hashMap.put("c",50);

        System.out.println(hashMap);

        String str = "This is an awesome occasion. " +
                "This has never happened before.";

        Map<Character, Integer> occur = new TreeMap<>();

        char[] characters = str.toCharArray();

        for (char ch : characters) {
            Integer integer = occur.get(ch);

            if (integer == null) {
                occur.put(ch, 1);
            }
            else {
                occur.put(ch, integer + 1);
            }
        }
        System.out.println(occur);

        NavigableMap<Integer, String> test = new TreeMap<>();

        test.put(1,"A");
        test.put(10,"A");
        test.put(7,"C");
        test.put(8,"Z");
        test.put(2,"G");
        test.put(4,"F");

        System.out.println(test.higherEntry(1));
    }
}
