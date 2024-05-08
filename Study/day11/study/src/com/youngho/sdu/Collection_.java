package com.youngho.sdu;

import java.util.*;

public class Collection_ {

    public static void main(String[] args) {
        /* Vector 활용사례 */
        Vector<Integer> vector = new Vector<Integer>(10);

        Integer integer = Integer.valueOf(10);
        /* 요소 삽입 */
        vector.add(5);
        vector.add(integer);  // Wrapper 클래스도 삽입 가능
        vector.add(2, 15);

        /* 벡터 크기 및 요소 확인 */
        System.out.println("현재 벡터 사이즈 : " + vector.size());
        System.out.println("벡터의 총 용량 : " + vector.capacity());
        for (Integer element : vector)
            System.out.println(element);
        /* 요소 삭제 */
        vector.remove(1);

        /* Vector 요소 합 구하기 */
        int sum = 0;
        for (int i = 0; i < vector.size(); i++) {
            sum += vector.elementAt(i);
        }
        System.out.println("요소의 합 : " + sum);

        /* HashMap 활용 사례 */
        /* Key, Value 값으로 구성되어 있음 */
        HashMap<String, String> dic = new HashMap<String, String>();

        /* 3개의 쌍을 hashmap 저장 */
        dic.put("university","서울디지털대학교");
        dic.put("high school","강호항공고등학교");
        dic.put("middle school","이리영등중학교");

        /* dic 해시맵에 들어있는 모든 쌍 출력 */
        Set<String> keys = dic.keySet();        // 모든 키를 Set 컬렉션에 담기
        Iterator<String> iter = keys.iterator();    // Set 에 접근하는 Iterator 리턴

        // 값이 순차적이 아닌 랜덤으로 들어가는 걸 볼 수 있음
        while (iter.hasNext()) {
            String key = iter.next();
            String value = dic.get(key);
            System.out.println("( " + key + ", " + value + " )");
        }

        /* 영어 단어를 입력받고 한글 단어 검색 */
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dic.size(); i++) {
            System.out.print("찾고 싶은 단어는 ? : ");
            String english = scanner.nextLine();
            /* 해시맵에서 키의 값 검색 */
            String korean = dic.get(english);
            if (korean == null)
                System.out.println("없는 단어입니다...!");
            else
                System.out.println(korean);
        }

        /* 제네릭 사용 예제 */
        Generic_<Integer> intStack = new Generic_<Integer>(10);
        intStack.push(9);
        intStack.push(8);
        intStack.push(0);
        intStack.push(8);
        intStack.push(0);
        intStack.push(8);

        for (int i = 0; i < 10; i++)
            System.out.println(intStack.pop());
    }
}
