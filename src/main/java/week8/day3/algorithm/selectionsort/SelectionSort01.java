package week8.day3.algorithm.selectionsort;

import java.util.Arrays;

public class SelectionSort01 {

    public static void main(String[] args) {

        int[] arr = {2, 7, 4, 9, 10, 233, 1, 111, 23, 3, 39};

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                min = getMin(arr, min, j);
            }
            swap(arr, i, min);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    private static int getMin(int[] arr, int min, int j) {
        if (arr[min] > arr[j]) {
            min = j;
        }
        return min;
    }

}
