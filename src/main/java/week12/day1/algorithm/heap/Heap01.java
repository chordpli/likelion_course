package week12.day1.algorithm.heap;

import java.util.Arrays;

public class Heap01 {

    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 8};

        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        System.out.println(Arrays.toString(arr));

        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
