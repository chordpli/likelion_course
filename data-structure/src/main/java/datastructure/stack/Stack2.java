package datastructure.stack;

public class Stack2{

    private Object[] arr;
    private int pointer = 0;

    public Stack2() {
        this.arr = new Object[10000];
    }

    public Stack2(int size) {
        this.arr = new Object[size];
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10이 들어간다.
        this.arr[pointer] = value;
        this.pointer++;
    }

    public Object[] getArr() {
        return arr;
    }

    public Object pop() {
        Object value = (int) this.arr[this.pointer-1];
        pointer--;
        return value;
    }
}
