package datastructure.stack;

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
        this.arr[pointer] = value;
        this.pointer++;
    }

    public Integer[] getArr() {
        return arr;
    }

    public int pop() {
        int value = this.arr[this.pointer-1];
        pointer--;
        return value;
    }
}
