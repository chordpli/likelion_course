package week11.day2.radixsort;

import java.util.Arrays;

public class Practice01 {
    public static void main(String[] args) {
        int[] inputArr = {7, 4, 5, 9, 1, 0};
        int[] arr = sort(inputArr);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] sort(int[] inputArr) {
        int[] arr = new int[Arrays.stream(inputArr).max().getAsInt()+1];
        Arrays.fill(arr, -1);

        for (int i : inputArr) {
            arr[i] = i;
        }
        return arr;
    }
}
