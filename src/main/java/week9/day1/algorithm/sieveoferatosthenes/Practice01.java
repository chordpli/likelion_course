package week9.day1.algorithm.sieveoferatosthenes;

import java.util.Arrays;

public class Practice01 {

    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }

        for (int i = 0; i * i <= N; i++) {
            if (arr[i] != 0) {
                for (int j = i * 2 + 2; j < arr.length; j += arr[i]) {
                    arr[j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
