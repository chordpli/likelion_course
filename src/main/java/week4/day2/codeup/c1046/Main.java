package week4.day2.codeup.c1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);
        System.out.printf("%.1f",(float)(a + b + c) / 3);

        sc.close();
    }
}