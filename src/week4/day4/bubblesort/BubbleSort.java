package week4.day4.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {5, 7, 2, 3, 9, 28, 11, 21, 44, 1};

        int[] sort = bubbleSort.sort(arr);
        // 오름차순 혹은 내림차순으로 정렬하는 알고리즘 구현
        System.out.println(Arrays.toString(sort));
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1] > arr[j]) {
                    swap(arr, j);
                }
            }
        }
        return arr;
    }

    public int[] swap(int[] arr, int j) {
        int tmp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = tmp;
        return arr;
    }
}
