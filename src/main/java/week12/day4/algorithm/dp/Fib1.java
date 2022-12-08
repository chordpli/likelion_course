package week12.day4.algorithm.dp;

public class Fib1 {
    public static int[] dp = new int[10001];

    public Fib1() {
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;

        for (int i = 5; i <10001 ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }

    public static void main(String[] args) {
        Fib1 f = new Fib1();
        System.out.println(dp[14]);
    }

}
