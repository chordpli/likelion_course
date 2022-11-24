package week10.day3.algorithm.recursion.c1859;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m.printStar(n);


    }

    public void printStar(int n) {
        if (n <= 0) return;
        printStar(n - 1);
        drawStar(n);
        System.out.println();
    }

    private void drawStar(int n) {
        if (n <= 0) return;
        drawStar(n - 1);
        System.out.print("*");
    }
}
