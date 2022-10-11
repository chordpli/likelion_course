package week4.programmers.자릿수더하기;

public class Solution {
    // 문자열 변환 후 자릿수별 숫자 더하기
    public int solution(int n) {
        String[] number = String.valueOf(n).split("");
        int result = 0;
        for (int i = 0; i < number.length; i++) {
            result += Integer.parseInt(number[i]);
        }
        return result;
    }
    
    // 나머지 값으로 자릿수별 숫자 더하기
    public int solution2(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

}
