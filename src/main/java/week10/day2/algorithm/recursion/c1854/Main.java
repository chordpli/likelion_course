package week10.day2.algorithm.recursion.c1854;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        System.out.println(main.recursionSum(sc.nextLong(), 0L));
    }

    public long recursionSum(long n, long sum) {
        if (n < 10) return (sum+n);
        sum += n % 10;
        return recursionSum((n / 10),sum);
    }
}
