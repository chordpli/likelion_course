package week4.day5.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int tmp = i;
            while (i != 0) {
                if (arr[i] < arr[i - 1]) {
                    arr = swap(arr, i);
                }
                i--;
            }
            i = tmp;
        }
        return arr;
    }

    public int[] swap(int[] arr, int i) {
        int tmp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort is = new InsertionSort();
        arr = is.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
