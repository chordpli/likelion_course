package week10.day4.algorithm.greatest_common_divisor.c2623;

import java.util.Scanner;

public class Nain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != b) {
            if (a > b) {
                a -= b;
                continue;
            }
            b -= a;
        }
        System.out.println(a);
    }
}

