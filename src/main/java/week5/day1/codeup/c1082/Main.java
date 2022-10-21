package week5.day1.codeup.c1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(16);
        for (int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", n, i, n * i);
        }


        sc.close();
    }
}
