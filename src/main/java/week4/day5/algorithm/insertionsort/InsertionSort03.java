package week4.day5.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort03 {

    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
                if (arr[j] < arr[j - 1]) {
                    arr = swap(arr, j);
                }
            }
        }
        return arr;
    }

    public int[] swap(int[] arr, int j) {
        int tmp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort03 is = new InsertionSort03();
        arr = is.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
