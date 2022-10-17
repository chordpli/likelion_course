package week5.day1.algorithm.repeatwrite;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            for (int j = 1; j < count-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
