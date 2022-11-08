package week8.day2.algorithm.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int targetNumber = sc.nextInt();

        int startIdx = 0;
        int endIdx = nums.length - 1;


        int findIdx = -1;
        // 중간값 찾기
        while (startIdx <= endIdx) {
            int midIdx = (endIdx + startIdx) / 2;
            int midValue = nums[midIdx];

            if (midValue > targetNumber) {
                endIdx = midIdx - 1;
            } else if (midValue < targetNumber) {
                startIdx = midIdx + 1;
            } else {
                System.out.println(midIdx);
                break;
            }
        }
    }
}
