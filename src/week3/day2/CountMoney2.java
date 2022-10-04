package week3.day2;

import java.util.Scanner;

public class CountMoney2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 25000;
        int money50000 = 50000;
        int money10000 = 10000;
        int money5000 = 5000;
        int money1000 = 1000;
        int money500 = 500;
        int money100 = 100;
        int money50 = 50;
        int money10 = 10;

        System.out.println("50000원 " + (input / money50000) + "개");
        System.out.println("남은 돈 : " + input % money50000 + "원");

        sc.close();
    }
}
