package week3.day5.codecup.c1033;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = Integer.toHexString(sc.nextInt()).toUpperCase();
        System.out.println(number);

        sc.close();
    }
}
