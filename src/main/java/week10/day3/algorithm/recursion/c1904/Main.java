package week10.day3.algorithm.recursion.c1904;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        m.printOdd(a, b);
    }

    public void printOdd(int a, int b) {
        if (a > b) return;
        if(a%2==1) System.out.print(a + " ");
        printOdd(a + 1, b);
    }
}
