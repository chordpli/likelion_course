package week8.day2.algorithm.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNumber = sc.nextInt();
        int startIdx = 0;
        int lastIdx = nums.length;

        int findIdx = -1;
        // 중간값 찾기

        for (int i = startIdx; i < lastIdx;) {
            if (nums[lastIdx/2] == targetNumber) {
                findIdx = lastIdx/2;
                break;
            } else if (nums[lastIdx / 2] > targetNumber) {
                lastIdx /= 2;
            } else{
                startIdx = lastIdx / 2;
            }
        }

        System.out.println(findIdx);
    }
}
