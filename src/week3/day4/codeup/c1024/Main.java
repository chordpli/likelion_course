package week3.day4.codeup.c1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String[] wordArr = word.split("");

        for(String s : wordArr){
            System.out.println("'" + s + "'");
        }

        sc.close();
    }
}
