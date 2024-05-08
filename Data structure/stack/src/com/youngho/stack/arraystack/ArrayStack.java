package com.youngho.stack.arraystack;

import com.youngho.stack.StackInterface;

public class ArrayStack<E> implements StackInterface<E> {

    private E stack[];
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;
    // 기본 생성자
    public ArrayStack() {
        stack = (E[]) new Object[DEFAULT_CAPACITY];
        topIndex = -1;
    }
    // 스택 크기 받는 생성자
    public ArrayStack(int n) {
        stack = (E[]) new Object[n];
        topIndex = -1;
    }

    @Override       // 스택에 원소 삽입하기
    public void push(E newItem) {
        if (isFull())           /* 가득 찼는지 체크 */
            System.out.println("스택이 가득 찼습니다...!");
        else stack[++topIndex] = newItem;       /* newItem 을 Index 에 추가한 후 Index++; */
    }

    @Override       // 스택에서 원소 삭제하기
    public E pop() {
        if (isEmpty()) return ERROR;
        else {
            stack[topIndex] = null;
            return stack[topIndex--];
        }
    }

    @Override       // 스택 TopIndex 확인하기
    public E top() {
        if (isEmpty()) return ERROR;
        else return stack[topIndex];
    }

    @Override       // 스택이 비었는 지 확인하기
    public boolean isEmpty() {
        return (topIndex < 0);
    }

    // 스택이 꽉 찼는 지 확인하기
    private boolean isFull() {
        return (topIndex == (stack.length - 1));
    }

    @Override       // 스택 초기화 하기
    public void popAll() {
        stack = (E[]) new Object[stack.length];
        topIndex = -1;
    }

    @Override       // 스택 값 출력
    public void showStack() {
        if (isEmpty()) System.out.println("스택이 비어있습니다...!");
        else
            for (E s : stack)
                System.out.println(s);
    }
}
