package week5.day4.programmers.p12912;
// 두 정수 사이의 합
public class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (a == b) {
            answer = a;
        }else{
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }

        return answer;
    }
}
