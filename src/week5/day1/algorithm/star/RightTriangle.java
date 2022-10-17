package week5.day1.algorithm.star;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        /*System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (i != count) {
                System.out.println();
            }
        }
    }
}
