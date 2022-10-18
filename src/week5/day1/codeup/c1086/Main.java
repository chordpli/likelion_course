package week5.day1.codeup.c1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.nextLine().charAt(0);

        for (int i = 97; i <= alphabet; i++) {
            System.out.print((char)i + " ");
        }
    }
}