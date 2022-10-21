package week4.day3.codeup.c2081;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int idx = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx+1);

        sc.close();
    }
}
