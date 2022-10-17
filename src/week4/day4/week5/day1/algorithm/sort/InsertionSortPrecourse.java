package week4.day4.week5.day1.algorithm.sort;

import java.util.Arrays;

public class InsertionSortPrecourse {
    public int[] sort(int[] arr) {
        int idx;
        for (int i = 1; i < arr.length; i++) {
            idx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                    i--;
                }else{
                    break;
                }
            }
            i = idx;
        }
        return arr;
    }

    public int[] sort2(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int temp = arr[index];
            int prev = index-1;
            while ((prev >= 0) && (arr[prev] > temp)) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
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
        InsertionSortPrecourse isp = new InsertionSortPrecourse();

        arr = isp.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
