package week3.day5.codecup.c1032;

import week3.day5.mdis.self.SoutDoSomething;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = Integer.toHexString(sc.nextInt());
        System.out.println(number);

        sc.close();
    }
}
