package week10.day4.algorithm.greatest_common_divisor.c2623;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println(main.gcd(sc.nextInt(), sc.nextInt()));

    }
    public int gcd(int a, int b) {
        if (a > b) return gcd(a - b, b);
        if (a < b) return gcd(a, b - a);
        if (a == b) return a;
        return 1;
    }
}