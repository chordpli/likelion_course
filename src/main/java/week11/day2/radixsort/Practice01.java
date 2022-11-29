package week11.day2.radixsort;

import java.util.Arrays;

public class Practice01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int[] inputArr = {7, 4, 5, 9, 1, 0};
        Arrays.fill(arr, -1);

        for (int i : inputArr) {
            arr[i] = i;
        }

        System.out.println(Arrays.toString(arr));
    }
}
