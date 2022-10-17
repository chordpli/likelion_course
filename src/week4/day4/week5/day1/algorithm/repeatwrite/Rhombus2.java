package week4.day4.week5.day1.algorithm.repeatwrite;

import java.util.Scanner;

public class Rhombus2 {

    public void drawRhombus() {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = count-1; i >= 0; i--) {
            for (int j = 0; j < count - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Rhombus2 rb = new Rhombus2();
        rb.drawRhombus();
    }
}
