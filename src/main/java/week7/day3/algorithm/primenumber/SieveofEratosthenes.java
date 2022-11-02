package week7.day3.algorithm.primenumber;

import week7.day2.programmers.p12921.Solution;

import java.util.ArrayList;
import java.util.List;

public class SieveofEratosthenes {
    public int solution(int n) {
        int[] num = new int[n+1];
        boolean[] check = new boolean[num.length];

        check[0] = check[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!check[i]) {
                for (int j = i * i; j <= n; j += i) {
                    check[j] = true;
                }
            }
        }
        int count = 0;
        for (boolean b : check) {
            if (!b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SieveofEratosthenes s = new SieveofEratosthenes();
        int n = 10;
        System.out.println(s.solution(n));
    }
}
