package week4.day3.codeup.c4596;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        String idx = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    idx = (i + 1) + " " + (j + 1);
                }
            }
        }
        System.out.println(max);
        System.out.println(idx);
        sc.close();
    }
}
