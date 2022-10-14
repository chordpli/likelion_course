package week4.day5.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr = swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public int[] swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort is = new InsertionSort();
        arr = is.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
