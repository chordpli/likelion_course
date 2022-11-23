package week10.day2.algorithm.recursion.c1851;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        main.printStar(sc.nextInt());
    }

    public void printStar(int num) {
        if (num <= 0) {
            return;
        }
        System.out.print("*");
        printStar(num-1);
    }
}
