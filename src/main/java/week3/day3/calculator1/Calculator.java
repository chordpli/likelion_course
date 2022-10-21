package week3.day3.calculator1;

import week3.day3.calculator2.NumberCreator;

public class Calculator {
    private int a;
    private int b;
    private NumberCreator randomNumberCreator;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a + b);
    }

    public void plus(int a, int b) {
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }

    public void minus(int a, int b) {
        System.out.println(a - b);
    }

    public void divide(int a, int b) {
        float divide = (float) a/ b;
        System.out.println(divide);
    }

    public void multiple(int a, int b) {
        System.out.println(a * b);
    }
}
