package com.youngho.stack.linkedstack;

import com.youngho.stack.StackInterface;

public class LinkedStack<E> implements StackInterface<E> {

    private Node<E> topNode;
    private final E ERROR = null;
    // 기본 생성자
    public LinkedStack() {
        topNode = null;
    }

    @Override       // 연결 리스트 스택에 원소 삽입하기
    public void push(E newItem) {
        topNode = new Node<>(newItem, topNode);
    }

    @Override       // 스택에서 원소 삭제하기
    public E pop() {
        if (isEmpty()) return ERROR;
        else {
            Node<E> temp = topNode;
            topNode = topNode.next;
            return topNode.item;
        }
    }

    @Override       // 스택에서 top 원소 보여주기
    public E top() {
        if (isEmpty()) return ERROR;
        else return topNode.item;
    }

    @Override       // 스택이 비었는지 확인하지
    public boolean isEmpty() {
        return (topNode == null);
    }

    @Override       // 스택 비우기
    public void popAll() {
        topNode = null;
    }

    @Override       // 스택 원소 보여주기
    public void showStack() {
        if (isEmpty()) System.out.println("스택이 비었습니다...!");
        else {
            Node<E> temp = topNode;
            while (temp != null) {
                System.out.println(temp.item);
                temp = temp.next;
            }
        }
    }
}
