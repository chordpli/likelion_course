package week11.day2.radixsort;

import java.util.*;

public class Practice03 {
    public static void main(String[] args) {
        int[] inputArr = {2, 8, 18, 13, 1, 7, 16, 7, 0, 14, 202, 222};

        System.out.println(Arrays.toString(getDigit(inputArr)));
    }

    private static int[] getDigit(int[] inputArr) {
        Set<Integer> digit = new TreeSet<>();
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == 0) {
                digit.add(1);
                continue;
            }
            digit.add((int) (Math.log10(inputArr[i]) + 1));
        }

        int[] answer = new int[digit.size()];
        int idx = 0;
        for (Integer n : digit) {
            answer[idx++] = n;
        }
        return  answer;
    }
}
