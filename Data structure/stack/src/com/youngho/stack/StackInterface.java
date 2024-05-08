package com.youngho.stack;

public interface StackInterface<E> {
    public void push(E newItem);    // 새로운 값 넣기
    public E pop();     // 값 삭제
    public E top();     // 마지막 값 확인
    public boolean isEmpty();   // 비었는지 체크
    public void popAll();   // 스택 비우기
    public void showStack();    // 스택 값 출력하기
}
