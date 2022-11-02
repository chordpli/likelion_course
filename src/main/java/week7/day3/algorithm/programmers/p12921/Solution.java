package week7.day3.algorithm.programmers.p12921;

public class Solution {
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
}
