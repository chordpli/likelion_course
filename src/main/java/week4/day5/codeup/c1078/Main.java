package week4.day5.codeup.c1078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tmp = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                tmp += i;
            }
        }
        System.out.println(tmp);
        sc.close();
    }
}
