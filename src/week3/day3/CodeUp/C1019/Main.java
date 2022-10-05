package week3.day3.CodeUp.C1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] date = input.split("\\.");

        System.out.print(checkYear(date[0]) + "." + check(date[1]) + "." + check(date[2]));

        sc.close();
    }

    public static String check(String input) {
        if (input.length() == 1) {
            return "0" + input;
        } else {
            return input;
        }
    }

    public static String checkYear(String input) {
        if (input.length() == 2) {
            return "00" + input;
        } else {
            return input;
        }
    }
}
