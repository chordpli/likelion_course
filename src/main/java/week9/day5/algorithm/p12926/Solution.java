package week9.day5.algorithm.p12926;

import java.util.Arrays;

public class Solution {

    public String solution(String input, int s) {
        String answer = "";
        if (s == 0) {
            return input;
        }
        String[] arr = input.split("");
        for (String c : arr) {
            String temp = "";
            if (c.charAt(0) >= 65 && c.charAt(0) <= 90) {
                temp = getLowerCase(s, c);
            }

            if (c.charAt(0) >= 97 && c.charAt(0) <= 122) {
                temp = getUpperCase(s, c);
            }

            if (c.charAt(0) == ' ') {
                temp = " ";
            }

            answer += temp;
        }

        return answer;
    }

    private String getLowerCase(int s, String c) {
        char charTemp = 0;
        if ((c.charAt(0) + s) > 90) {
            charTemp = (char) (64 + ((c.charAt(0) + s) - 90));
        } else {
            charTemp = (char) (c.charAt(0) + s);
        }
        String temp = String.valueOf(charTemp);
        return temp;
    }

    public String getUpperCase(int s, String c) {
        char charTemp = 0;
        if ((c.charAt(0) + s) > 122) {
            charTemp = (char) (96 + ((c.charAt(0) + s) - 122));
        } else {
            charTemp = (char) ((c.charAt(0) + s));
        }
        return String.valueOf(charTemp);
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String st = "Z";
        int n = 1;
        System.out.println(s.solution(st, n));
    }
}
