package week4.codeup.c1620;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        while (result >= 10) {
            result = (result / 10) + (result % 10);
        }
        System.out.println(result);
        sc.close();
    }
}
