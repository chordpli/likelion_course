package week9.day3.algorithm.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice01 {

    public int[] quickSort(int[] arr) {
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 60, 5, 19, 40, 50, 5, 45};

        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        while (arr[leftIdx] < pivot) {

            if (arr[leftIdx] > pivot) {
                while(arr[rightIdx]>pivot) {
                    rightIdx-=1;
                }
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;

                leftIdx += 1;
                rightIdx -= 1;

                continue;
            }
            leftIdx += 1;
        }
        System.out.println(Arrays.toString(arr));
    }


}
