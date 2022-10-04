package week3.day2.CodeUp.even_odd_1156;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        try {
            if (input % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        } catch (Exception e) {
            System.out.println("숫자를 입력해주세요.");
        }
        sc.close();
    }
}