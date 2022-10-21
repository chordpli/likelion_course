package week4.day4.bubblesort;

import java.util.Arrays;

public class BubbleSort03 {
    public static void main(String[] args) {
        BubbleSort03 bubbleSort = new BubbleSort03();
        int[] arr = {5, 7, 2, 3, 9, 28, 11, 21, 44, 1};

        int[] sort = bubbleSort.sort(arr);
        // 오름차순 혹은 내림차순으로 정렬하는 알고리즘 구현
        System.out.println(Arrays.toString(sort));
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
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
}
