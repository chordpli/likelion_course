package week4.day4.bubblesort;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        BubbleSort01 bubbleSort = new BubbleSort01();
        int[] arr = {7, 2, 3, 9, 28, 11};

        int[] sort = bubbleSort.sort(arr);
        // 오름차순 혹은 내림차순으로 정렬하는 알고리즘 구현
        System.out.println(Arrays.toString(sort));
    }

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i);
                }
        }
        return arr;
    }

    public int[] swap(int[] arr, int i) {
        int tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
        return arr;
    }
}
