package week3.day4.codeup.c1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("[" + (number/10000) * 10000 + "]");
        number = number%10000;
        System.out.println("[" + (number/1000) * 1000 + "]");
        number = number%1000;
        System.out.println("[" + (number/100) * 100 + "]");
        number = number%100;
        System.out.println("[" + (number/10) * 10 + "]");
        number = number%10;
        System.out.println("[" + (number/1) * 1+ "]");
        sc.close();
    }
}