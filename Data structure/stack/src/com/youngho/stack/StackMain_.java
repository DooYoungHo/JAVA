package com.youngho.stack;

import com.youngho.stack.arraystack.ArrayStack;
import com.youngho.stack.linkedstack.LinkedStack;

public class StackMain_ {

    public static void main(String[] args) {

        /* 배열 스택 */
        ArrayStack<String> arrStack = new ArrayStack<String>(5);
        arrStack.push("Apple");
        arrStack.push("Banana");
        arrStack.push("Grape");
        arrStack.push("Melon");
        arrStack.push("WaterMelon");
        arrStack.showStack();
        arrStack.pop();
        arrStack.pop();
        arrStack.pop();
        System.out.println("-------------------");
        arrStack.showStack();
        System.out.println("topIndex : " + arrStack.top());
        arrStack.popAll();
        arrStack.showStack();
        System.out.println("====================");

        /* 연결 리스트 스택 */
        LinkedStack<String> linkStack = new LinkedStack<>();
        linkStack.push("사과");
        linkStack.push("바나나");
        linkStack.push("배");
        linkStack.showStack();
    }
}
