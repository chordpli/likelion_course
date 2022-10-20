package datastructure.stack;

import java.util.EmptyStackException;

public class Stack2 <T>{

    private Integer[] arr;
    private int pointer = 0;

    public Stack2() {
        this.arr = new Integer[10000];
    }

    public Stack2(int size) {
        this.arr = new Integer[size];
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10이 들어간다.
        this.arr[this.pointer++] = value;
    }

    public Integer[] getArr() {
        return arr;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[--this.pointer];
    }

    public boolean isEmpty() {
        boolean isEmpty = this.pointer == 0;
        return isEmpty;
    }
}
