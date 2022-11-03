package week7.day4.algorithm;

import java.util.Arrays;

public class Practice02 {
    public static void main(String[] args) {
        int N = 50;
        int[] nums = new int [N - 1]; // 2~50까지 총 49개

        boolean[] checks = new boolean[nums.length]; // nums 만큼 checks
        Arrays.fill(checks,true); // checks를 true초기화

        for (int i = 0; i <nums.length ; i++) {
            nums[i] = i + 2;
        }

        // 2의 배수 지우기
        int multipleof =2;
        for (int i = 2; i < nums.length; i += 2) {
            checks[i] = false;
        }

    }
}
