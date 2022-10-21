package week5.day2.codeup.c1095;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] countArr = new int[a];

        for (int i = 0; i < a; i++) {
            int number = sc.nextInt();
            countArr[i] = number;
        }

        int min = countArr[0];

        for (int i = 0; i < a; i++) {
            if (min > countArr[i]) {
                min = countArr[i];
            }
        }
        System.out.println(min);
        sc.close();

    }
}