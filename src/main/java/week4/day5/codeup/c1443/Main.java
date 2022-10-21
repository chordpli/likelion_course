package week4.day5.codeup.c1443;

import java.util.Scanner;

public class Main {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr = swap(arr, j);
                }
            }
        }
        return arr;
    }

    public int[] swap(int[] arr, int i) {
        int tmp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = tmp;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        arr = main.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
