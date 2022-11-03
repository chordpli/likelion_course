package week7.day4.algorithm;

import java.util.Arrays;

public class Practice02 {

    public static void printNums(int[] nums, boolean[] checks) {
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) {
                System.out.printf("%d|", nums[i]);
                cnt++;
            }
        }
        System.out.println();
        System.out.println("size:"+cnt);
    }

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
        printNums(nums, checks);

        multipleof = 3;
        for (int i = 4; i < nums.length; i += 3) {
            checks[i] = false;
        }
        printNums(nums, checks);

        multipleof = 4;
        for (int i = 6; i < nums.length; i += 4) {
            checks[i] = false;
        }
        printNums(nums, checks);

        multipleof = 5;
        for (int i = 8; i < nums.length; i += 5) {
            checks[i] = false;
        }
        printNums(nums, checks);

        multipleof = 6;
        for (int i = 10; i < nums.length; i += 6) {
            checks[i] = false;
        }
        printNums(nums, checks);

        multipleof = 7;
        for (int i = 12; i < nums.length; i += 7) {
            checks[i] = false;
        }
        printNums(nums, checks);
    }
}
