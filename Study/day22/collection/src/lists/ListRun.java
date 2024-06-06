package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRun {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Young");
        arrayList.add("wild");

//        for (String arr : arrayList)
//            System.out.println(arr);

        Iterator words = arrayList.iterator();

//        while (words.hasNext())
//            System.out.println(words.next());

        int[][] arr = {
                {3, 5, 4},
                {7, 6, 9}
        };

        int[][] arr2 = {
                {7, 9 ,8},
                {6, 9, 3}
        };

        int[][] sumArr = new int[arr.length][arr2[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                sumArr[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.println(sumArr[i][j]);
            }
        }
    }
}
