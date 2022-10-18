package week5.day2.codeup.c1093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] countArr = new int[23];

        for (int i = 0; i < a; i++) {
            int number = sc.nextInt();
            countArr[number-1] += 1;
        }

        for (int i : countArr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}