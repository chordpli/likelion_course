package week4.programmers;

public class Solution {
    public int solution(int n){
        String[] number = String.valueOf(n).split("");
        int result = 0;
        for(int i = 0; i < number.length; i++){
            result += Integer.parseInt(number[i]);
        }
        return  result;
    }
}
