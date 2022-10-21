package week3.day3.CodeUp.C1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int hour = Integer.parseInt(input.substring(0, input.indexOf(":")));
        int min = Integer.parseInt(input.substring(input.indexOf(":")+1));
        System.out.println(hour + ":" + min);

        sc.close();
    }
}
