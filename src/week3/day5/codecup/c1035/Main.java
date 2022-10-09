package week3.day5.codecup.c1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.valueOf(sc.nextLine(), 16);
        String to8 = Integer.toOctalString(number);

        System.out.println(to8);

        sc.close();
    }
}
