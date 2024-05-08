package com.youngho.sdu;

public class Generic_<T> {
    int tos;
    int size;
    Object[] stack;

    public Generic_(int size) {
        tos = 0;
        this.size = size;
        stack = new Object[this.size];
    }

    public void push(T item) {
        if (tos == size)
            return;
        stack[tos] = item;
        tos++;
    }

    public T pop() {
        if (tos == 0)
            return null;
        tos--;
        return (T)stack[tos];
    }
}
