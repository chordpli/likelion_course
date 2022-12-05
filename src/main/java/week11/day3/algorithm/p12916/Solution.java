package week11.day3.algorithm.p12916;

public class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        String[] sArr = s.toUpperCase().split("");

        for (String string : sArr) {
            if (string.equals("P")) {
                pCount++;
                continue;
            }
            if (string.equals("Y")) yCount++;
        }

        if (pCount == yCount) {
            return true;
        } else {
            return false;
        }
    }
}