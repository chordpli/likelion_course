package week5.day4.programmers.p12922;
//수박수박수..
public class Solution {
    public String solution(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result += "박";
            }else{
                result += "수";
            }
        }
        return result;
    }
}
