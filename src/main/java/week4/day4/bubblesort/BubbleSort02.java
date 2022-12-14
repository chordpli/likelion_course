package week4.day4.bubblesort;

import java.util.Arrays;

public class BubbleSort02 {
    public static void main(String[] args) {
        BubbleSort02 bubbleSort = new BubbleSort02();
        int[] arr = {7, 2, 3, 9, 28, 11};

        int[] sort = bubbleSort.sort(arr, 0);
        // 오름차순 혹은 내림차순으로 정렬하는 알고리즘 구현
        System.out.println(Arrays.toString(sort));
    }

    public int[] sort(int[] arr, int i) {
        for (int j = i + 1; i < arr.length; i++) {
            if (arr[i] > arr[j]) {
                swap(arr, i, j);
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
