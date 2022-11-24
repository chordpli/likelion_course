package week10.day3.algorithm.recursion.c1860;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        m.printNumber(n);


    }

    public void printNumber(int n) {
        if (n <= 0) return;
        printNumber(n - 1);
        drawNumber(n);
        System.out.println();
    }

    public void drawNumber(int n) {
        if (n <= 0) return;
        drawNumber(n - 1);
        System.out.print(n + " ");
    }
}
