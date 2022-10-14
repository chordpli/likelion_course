package week4.day5.algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort99 {

    public int[] sort(int[] arr, int i) {

        if(i == arr.length) return  arr;
        for (int j = i; j > 0; j--) {
            System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
            if (arr[j] < arr[j - 1]) {
                arr = swap(arr, j);
            }
        }

        return  sort(arr, i+1);
    }

    public int[] swap(int[] arr, int j) {
        int tmp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort99 is = new InsertionSort99();
        arr = is.sort(arr,1);

        System.out.println(Arrays.toString(arr));
    }
}
