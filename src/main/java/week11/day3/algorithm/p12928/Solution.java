package week11.day3.algorithm.p12928;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        try {
            for (int i = 1; i <= n; i++) {
                if (Math.floorMod(n, i) == 0) {
                    answer += i;
                }
            }
            return answer;
        } catch (ArithmeticException e) {
            return answer;
        }
    }
}
