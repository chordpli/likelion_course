package week3.day4.codeup.c1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        String num = String.valueOf(input).substring(0, String.valueOf(input).indexOf("."));
        String num2 = String.valueOf(input).substring(String.valueOf(input).indexOf(".")+1);
        System.out.println(num);
        System.out.println(num2);

        sc.close();
    }
}
