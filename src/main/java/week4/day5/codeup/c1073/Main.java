package week4.day5.codeup.c1073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;

        while (a != 0) {
            a = sc.nextInt();
            if (a != 0) {
                System.out.println(a);
            }
        }

        sc.close();
    }
}