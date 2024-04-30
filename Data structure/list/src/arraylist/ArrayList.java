package arraylist;

import java.util.concurrent.ConcurrentMap;

public class ArrayList implements IntergerListInterface {
    private Integer[] item;
    private int numItems;
    private static final int DEFAULT_CAPACITY = 64;

    // 생성자 1
    public ArrayList() {
        item = new Integer[DEFAULT_CAPACITY];
        numItems = 0;
    }
    // 생성자 2
    public ArrayList(int n) {
        item = new Integer[n];
        numItems = 0;
    }

    // 원소삽입 알고리즘 구현 : 배열 리스트의 k번째 자리에 원소 x 삽입하기
    public void add(int index, Integer x) {
        if ( numItems >= item.length || index < 0 || index > numItems ) {
            System.out.println("Error by Add method...!");
        }
        else {
            for (int i = numItems - 1; i >= index; i-- )
                item[i + 1] = item[i];
            item[index] = x;
            numItems++;
        }
    }

    // 원소삽입 알고리즘 구현 : 배열 리스트의 맨 뒤에 원소 추가하기
    public void append(Integer x) {
        if (numItems >= item.length) {
            System.out.println("Error by Append method...!");
        }
        else {
            item[numItems++] = x;
        }
    }

    // 원소삭제 알고리즘 구현 : 배열 리스트의 k번째 원소 삭제하기
//    public Integer remove(int index) {
//        if (isEmpty() || index < 0 || index > numItems - 1)
//            return null;
//        else {
//            Integer temp = item[index];
//            for ( int i = index; i <= numItems - 2; i++ )
//                item[i] = item[i + 1];
//            numItems--;
//            return temp;
//        }
//    }

    /* 원소삭제 알고리즘 구현 : 배열 리스트의 k번째 원소 삭제하기
    * 위의 알고리즘 구현은 index + 1의 값을 복사해오는 것이길래 삭제 후 한 칸씩 땡기는걸 추가 해봤음
    * */
    public Integer remove(int index) {
        if (isEmpty() || index < 0 || index >= numItems)
            return null;
        else if (index == numItems - 1) {
            item[index] = null;
            return item[index];
        }
        else {
            Integer temp = item[index];
            for ( int i = index; i <= numItems - 2; i++ ) {
                item[i] = item[i + 1];
                item[i + 1] = null;
            }
            numItems--;
            return temp;
        }
    }

    // 원소삭제 알고리즘 구현 : 배열 리스트에서 원소 x 삭제하기
    public boolean removeItem(Integer x) {
        int k = 0;
        while (k < numItems && item[k].compareTo(x) != 0)
            k++;

        if (k == numItems)
            return false;
        else {
            for (int i = k; i <= numItems - 2; i++)
                item[i] = item[i + 1];
            numItems--;
            return true;
        }
    }

    // 원소위치 알고리즘 구현 : 배열 리스트의 i번째 원소 알려주기
    public Integer get(int index) {
        if (index >= 0 && index <= numItems - 1)
            return item[index];
        else return null;
    }

    // 원소대체 알고리즘 구현 : 배열 리스트의 i번째 원소를 x로 대체하기
    public void set(int index, Integer x) {
        if (index >= 0 && index <= numItems - 1)
            item[index] = x;
        else {
            System.out.println("Error by Set method...!");
        }
    }

    // 원소위치 알고리즘 구현 : 배열 리스트의 몇 번째 원소인지 알려주기
    private final int NOT_FOUND = -123;
    public int indexOf(Integer x) {
        for (int i = 0; i < numItems; i++) {
            if(((Comparable)item[i]).compareTo(x) == 0)
                return i;
        }
        return NOT_FOUND;
    }

    // 원소 수 알려주기 : 배열 리스트의 총 원소 수 알려주기
    public int len() {
        return numItems;
    }

    // 배열 리스트가 비었는지 알려주기
    public boolean isEmpty() {
        return numItems == 0;
    }

    // 배열 리스트 청소하기
    public void clear() {
        item = new Integer[item.length];
        numItems = 0;
    }

    // 배열 리스트 보여주기
    public void printList() {
        for (int i = 0; i < item.length; i++)
            System.out.println("배열 리스트[" + i + "] = " + item[i]);
    }
}