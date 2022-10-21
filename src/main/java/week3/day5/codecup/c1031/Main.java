package week3.day5.codecup.c1031;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number= Integer.toOctalString(sc.nextInt());
        System.out.println(number);

        sc.close();
    }
}
