package week3.day4.codeup.c1027;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] splitDate = date.split("\\.");
        System.out.println(splitDate[2] + "-" + splitDate[1] + "-" + splitDate[0]);
        sc.close();
    }
}
