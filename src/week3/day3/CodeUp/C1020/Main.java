package week3.day3.CodeUp.C1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(input.substring(0,input.indexOf("-")) + input.substring(input.indexOf("-")+1));

        sc.close();
    }
}
