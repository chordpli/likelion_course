package week4.day3.codeup.c1054;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(b==1 && a==1? 1: 0);
        sc.close();
    }
}
