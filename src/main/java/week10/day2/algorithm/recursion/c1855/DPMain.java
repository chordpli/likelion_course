package week10.day2.algorithm.recursion.c1855;

import java.util.Scanner;

public class DPMain {
    static int[] dp;

    int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (dp[n] != 0) return dp[n];
        dp[n] = fibonacci(n - 2) + fibonacci(n - 1);
        return dp[n];
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];

        System.out.println(main.fibonacci(n));
    }
}
