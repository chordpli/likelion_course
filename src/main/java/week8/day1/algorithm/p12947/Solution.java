package week8.day1.algorithm.p12947;

public class Solution {
    public boolean solution(int x) {
        // 자릿수의 합 구하기
        int sumDigits = findSumDigits(x);
        // x로 나누어 떨어지는지 확인하기
        return checkFixDivideNumber(x, sumDigits);
    }

    public int findSumDigits(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public boolean checkFixDivideNumber(int x, int sumDigits) {
        return x % sumDigits == 0;
    }

}
