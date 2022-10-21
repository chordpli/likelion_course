package week4.day3.codeup.c1058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a==0 && b==0? 1: 0);
        sc.close();
    }
}
