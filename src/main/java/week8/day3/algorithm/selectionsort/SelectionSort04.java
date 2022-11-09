package week8.day3.algorithm.selectionsort;

import java.util.Arrays;
import java.util.function.BiFunction;

public class SelectionSort04 {

    public int[] selectionSort(int[] arr, BiFunction<Integer, Integer, Boolean> stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if(stmt.apply(arr[minIdx], arr[j])) minIdx=j;
            }
            swap(arr, i, minIdx);
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 10, 233, 1, 111, 23, 3, 39};

        SelectionSort03 s = new SelectionSort03();

        s.selectionSort(arr, (a, b) -> a < b);
        s.selectionSort(arr, (a, b) -> a > b);

        //BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
    }

    public void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
