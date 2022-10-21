package week5.day1.codeup.c1087;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tmp = 0;
        for (int i = 1; ; i++) {
            if (tmp == a) {
                System.out.println(tmp);
                break;
            }else if (tmp+i > a) {
                System.out.println(tmp+i);
                break;
            }
            tmp += i;
        }
        sc.close();
    }
}
