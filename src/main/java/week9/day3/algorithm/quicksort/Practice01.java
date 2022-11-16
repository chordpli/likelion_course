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
        var arr = new int[]{20, 18, 5, 19, 25, 5, 50, 40};

        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;
        while (arr[leftIdx] < pivot) {
            if (pivot > arr[leftIdx]) {
                leftIdx += 1;
            }

            /*if (leftIdx <= arr[rightIdx]) {
                int temp = leftIdx;
                leftIdx = rightIdx;
                rightIdx = temp;
            }

            if (arr[leftIdx] > arr[rightIdx] ) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;

                leftIdx += 1;
                rightIdx -= 1;
            }*/
        }
        System.out.println(Arrays.toString(arr));
    }


}
