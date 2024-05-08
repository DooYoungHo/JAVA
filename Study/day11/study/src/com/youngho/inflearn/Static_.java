package com.youngho.inflearn;

public class Static_ {

    public static void main(String[] args) {

        Data_ data1 = new Data_("A");
        System.out.println("A Data_ Count : " + Data_.count);

        Data_ data2 = new Data_("B");
        System.out.println("B Data_ Count : " + Data_.count);
        
        /* 위 코드에서 count 값은 증가하지 않는다. 그 이유는 인스턴스 객체는 각자의 고유한 필드값을 가지고 있기 때문이다.
        * 그렇다면 서로 다른 인스턴스가 같은 변수를 공유할 수 있는 방법이 무엇이 있을까? 'static' 키워드를 사용하면 된다.
        *  */
    }
}
