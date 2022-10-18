package week5.day2.codeup.c1094;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] countArr = new int[a];

        for (int i = 0; i < countArr.length; i++) {
            int number = sc.nextInt();
            countArr[i] = number;
        }

        for (int i = countArr.length-1; i >= 0; i--){
            System.out.print(countArr[i] + " ");
        }
        sc.close();
    }
}

